package com.stackroute.datamunger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.stackroute.datamunger.query.DataTypeDefinitions;
import com.stackroute.datamunger.query.Header;
import com.stackroute.datamunger.reader.CsvQueryProcessor;

public class DataMunger {

	public static void main(String[] args) {

		// read the file name from the user
Scanner sc=new Scanner(System.in);
String ag=sc.next();
		/*
		 * create object of CsvQueryProcessor. We are trying to read from a file inside
		 * the constructor of this class. Hence, we will have to handle exceptions.
		 */
		try {
			System.out.println("tata");
		CsvQueryProcessor csv=new CsvQueryProcessor(ag);
		System.out.println("tata");
		/*
		 * call getHeader() method of CsvQueryProcessor class to retrieve the array of
		 * headers
		 */
csv.getHeader();
System.out.println("tata");
		/*
		 * call getColumnType() method of CsvQueryProcessor class to retrieve the array
		 * of column data types which is actually the object of DataTypeDefinitions
		 * class
		 */
csv.getColumnType();
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}

		catch(IOException e) {
			System.out.println("file not found");
		}
		/*
		 * display the columnName from the header object along with its data type from
		 * DataTypeDefinitions object
		 */

	}

}
