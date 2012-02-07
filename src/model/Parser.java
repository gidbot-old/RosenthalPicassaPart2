package model;

import java.util.ArrayList;
import model.*; 

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.expressions.Expression;
import model.expressions.NumExp;
import model.expressions.ParenExpression;
import model.expressions.VariableExp;


/**
 * Parses a string into an expression tree based on rules for arithmetic.
 * 
 * Due to the nature of the language being parsed, a recursive descent parser 
 * is used 
 *   http://en.wikipedia.org/wiki/Recursive_descent_parser
 *   
 * @author former student solution
 * @author Robert C. Duvall (added comments, exceptions, some functions)
 */
public class Parser
{
    // double is made up of an optional negative sign, followed by a sequence 
    // of one or more digits, optionally followed by a period, then possibly 
    // another sequence of digits
    private static final Pattern DOUBLE_REGEX =
        Pattern.compile("(\\-?[0-9]+(\\.[0-9]+)?)|(\\.[0-9]+)");
    // expression begins with a left parent followed by the command name, 
    // which is a sequence of alphabetic characters
    private static final Pattern EXPRESSION_BEGIN_REGEX =
        Pattern.compile("\\(([a-z]+)");
    // REGEX for the x,y variables
    private static final Pattern VARIABLE_REGEX =
            Pattern.compile("[a-zA-Z]+");

    
    
    ExpressionFactory myExpressionFactory = new ExpressionFactory();
    
    // different possible kinds of expressions
    private static enum ExpressionType
    {
        NUMBER, PAREN_EXPRESSION, VARIABLE
    }


    // state of the parser
    private int myCurrentPosition;
    private String myInput;


    /**
     * Converts given string into expression tree.
     * 
     * @param input expression given in the language to be parsed
     * @return expression tree representing the given formula
     */
    public Expression makeExpression (String input)
    {
        myInput = input;
        Expression result = parseExpression();
        skipWhiteSpace();
        if (notAtEndOfString())
        {
            throw new ParserException("Unexpected characters at end of the string: " +
                                      myInput.substring(myCurrentPosition),
                                      ParserException.Type.EXTRA_CHARACTERS);
        }
        return result;
    }


    private ExpressionType getExpressionType ()
    {
        skipWhiteSpace();
        if (matchesPattern (DOUBLE_REGEX))           return ExpressionType.NUMBER;
        if (matchesPattern (EXPRESSION_BEGIN_REGEX)) return ExpressionType.PAREN_EXPRESSION;
        if (matchesPattern (VARIABLE_REGEX))		 return ExpressionType.VARIABLE; 
        else                     throw new ParserException("Unexpected Character " + currentCharacter());
    }


    private Expression parseExpression ()
    {
        switch (getExpressionType())
        {
            case NUMBER:
                return parseNumber();
            case PAREN_EXPRESSION:
                return parseParenExpression();
            case VARIABLE:
            	return parseVariable(); 
            default:
            	throw new ParserException("Unexpected expression type " +
                                          getExpressionType().toString());
        }
    }


    private boolean matchesPattern (Pattern regex)
    {
        Matcher doubleMatcher =
            regex.matcher(myInput.substring(myCurrentPosition));
        return doubleMatcher.lookingAt();
    }
    


    private Expression parseNumber ()
    {
        Matcher doubleMatcher = DOUBLE_REGEX.matcher(myInput);
        doubleMatcher.find(myCurrentPosition);
        String numberMatch =
            myInput.substring(doubleMatcher.start(), doubleMatcher.end());
        myCurrentPosition = doubleMatcher.end();
        // this represents the color gray of the given intensity
        double value = Double.parseDouble(numberMatch);
        RGBColor gray = new RGBColor(value);
        return new NumExp(gray);
    }
    
    private Expression parseVariable()
    {
    	Matcher variableMatcher = VARIABLE_REGEX.matcher(myInput);
        variableMatcher.find(myCurrentPosition);
        String variableMatch =
            myInput.substring(variableMatcher.start(), variableMatcher.end());
        myCurrentPosition = variableMatcher.end();
        // this represents the color gray of the given intensity
        
        return new VariableExp(variableMatch); 
        		
    	
    }
    
    
    
    private Expression parseParenExpression ()
    {
        Matcher expMatcher = EXPRESSION_BEGIN_REGEX.matcher(myInput.toLowerCase());
        expMatcher.find(myCurrentPosition);
       
        String commandName = expMatcher.group(1);
        		
        myCurrentPosition = expMatcher.end();
   
        ArrayList <Expression> myOperands = new ArrayList<Expression>();  
        
        skipWhiteSpace(); 
        while (currentCharacter() != ')')
        {
        	myOperands.add(parseExpression()); 
        }
       
        if (currentCharacter() == ')'){
        	myCurrentPosition++; 
        	ParenExpression myExpression = (ParenExpression) myExpressionFactory.createExpression(commandName, myOperands);
            return myExpression;  
        }
        
        else{
        	throw new ParserException("Expected close paren, instead found " +
        								myInput.substring(myCurrentPosition)); 
        	
        }
        
        
        	
        
//        throw new ParserException("Expected close paren, instead found " +
//                                      myInput.substring(myCurrentPosition));
       
        
    }

    private void skipWhiteSpace ()
    {
        while (notAtEndOfString() && Character.isWhitespace(currentCharacter()))
        {
            myCurrentPosition++;
        }
    }

    private char currentCharacter ()
    {
        return myInput.charAt(myCurrentPosition);
    }

    private boolean notAtEndOfString ()
    {
        return myCurrentPosition < myInput.length();
    }
}
