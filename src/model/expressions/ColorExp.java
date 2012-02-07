package model.expressions;

import java.util.ArrayList;
import java.util.Map;

import model.Parser;
import model.RGBColor;


public class ColorExp extends ParenExpression {

	public String myCommand = "color";
	public static int numOfOperands = 3;

	public ColorExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return color(getOperands().get(0).evaluate(myMap),
		        getOperands().get(1).evaluate(myMap), getOperands().get(2)
		                .evaluate(myMap));
	}
	
	public static RGBColor color (RGBColor red, RGBColor green, RGBColor blue)
    {
        return new RGBColor(red.getRed(), green.getGreen(), blue.getBlue());
    }

}
