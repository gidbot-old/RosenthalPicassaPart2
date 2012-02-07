package model.expressions;

import java.util.ArrayList;
import java.util.Map;

import model.RGBColor;

public class FloorExp extends ParenExpression{
	
	public String myCommand = "floor";
	public static int numOfOperands = 3;

	public FloorExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return floor(getOperands().get(0).evaluate(myMap));
	}
	
	 public RGBColor floor (RGBColor toFloor){
		 return new RGBColor(Math.floor(toFloor.getRed()), 
				  			 Math.floor(toFloor.getGreen()),
				  			 Math.floor(toFloor.getBlue())); 
		 
	 }

}
