package com.stackroute.datamunger.query;

//this class contains the data type definitions
public class DataTypeDefinitions {

	/*
	 * this class should contain a member variable which is a String array, to hold
	 * the data type for all columns for all data types
	 */
	public String[] DataTypes;
//
//	public static void main(String[] args) {
//		DataTypeDefinitions d = new DataTypeDefinitions();
//		d.getDataTypes();
//	}

	public DataTypeDefinitions(String[] dataTypes) {
		super();
		DataTypes = dataTypes;
	}

	public String[] getDataTypes() {
		return this.DataTypes;
	}
}
