package model.expressions;

import java.util.ArrayList;
import java.util.Map;

import model.RGBColor;

public class LogExp extends ParenExpression{
	
	public String myCommand = "log";
	public static int numOfOperands = 1;

	public LogExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return log(getOperands().get(0).evaluate(myMap));
	}
	
	 public static RGBColor log (RGBColor myColor){
		 return new RGBColor(Math.log(myColor.getRed()),  
				 			 Math.log(myColor.getGreen()),
				 			 Math.log(myColor.getBlue())); 
		 
	 }

}
