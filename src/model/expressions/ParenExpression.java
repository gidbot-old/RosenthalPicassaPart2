package model.expressions;

import java.util.List;
import java.util.ArrayList;

import model.Parser;
import model.RGBColor;

public abstract class ParenExpression extends Expression {

	
	protected List<Expression> myList = new ArrayList<Expression>(); 
	
	
	public ParenExpression(ArrayList<Expression> list) {
		super(); 
		myList = list;
	}

	
	public List<Expression> getOperands(){
		return myList; 
	}
	
	

	

}


