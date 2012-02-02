package model.expressions;

import java.util.ArrayList;

import model.RGBColor;

public class FloorExp extends ParenExpression{
	
	public String myCommand = "floor";
	public static int numOfOperands = 3;

	public FloorExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		return floor(getOperands().get(0).evaluate(x, y));
	}
	
	 public RGBColor floor (RGBColor toFloor){
		 return new RGBColor(Math.floor(toFloor.getRed()), 
				  			 Math.floor(toFloor.getGreen()),
				  			 Math.floor(toFloor.getBlue())); 
		 
	 }

}
