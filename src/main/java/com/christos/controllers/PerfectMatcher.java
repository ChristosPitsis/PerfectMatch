package com.christos.controllers;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.christos.beans.GenderApi;
import com.christos.beans.Numberizer;
import com.christos.beans.PerfectMatch;
import com.christos.beans.reqNumMatcher;
import com.christos.beans.respNumMatcher;
import com.christos.config.ApplicationConfig;
import com.christos.errorHandling.GenericException;
import com.christos.main.Application;

@RestController
public class PerfectMatcher {

	@Autowired
    private ApplicationConfig myConfig;
	
	private static Logger logger = LoggerFactory.getLogger(Application.class);
	
	@RequestMapping(value = "/match", method = RequestMethod.GET,
    		produces = { "application/json", "application/xml" })
    public PerfectMatch reqPerfectMatch(@RequestParam(value="name", required=true) String name) {

		logger.info("########## Request Start ##########");
		// Initialize RestTemplate
		RestTemplate restTemplate = new RestTemplate();
		
		logger.info("Check if name " + name + " is Male...");
		
		String gender = "";
		try {
			GenderApi checkName = restTemplate.getForObject(
				"http://localhost/test_gender_api_christos.json", GenderApi.class);
			gender = checkName.getGender();
		} catch (Exception ex) {
			logger.info("Could not reach GenderAPI to validate name");
			throw new GenericException("Validation Failed");
		}
		
		if (!gender.equalsIgnoreCase("Male")) {
			logger.info(name + " is not a Male name");
			throw new GenericException(name + " is a " + gender + " name");
		}
		logger.info(name + " is a Male name");
		
		// Call Numberizer to retrieve number
		int number = 0;
		try {
			//url + "?name=" + name -- "http://localhost/reqNumberizer.json"
			
			String url = myConfig.getHelperWSConf().getBaseUrl() + myConfig.getHelperWSConf().getNumberizer();
			Numberizer nameNum = restTemplate.getForObject(
					url + "?name=" + name, Numberizer.class);
			number = nameNum.getNum();
			logger.info("Numberizer Response: " + nameNum.toString());
		} catch (Exception ex) {
			logger.info("Could not reach Numberizer to calculate the number for " + name);
			logger.info("Threw Exception: " + ex);
			throw new GenericException("Numberizer Call Failed");
		}
		
		// Call NumMatcher to retrieve a Female name
		String female = "";
		try {
			//respNumMatcher numMatch = restTemplate.getForObject(
			//	"http://localhost:8081/NumMatcher", respNumMatcher.class);
			//respNumMatcher numMatch = restTemplate.getForObject(url, responseType, uriVariables)
			String url = myConfig.getHelperWSConf().getBaseUrl() + myConfig.getHelperWSConf().getNumMatcher();
			HttpHeaders headers = new HttpHeaders();
	        reqNumMatcher request = new reqNumMatcher(name,number);
	        respNumMatcher numMatch = restTemplate.postForObject(url, request, respNumMatcher.class);
			female = numMatch.getFemale();
			logger.info("NumMatcher Response: " + numMatch.toString());
		} catch (Exception ex) {
			logger.info("Could not reach NumMatcher to match number " + number + " for " + name);
			logger.info("Exception: " + ex);
			throw new GenericException("NumMatcher Call Failed");
		}
		
    	PerfectMatch match = new PerfectMatch(name,female,number);
    	logger.info("Returning PerfectMatch: " + match.toString());
    	logger.info("########## Request End ##########");

        return match;
    }
}
