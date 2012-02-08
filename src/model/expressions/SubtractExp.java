package model.expressions;

import java.util.ArrayList;
import java.util.Map;

import model.Parser;
import model.RGBColor;


public class SubtractExp extends ParenExpression{

	private String myCommand = "minus";
	private static int numOfOperands = 2; 
	
	public SubtractExp(ArrayList<Expression> myList) { 
		super(myList); 
	}
	
	public String getCommand(){
		return myCommand; 
	}
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		return subtract(getOperands().get(0).evaluate(myMap), getOperands().get(1).evaluate(myMap));	
		}
	
	public static RGBColor subtract (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() - right.getRed(), 
                            left.getGreen() - right.getGreen(),
                            left.getBlue() - right.getBlue());
    }

}
