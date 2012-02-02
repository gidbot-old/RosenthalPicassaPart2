package model.expressions;

import java.util.ArrayList;

import model.Parser;
import model.RGBColor;
import model.util.ColorCombinations;

public class ModExp extends ParenExpression{
	
	public String myCommand = "mod";
	public static int numOfOperands = 2; 
	
	public ModExp(ArrayList<Expression> myList) {
		super(myList);
		// TODO Auto-generated constructor stub
	}
	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		return modulus(getOperands().get(0).evaluate(x, y), getOperands().get(1).evaluate(x, y));
	}
	
	public static RGBColor modulus (RGBColor left, RGBColor right)
	   {
	        return new RGBColor(left.getRed()%right.getRed(), 
	                            left.getGreen()%right.getGreen(),
	                            left.getBlue()%right.getBlue());
	   }

}
