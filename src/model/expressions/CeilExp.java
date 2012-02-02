package model.expressions;

import java.util.ArrayList;

import model.RGBColor;

public class CeilExp extends ParenExpression{
	
	public String myCommand = "ceil";
	public static int numOfOperands = 1;

	public CeilExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		return ceiling(getOperands().get(0).evaluate(x, y));
	}
	
	 private RGBColor ceiling (RGBColor toCeil){
		 return new RGBColor(Math.ceil(toCeil.getRed()), 
				  			 Math.ceil(toCeil.getGreen()),
				  			 Math.ceil(toCeil.getBlue())); 
		 
	 }

}

