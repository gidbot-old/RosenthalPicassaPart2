package model.expressions;

import java.util.ArrayList;
import java.util.Map;

import model.Parser;
import model.RGBColor;


public class NegExp extends ParenExpression{
	
	public String myCommand;
	public static int numOfOperands = 1;
	
	public NegExp(ArrayList<Expression> myList) {
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return negate(getOperands().get(0).evaluate(myMap));
	}
	
	public static RGBColor negate (RGBColor toNegate)
    {
        return new RGBColor(toNegate.getRed()*-1, 
        					toNegate.getGreen()*-1,
        					toNegate.getBlue()*-1);
    }
	

}
