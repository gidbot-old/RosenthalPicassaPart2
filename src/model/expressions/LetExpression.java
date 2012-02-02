package model.expressions;

import java.util.ArrayList;

import model.RGBColor;

public class LetExpression extends ParenExpression {

	private Expression myExpression; 
	private Expression myValue; 
	public LetExpression(ArrayList<Expression> myList) {
		super(myList);
		myExpression = myList.get(0); 
		myValue = myList.get(1); 
		// TODO Auto-generated constructor stub
	}

	@Override
	public RGBColor evaluate(double x, double y) {
		// TODO Auto-generated method stub
		
		myExpression = myValue; 
		return myExpression;
	}

}
