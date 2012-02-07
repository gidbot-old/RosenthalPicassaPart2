package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;


public class SumExp extends ParenExpression{

	
	public static String myCommand = "Sum";
	public static int numOfOperands; 
	
	public SumExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand;
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		RGBColor mySum = new RGBColor(getOperands().get(0).evaluate(myMap));
		for (Expression currentColor: myList){
			mySum = add(mySum, currentColor.evaluate(myMap)); 
		}
		
		return mySum; 
	
	
	}
	private RGBColor add (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() + right.getRed(), 
                            left.getGreen() + right.getGreen(),
                            left.getBlue() + right.getBlue());
    }



}
