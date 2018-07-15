package com.christos.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.christos.beans.GenderApiConf;
import com.christos.beans.HelperWSConf;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class ApplicationConfig {

	private String name;
	private String environment;
	private GenderApiConf genderApiConf;
	private HelperWSConf helperWSConf;
	
	public ApplicationConfig() {
		super();
	}
	
	public ApplicationConfig(String name, String environment, GenderApiConf genderApiConf, HelperWSConf helperWSConf) {
		super();
		this.name = name;
		this.environment = environment;
		this.genderApiConf = genderApiConf;
		this.helperWSConf = helperWSConf;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEnvironment() {
		return environment;
	}
	
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	public GenderApiConf getGenderApiConf() {
		return genderApiConf;
	}
	
	public void setGenderApiConf(GenderApiConf genderApiConf) {
		this.genderApiConf = genderApiConf;
	}

	public HelperWSConf getHelperWSConf() {
		return helperWSConf;
	}

	public void setHelperWSConf(HelperWSConf helperWSConf) {
		this.helperWSConf = helperWSConf;
	}

	@Override
	public String toString() {
		return "ApplicationConfig [name=" + name + ", environment=" + environment + ", genderApiConf=" + genderApiConf
				+ ", helperWSConf=" + helperWSConf + "]";
	}
}