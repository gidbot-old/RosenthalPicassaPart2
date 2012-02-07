package model.expressions;



import java.util.Map;

import model.RGBColor;

public abstract class Expression {
	
	
	public String myString; 
	public Expression (){
		 
	}
	
	public abstract RGBColor evaluate (Map<String, RGBColor> myMap);
	
	
	
	// public abstract Expression parseExpression(String exp); 

    /**
     * @return string representation of expression
     */
    
	/**
	 * public String toString ()
    {
        StringBuffer result = new StringBuffer();
        if (myCommand == null)
        {
            result.append(myValue); 
        }
        else
        {
            result.append("(");
            result.append(" " + myCommand + " ");
            result.append(myOperand1.toString());  
            result.append(myOperand2.toString());
            result.append(")");
        }
        return result.toString();
    }
	 */
		
    


}
