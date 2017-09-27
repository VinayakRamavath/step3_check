package com.stackroute.datamunger.query;

//header class
public class Header {

	public String[] Headers;
	/*
	 * this class should contain a member variable which is a String array, to hold
	 * the headers.
	 */
	
	public String[] getHeaders(){
		return this.Headers;
	}

	public Header(String[] headers) {
		super();
		Headers = headers;
	}

}
