package model.expressions;

import java.util.*;

import model.Parser;
import model.RGBColor;


public class MullExp extends ParenExpression {

	public String myCommand = "mul"; 
	public static int numOfOperands = 2;
	
	public MullExp(ArrayList<Expression> myList) {
		super(myList);  
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return multiply(getOperands().get(0).evaluate(myMap), getOperands().get(1).evaluate(myMap));	
		}

	
	public static RGBColor multiply (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() * right.getRed(), 
                            left.getGreen() * right.getGreen(),
                            left.getBlue() * right.getBlue());
    }
}
