package model.expressions;

import java.util.*;

import model.Parser;
import model.RGBColor;
import model.util.ColorCombinations;

public class MullExp extends ParenExpression {

	public String myCommand = "mul"; 
	public static int numOfOperands = 2;
	
	public MullExp(ArrayList<Expression> myList) {
		super(myList);  
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		return multiply(getOperands().get(0).evaluate(x, y), getOperands().get(1).evaluate(x, y));	}

	
	public static RGBColor multiply (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() * right.getRed(), 
                            left.getGreen() * right.getGreen(),
                            left.getBlue() * right.getBlue());
    }
}
