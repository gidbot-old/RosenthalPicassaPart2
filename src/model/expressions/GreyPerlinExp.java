package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;
import model.util.ColorCombinations;
import model.util.PerlinNoise;

public class GreyPerlinExp extends ParenExpression{

	
	public static String myCommand = "perlinColor";
	public static int numOfOperands = 2; 
	
	public GreyPerlinExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand.toLowerCase();
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		return greyNoise(getOperands().get(0).evaluate(myMap), getOperands().get(1).evaluate(myMap));
	}
	
	 public static RGBColor greyNoise (RGBColor left, RGBColor right)
	   {
	      return new RGBColor(
	              PerlinNoise.noise(left.getRed() + right.getRed(),
	                                left.getGreen() + right.getGreen(),
	                                left.getBlue() + right.getBlue()));
	   }

	

}

