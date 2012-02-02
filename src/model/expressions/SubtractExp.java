package model.expressions;

import java.util.ArrayList;

import model.Parser;
import model.RGBColor;
import model.util.ColorCombinations;

public class SubtractExp extends ParenExpression{

	private String myCommand = "minus";
	private static int numOfOperands = 2; 
	
	public SubtractExp(ArrayList<Expression> myList) { 
		super(myList); 
	}
	@Override
	public RGBColor evaluate(double x, double y) {
		return subtract(getOperands().get(0).evaluate(x, y), getOperands().get(1).evaluate(x, y));	}
	
	public static RGBColor subtract (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() - right.getRed(), 
                            left.getGreen() - right.getGreen(),
                            left.getBlue() - right.getBlue());
    }

}
