package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;


public class IfExp extends ParenExpression{

	
	public static String myCommand = "if";
	public static int numOfOperands; 
	 
	
	public IfExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand;
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
	
		RGBColor myZero = new RGBColor();
		RGBColor myFirst = new RGBColor(getOperands().get(0).evaluate(myMap)); 
		RGBColor mySecond = new RGBColor(getOperands().get(1).evaluate(myMap));
		RGBColor myThird = new RGBColor(getOperands().get(2).evaluate(myMap)); 
		
		if (myFirst.compareTo(myZero) == 1){
				return mySecond;  
			}
			

		return myThird; 
	
	
	}

}
