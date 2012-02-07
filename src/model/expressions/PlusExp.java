package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;


public class PlusExp extends ParenExpression{

	
	public static String myCommand = "plus";
	public static int numOfOperands = 2; 
	
	public PlusExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand;
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		return this.add(getOperands().get(0).evaluate(myMap), getOperands().get(1).evaluate(myMap));
	}
	
	private RGBColor add (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() + right.getRed(), 
                            left.getGreen() + right.getGreen(),
                            left.getBlue() + right.getBlue());
    }



	

	

}
