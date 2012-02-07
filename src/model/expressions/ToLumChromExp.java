package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;


public class ToLumChromExp extends ParenExpression{

	
	public static String myCommand = "rgbToYCrCb";
	public static int numOfOperands = 1; 
	
	public ToLumChromExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand.toLowerCase();
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		return rgb2ycrcb(getOperands().get(0).evaluate(myMap));
	}
	
	public RGBColor rgb2ycrcb (RGBColor c)
    {
        return new RGBColor(
                   c.getRed() *  0.2989 + c.getGreen() *  0.5866 + c.getBlue() *  0.1145,
                   c.getRed() * -0.1687 + c.getGreen() * -0.3312 + c.getBlue() *  0.5,
                   c.getRed() *  0.5000 + c.getGreen() * -0.4183 + c.getBlue() * -0.0816);
    }

	

}
