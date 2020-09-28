package com.capgemini.validation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
	static Scanner sc = new Scanner(System.in);
	
	public static void validatefName(){
		String fName = sc.next();
		
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(fName);
		if(matcher.matches())
			System.out.println("Valid First Name");
		else
			System.out.println("Invalid First Name");
		
	}
	
	public static void validatelName(){
		String lName = sc.next();
		
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(lName);
		if(matcher.matches())
			System.out.println("Valid Last Name");
		else
			System.out.println("Invalid Last Name");

	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration. ");
		System.out.println("Enter first name :");
		validatefName();
		System.out.println("Enter last name :");
		validatelName();
		
		sc.close();
	}

}
