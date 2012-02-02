package model.expressions;

import model.RGBColor;

public class VariableExp extends Expression{

	public String myCommand; 
	public static int numOfOperands = 1;
	
	public VariableExp (String command){
		myCommand = command; 
	}
	
	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		if (myCommand.equals("x"))
    		return new RGBColor(x);
        else if (myCommand.equals("y"))
    		return new RGBColor(y);
		return null; 

	}


}
