package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;
import model.util.ColorCombinations;

public class ClampExp extends ParenExpression{

	public static String myCommand = "plus";
	public static int numOfOperands = 2; 
	
	public ClampExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand;
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		return this.clamp(getOperands().get(0).evaluate(myMap));
	}
	
	private RGBColor clamp (RGBColor toClamp)
    {
        toClamp.clamp();
        return toClamp; 
    }


	

}
