package model.expressions;

import java.util.ArrayList;
import java.util.Map;

import model.Parser;
import model.RGBColor;


public class ExponentExp extends ParenExpression{
	
	public String myCommand = "exp";
	public static int numOfOperands = 2;
	
	public ExponentExp(ArrayList<Expression> myList) {
		super(myList); 
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return exponent(getOperands().get(0).evaluate(myMap), getOperands().get(1).evaluate(myMap));
	}
	
	public static RGBColor exponent (RGBColor left, RGBColor right)
    {
        return new RGBColor(Math.pow(left.getRed(),right.getRed()), 
        					Math.pow(left.getGreen(),right.getGreen()),
        					Math.pow(left.getBlue(),right.getBlue()));
    }


}
