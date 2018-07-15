package com.christos.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.christos.config.ApplicationConfig;

@SpringBootApplication(scanBasePackages = {"com.christos"})
public class Application {
	
	@Autowired
    private ApplicationConfig myConfig;
	
	private static Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

        	logger.info("########## Initialize Configs ##########");
        	logger.info("using environment: " + myConfig.getEnvironment());
        	logger.info("Gender API Base URL: " + myConfig.getGenderApiConf().getBaseUrl());
        	logger.info("Gender API request: " + myConfig.getGenderApiConf().getNameOnlyReq());
        	logger.info("Gender API KEY: " + myConfig.getGenderApiConf().getApiKey());
        	logger.info("Helper WS URL: " + myConfig.getHelperWSConf().getBaseUrl());
        	logger.info("Numberizer handler: " + myConfig.getHelperWSConf().getNumberizer());
        	logger.info("NumMatcher handler: " + myConfig.getHelperWSConf().getNumMatcher());
        	logger.info("########################################");
        };
    }
}