package model.expressions;

import java.util.ArrayList;
import java.util.Map;

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
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return absolute(getOperands().get(0).evaluate(myMap));
	}
	
	 public static RGBColor absolute (RGBColor toAbsolute){
	    	
	    	return new RGBColor(Math.abs(toAbsolute.getRed()), 
	    						Math.abs(toAbsolute.getGreen()),
	    						Math.abs(toAbsolute.getBlue())); 
	    }

}
