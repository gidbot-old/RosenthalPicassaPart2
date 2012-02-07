package model;

import java.util.*;
import model.expressions.*; 

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
		if(exp.equals("let"))
			return new LetExpression(myList);
		if(exp.equals("random"))
			return new RandomExp(myList);
		if(exp.equals("clamp"))
			return new ClampExp(myList);
		if(exp.equals("wrap"))
			return new WrapExp(myList); 
		if(exp.equals("cos"))
			return new CosExp(myList);
		if(exp.equals("tan"))
			return new TanExp(myList);
		if(exp.equals("atan"))
			return new AtanExp(myList);
		if(exp.equals("log"))
			return new LogExp(myList);
		if(exp.equals("rgbtoycrcb"))
			return new ToLumChromExp(myList);
		if(exp.equals("ycrcbtorgb"))
			return new FromLumChromExp(myList);
		if(exp.equals("perlincolor"))
			return new PerlinColorExp(myList);
		if(exp.equals("perlinbw"))
			return new GreyPerlinExp(myList);
		 
		
		else return null; 
	}
	

}
