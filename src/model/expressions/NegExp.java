package model.expressions;

import java.util.ArrayList;

import model.Parser;
import model.RGBColor;
import model.util.ColorCombinations;

public class NegExp extends ParenExpression{
	
	public String myCommand;
	public static int numOfOperands = 1;
	
	public NegExp(ArrayList<Expression> myList) {
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		return negate(getOperands().get(0).evaluate(x, y));
	}
	
	public static RGBColor negate (RGBColor toNegate)
    {
        return new RGBColor(toNegate.getRed()*-1, 
        					toNegate.getGreen()*-1,
        					toNegate.getBlue()*-1);
    }
	

}
