
package model.expressions;

import java.util.ArrayList;
import java.util.Map;

import model.RGBColor;

public class AtanExp extends ParenExpression{
	
	public String myCommand = "atan";
	public static int numOfOperands = 1;

	public AtanExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return Atan(getOperands().get(0).evaluate(myMap));
	}
	
	 public static RGBColor Atan (RGBColor toAtan){
		 return new RGBColor(Math.atan(toAtan.getRed()),  
				 			 Math.atan(toAtan.getGreen()),
				 			 Math.atan(toAtan.getBlue())); 
		 
	 }

}
