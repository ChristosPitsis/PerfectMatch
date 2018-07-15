package com.christos.beans;

public class GenderApiConf {

	private String baseUrl;
	private String nameOnlyReq;
	private String apiKey;
	
	public GenderApiConf() {
		super();
	}
	
	public GenderApiConf(String baseUrl, String nameOnlyReq, String apiKey) {
		super();
		this.baseUrl = baseUrl;
		this.nameOnlyReq = nameOnlyReq;
		this.apiKey = apiKey;
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}
	
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	public String getNameOnlyReq() {
		return nameOnlyReq;
	}
	
	public void setNameOnlyReq(String nameOnlyReq) {
		this.nameOnlyReq = nameOnlyReq;
	}
	
	public String getApiKey() {
		return apiKey;
	}
	
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	
	@Override
	public String toString() {
		return "GenderApiConf [baseUrl=" + baseUrl + ", nameOnlyReq=" + nameOnlyReq + ", apiKey=" + apiKey + "]";
	}
}
