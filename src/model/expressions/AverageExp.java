package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;


public class AverageExp extends ParenExpression{

	
	public static String myCommand = "average";
	public static int numOfOperands; 
	public static int mySize; 
	
	public AverageExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand;
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		mySize = getOperands().size(); 
		RGBColor myAverage = new RGBColor(getOperands().get(0).evaluate(myMap));
		for (int i = 1; i < mySize; i++){
			myAverage = average(myAverage, getOperands().get(i).evaluate(myMap)); 
		}
		
		return myAverage; 
	
	
	}
	public static RGBColor average (RGBColor left, RGBColor right)
    {
        return new RGBColor((left.getRed()+right.getRed())/mySize, 
                            (left.getGreen() * right.getGreen())/mySize,
                            (left.getBlue() * right.getBlue())/mySize);
    }

}
