package model.expressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.RGBColor;



public class LetExpression extends ParenExpression {
	
	public String myCommand; 
	
	
	public LetExpression(ArrayList<Expression> myList) {
		super(myList); 
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public RGBColor evaluate(Map<String, RGBColor> myMap) {
		// TODO Auto-generated method stub
		Map<String, RGBColor> myMapCopy = new HashMap<String,RGBColor>(myMap);
		
		RGBColor myTempColor = new RGBColor(myList.get(1).evaluate(myMapCopy));
		
		myMapCopy.put(((VariableExp) myList.get(0)).getMyString(), myTempColor); 
		return (getOperands().get(2).evaluate(myMapCopy));
	}

}
