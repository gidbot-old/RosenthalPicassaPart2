package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;


public class FromLumChromExp extends ParenExpression{

	
	public static String myCommand = "ycrcbtorgb";
	public static int numOfOperands = 1; 
	
	public FromLumChromExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand.toLowerCase();
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		return ycrcb2rgb(getOperands().get(0).evaluate(myMap));
	}
	
	 public static RGBColor ycrcb2rgb (RGBColor c)
	    {
	        return new RGBColor(
	                    c.getRed() + c.getBlue() *  1.4022,
	                    c.getRed() + c.getGreen() * -0.3456 + c.getBlue() * -0.7145,
	                    c.getRed() + c.getGreen() *  1.7710);
	    }
	

}
