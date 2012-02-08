package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;


public class ProductExp extends ParenExpression{

	
	public static String myCommand = "product";
	public static int numOfOperands; 
	
	public ProductExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand;
	}
	
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		
		RGBColor myProduct = new RGBColor(getOperands().get(0).evaluate(myMap));
		for (int i = 1; i < getOperands().size(); i++){
			myProduct = multiply(myProduct, getOperands().get(i).evaluate(myMap)); 
		}
		
		return myProduct; 
	
	
	}
	public static RGBColor multiply (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() * right.getRed(), 
                            left.getGreen() * right.getGreen(),
                            left.getBlue() * right.getBlue());
    }

}