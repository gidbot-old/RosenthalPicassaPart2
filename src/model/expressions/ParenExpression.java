package model.expressions;

import java.util.List;
import java.util.ArrayList;

import model.Parser;
import model.RGBColor;

public abstract class ParenExpression extends Expression {

	
	private List<Expression> myList = new ArrayList<Expression>(); 
	
	protected ParenExpression(ArrayList<Expression> list) {
		myList = list;
	}

	
	public List<Expression> getOperands(){
		return myList; 
	}
	
	

	

}


