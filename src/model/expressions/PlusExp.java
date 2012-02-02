package model.expressions;

import java.util.*;


import model.Parser;
import model.RGBColor;
import model.util.ColorCombinations;

public class PlusExp extends ParenExpression{

	
	public String myCommand = "plus";
	public static int numOfOperands = 2; 
	
	public PlusExp(ArrayList<Expression> myList) { 
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	
	public String getCommand(){
		return myCommand;
	}
	
	
	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		
		return this.add(getOperands().get(0).evaluate(x, y), getOperands().get(1).evaluate(x, y));
	}
	
	private RGBColor add (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() + right.getRed(), 
                            left.getGreen() + right.getGreen(),
                            left.getBlue() + right.getBlue());
    }



	

	

}
