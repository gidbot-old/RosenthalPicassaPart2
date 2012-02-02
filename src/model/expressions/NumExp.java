package model.expressions;

import model.RGBColor;

public class NumExp extends Expression{

	
	private RGBColor myValue; 
	
	public NumExp (RGBColor value){
		myValue = value; 
	}
	
	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		return myValue;
	}

}
