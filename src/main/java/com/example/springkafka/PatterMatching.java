package com.example.springkafka;

import static org.mockito.Matchers.matches;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatching {

	public static void main(String[] args) {
		
		Pattern  pattern = Pattern.compile("^[a-zA-ZÀ-ž0-9]+((?:[\\s\\'\\-\\.\\,])[a-zA-ZÀ-ž0-9]+)*([\\s\\'\\-\\.\\,])?$",Pattern.UNICODE_CHARACTER_CLASS);
	    String textToMatch = "Métivi\\e\r,Ferland";
	    
	    
	    Matcher matcher = pattern.matcher(textToMatch);
	    System.out.println(matcher.matches());
	
	}
}
