package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;


public class MaxExp extends ParenExpression{

	
	public static String myCommand = "max";
	public static int numOfOperands; 
	 
	
	public MaxExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand;
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		RGBColor max = new RGBColor(getOperands().get(0).evaluate(myMap));
		
		for (Expression currentColor: myList){
			RGBColor tempColor = currentColor.evaluate(myMap); 
			if (max.compareTo(tempColor) == -1){
				max = tempColor;  
			}
			
		}
		
		return max; 
	
	
	}

}
