package model.expressions;

import java.util.Map;

import model.ParserException;
import model.RGBColor;

public class VariableExp extends Expression{

	private String myString; 
	public static int numOfOperands = 1;
	
	public VariableExp (String toSet){
		myString = toSet; 
	}
	
	public String getMyString(){
		return myString; 
	}
	
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
    	if (myMap.containsKey(myString)){
    		return myMap.get(myString); 
    	}
    	else {
    		throw new ParserException("Unexpected variable " + myString); }
                

	}


}
