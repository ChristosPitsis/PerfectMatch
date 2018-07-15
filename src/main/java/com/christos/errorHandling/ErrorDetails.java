package com.christos.errorHandling;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"datetime", "message", "details"})
public class ErrorDetails {

	final DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	  private Date datetime;
	  private String message;
	  private String details;
	  
	  public ErrorDetails() {
		super();
	  }

	public ErrorDetails(Date timestamp, String message, String details) {
	    super();
	    this.datetime = timestamp;
	    this.message = message;
	    this.details = details;
	  }
	  
	  @XmlElement(name="DateTime")
	  public String getDatetime() {
		return formatter.format(datetime);
	  }

	  @XmlElement(name="debugMessage")
	  public String getMessage() {
		return message;
	  }

	  @XmlElement(name="Details")
	  public String getDetails() {
		return details;
	  }
}