package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;


public class MinExp extends ParenExpression{

	
	public static String myCommand = "min";
	public static int numOfOperands; 
	 
	
	public MinExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand;
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		RGBColor min = new RGBColor(getOperands().get(0).evaluate(myMap));
		
		for (Expression currentColor: myList){
			RGBColor tempColor = currentColor.evaluate(myMap); 
			if (min.compareTo(tempColor) == 1){
				min = tempColor;  
			}
			
		}
		
		return min; 
	
	
	}

}
