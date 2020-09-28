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
	public static void validateEmail() {
		String email = sc.next();
		
		String pattern_email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern2 = Pattern.compile(pattern_email);
		Matcher matches2 = pattern2.matcher(email);
		if(matches2.matches())
			System.out.println("Valid Email Address");
		else
			System.out.println("Invalid Email Address");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration. ");
		System.out.println("Enter first name :");
		validatefName();
		System.out.println("Enter last name :");
		validatelName();
		System.out.println("Enter E-mail address ");
		validateEmail();
		
		sc.close();
	}

}
