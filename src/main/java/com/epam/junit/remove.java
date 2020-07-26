package com.epam.junit;

public class remove {
	public String removing(String actual)
	{
	String result=actual;
	if(actual.length()!=0) {
	if(result.charAt(0)=='A' && result.charAt(1)=='A')
	result=result.substring(2);
	else if(result.charAt(0)=='A')
	result=result.substring(1);
	else if(result.charAt(1)=='A')
	result=result.charAt(0)+result.substring(2);
	}
	return result;
	}
}
