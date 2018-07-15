package com.christos.beans;

/* {"name":"christos",
"name_sanitized": "Christos",
	"country":"",
	"gender":"male",
	"samples":3820,
	"accuracy":99,
	"duration":"22ms",
	"credits_used":1}*/

public class GenderApi {
	
	private String name;
	private String name_sanitized;
	private String country;
	private String gender;
	private String samples;
	private String accuracy;
	private String duration;
	private String credits_used;
	
	public GenderApi() {
		super();
	}

	public GenderApi(String name, String name_sanitized, String country, String gender, String samples, String accuracy,
			String duration, String credits_used) {
		super();
		this.name = name;
		this.name_sanitized = name_sanitized;
		this.country = country;
		this.gender = gender;
		this.samples = samples;
		this.accuracy = accuracy;
		this.duration = duration;
		this.credits_used = credits_used;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName_sanitized() {
		return name_sanitized;
	}
	
	public void setName_sanitized(String name_sanitized) {
		this.name_sanitized = name_sanitized;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getSamples() {
		return samples;
	}
	
	public void setSamples(String samples) {
		this.samples = samples;
	}
	
	public String getAccuracy() {
		return accuracy;
	}
	
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String getCredits_used() {
		return credits_used;
	}
	
	public void setCredits_used(String credits_used) {
		this.credits_used = credits_used;
	}
	
	@Override
	public String toString() {
		return "GenderApi [name=" + name + ", name_sanitized=" + name_sanitized + ", country=" + country + ", gender="
				+ gender + ", samples=" + samples + ", accuracy=" + accuracy + ", duration=" + duration
				+ ", credits_used=" + credits_used + "]";
	}
}
