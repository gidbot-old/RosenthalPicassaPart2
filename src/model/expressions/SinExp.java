package model.expressions;

import java.util.ArrayList;
import java.util.Map;

import model.RGBColor;

public class SinExp extends ParenExpression{
	
	public String myCommand = "sin";
	public static int numOfOperands = 3;

	public SinExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return sin(getOperands().get(0).evaluate(myMap));
	}
	
	 public static RGBColor sin (RGBColor toSine){
		 return new RGBColor(Math.sin(Math.toRadians(toSine.getRed())),  
				 			 Math.sin(Math.toRadians(toSine.getGreen())),
				 			 Math.sin(Math.toRadians(toSine.getBlue()))); 
		 
	 }

}
