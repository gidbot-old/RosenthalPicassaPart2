package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;


public class RandomExp extends ParenExpression{

	
	public static String myCommand = "random";
	public static int numOfOperands = 0; 
	
	public RandomExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand;
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		return this.random();
	}
	
	private RGBColor random ()
    {
		Random myRandom = new Random(); 
        return new RGBColor(myRandom.nextDouble(), 
        					myRandom.nextDouble(),
                            myRandom.nextDouble());
    }


	

}