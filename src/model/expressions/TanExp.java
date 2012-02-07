
package model.expressions;

import java.util.ArrayList;
import java.util.Map;

import model.RGBColor;

public class TanExp extends ParenExpression{
	
	public String myCommand = "tan";
	public static int numOfOperands = 1;

	public TanExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return tan(getOperands().get(0).evaluate(myMap));
	}
	
	 public static RGBColor tan (RGBColor toTan){
		 return new RGBColor(Math.tan(Math.toRadians(toTan.getRed())),  
				 			 Math.tan(Math.toRadians(toTan.getGreen())),
				 			 Math.tan(Math.toRadians(toTan.getBlue()))); 
		 
	 }

}
