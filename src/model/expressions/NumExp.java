package model.expressions;

import java.util.Map;

import model.RGBColor;

public class NumExp extends Expression{

	
	private RGBColor myValue; 
	public NumExp (RGBColor value){
		myValue = value; 
	}
	
	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		return myValue;
	}

}
