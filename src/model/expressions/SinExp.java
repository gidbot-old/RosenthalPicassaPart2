package model.expressions;

import java.util.ArrayList;

import model.RGBColor;

public class SinExp extends ParenExpression{
	
	public String myCommand = "sin";
	public static int numOfOperands = 3;

	public SinExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		return sin(getOperands().get(0).evaluate(x, y));
	}
	
	 public static RGBColor sin (RGBColor toSine){
		 return new RGBColor(Math.sin(toSine.getRed()), 
				  			 Math.sin(toSine.getGreen()),
				  			 Math.sin(toSine.getBlue())); 
		 
	 }

}
