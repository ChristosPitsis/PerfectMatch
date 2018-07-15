package com.christos.beans;

public class HelperWSConf {

	private String baseUrl;
	private String numberizer;
	private String numMatcher;
	
	public HelperWSConf() {
		super();
	}
	
	public HelperWSConf(String baseUrl, String numberizer, String numMatcher) {
		super();
		this.baseUrl = baseUrl;
		this.numberizer = numberizer;
		this.numMatcher = numMatcher;
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}
	
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	public String getNumberizer() {
		return numberizer;
	}
	
	public void setNumberizer(String numberizer) {
		this.numberizer = numberizer;
	}
	
	public String getNumMatcher() {
		return numMatcher;
	}
	
	public void setNumMatcher(String numMatcher) {
		this.numMatcher = numMatcher;
	}
	
	@Override
	public String toString() {
		return "HelperWSConf [baseUrl=" + baseUrl + ", numberizer=" + numberizer + ", numMatcher=" + numMatcher + "]";
	}
}
