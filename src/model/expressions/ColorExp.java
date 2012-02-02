package model.expressions;

import java.util.ArrayList;

import model.Parser;
import model.RGBColor;
import model.util.ColorCombinations;

public class ColorExp extends ParenExpression {

	public String myCommand = "color";
	public static int numOfOperands = 3;

	public ColorExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		return color(getOperands().get(0).evaluate(x, y),
		        getOperands().get(1).evaluate(x, y), getOperands().get(2)
		                .evaluate(x, y));
	}
	
	public static RGBColor color (RGBColor red, RGBColor green, RGBColor blue)
    {
        return new RGBColor(red.getRed(), green.getGreen(), blue.getBlue());
    }

}
