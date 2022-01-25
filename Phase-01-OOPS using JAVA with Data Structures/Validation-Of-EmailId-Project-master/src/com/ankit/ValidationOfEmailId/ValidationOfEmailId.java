package com.ankit.ValidationOfEmailId;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import java.util.*;
	  
	public class ValidationOfEmailId {
	    public static boolean isValid(String email)
	    {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
	                            "[a-zA-Z0-9_+&*-]+)*@" +
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                            "A-Z]{2,7}$";
	                              
	        Pattern pat = Pattern.compile(emailRegex);
	        if (email == null)
	            return false;
	        return pat.matcher(email).matches();
	    }
	  
	    public static void main(String[] args)
	    {
	        ArrayList<String> address = new ArrayList<>();
	            
	          address.add("ankit.kumar@Learn.com");
	          address.add("rishi_kumar@Learn.com");
	          //address.add("tushar.kumarLearn.com");
	          //address.add("mukesh.kumarLearn.comm");
	        for(String i : address){
	            if (isValid(i))
	                System.out.println(i + " - Valid");
	            else
	                System.out.println(i + " - Not Valid");
	        }
	    }
	}
