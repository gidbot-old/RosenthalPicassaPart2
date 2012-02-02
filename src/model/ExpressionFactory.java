package model;

import java.util.*;

import model.expressions.AbsExp;
import model.expressions.CeilExp;
import model.expressions.ColorExp;
import model.expressions.DivideExp;
import model.expressions.ExponentExp;
import model.expressions.Expression;
import model.expressions.FloorExp;
import model.expressions.MullExp;
import model.expressions.NegExp;
import model.expressions.PlusExp;
import model.expressions.SinExp;
import model.expressions.SubtractExp;


public class ExpressionFactory {

	
	public ExpressionFactory(){
		
	}

	
	public Expression createExpression(String exp, ArrayList<Expression> myList){
		if(exp.equals("plus"))
			return new PlusExp(myList); 
		if(exp.equals("minus"))
			return new SubtractExp(myList); 
		if(exp.equals("mul"))
			return new MullExp(myList); 
		if(exp.equals("div"))
			return new DivideExp(myList);
		if(exp.equals("mod"))
			return new DivideExp(myList);
		if(exp.equals("exp"))
			return new ExponentExp(myList);
		if(exp.equals("neg"))
			return new NegExp(myList);
		if(exp.equals("color"))
			return new ColorExp(myList);
		if(exp.equals("abs"))
			return new AbsExp(myList);
		if(exp.equals("sin"))
			return new SinExp(myList);
		if(exp.equals("floor"))
			return new FloorExp(myList);
		if(exp.equals("ceil"))
			return new CeilExp(myList);
		
		
		else return null; 
	}
	

}
