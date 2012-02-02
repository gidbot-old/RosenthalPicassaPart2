package model.expressions;

import java.util.ArrayList;

import model.RGBColor;
import model.util.ColorCombinations;

public class AbsExp extends ParenExpression {

	public String myCommand = "abs";
	public static int numOfOperands = 1;

	public AbsExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		return absolute(getOperands().get(0).evaluate(x, y));
	}
	
	 public static RGBColor absolute (RGBColor toAbsolute){
	    	
	    	return new RGBColor(Math.abs(toAbsolute.getRed()), 
	    						Math.abs(toAbsolute.getGreen()),
	    						Math.abs(toAbsolute.getBlue())); 
	    }

}
