package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;

import model.util.PerlinNoise;

public class PerlinColorExp extends ParenExpression{

	
	public static String myCommand = "perlinColor";
	public static int numOfOperands = 2; 
	
	public PerlinColorExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand.toLowerCase();
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		return colorNoise(getOperands().get(0).evaluate(myMap), getOperands().get(1).evaluate(myMap));
	}
	
	public static RGBColor colorNoise (RGBColor left, RGBColor right)
	   {
	       return new RGBColor(
	               PerlinNoise.noise(left.getRed() + 0.3, right.getRed() + 0.3, 0),
	               PerlinNoise.noise(left.getGreen() - 0.8, right.getGreen() - 0.8, 0),
	               PerlinNoise.noise(left.getBlue() + 0.1, right.getBlue() + 0.1, 0));
	   }

	

}
