
package model.expressions;

import java.util.ArrayList;
import java.util.Map;

import model.RGBColor;

public class CosExp extends ParenExpression{
	
	public String myCommand = "cos";
	public static int numOfOperands = 1;

	public CosExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return cos(getOperands().get(0).evaluate(myMap));
	}
	
	 public static RGBColor cos (RGBColor toCos){
		 return new RGBColor(Math.cos(Math.toRadians(toCos.getRed())),  
				 			 Math.cos(Math.toRadians(toCos.getGreen())),
				 			 Math.cos(Math.toRadians(toCos.getBlue()))); 
		 
	 }

}