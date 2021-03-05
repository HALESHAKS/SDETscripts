package Calender;

import java.util.Date;

public class Currentdate {

	public static void main(String[] args) {
Date dateobj = new Date();	
String currentsysdate = dateobj.toString();
String[] arr = currentsysdate.split(" ");
	
	String date = arr[2];
	String year = arr[5];
	int month = dateobj.getMonth();

System.out.println(date+" "+month+" "+year);

	}}
