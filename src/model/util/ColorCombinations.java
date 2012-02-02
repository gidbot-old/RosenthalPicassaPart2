package model.util;

import model.RGBColor;


/**
 * Combine two colors by combining their components.
 * 
 * This is a separate class from color since it is just one set of
 * ways to combine colors, many may exist and we do not want to keep
 * modifying the RGBColor class.
 * 
 * @author Robert C. Duvall
 */
public class ColorCombinations
{
    /**
     * Combine two colors by adding their components.
     */
    public static RGBColor add (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() + right.getRed(), 
                            left.getGreen() + right.getGreen(),
                            left.getBlue() + right.getBlue());
    }

    /**
     * Combine two colors by subtracting their components.
     */
    public static RGBColor subtract (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() - right.getRed(), 
                            left.getGreen() - right.getGreen(),
                            left.getBlue() - right.getBlue());
    }

    /**
     * Combine two colors by multiplying their components.
     */
    public static RGBColor multiply (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() * right.getRed(), 
                            left.getGreen() * right.getGreen(),
                            left.getBlue() * right.getBlue());
    }

    /**
     * Combine two colors by dividing their components.
     */
    public static RGBColor divide (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed() / right.getRed(), 
                            left.getGreen() / right.getGreen(),
                            left.getBlue() / right.getBlue());
    }
    
    /**
     * Combine two colors by finding the modulus of the first value "divided"
     * by the second.
     */
    public static RGBColor modulus (RGBColor left, RGBColor right)
    {
        return new RGBColor(left.getRed()%right.getRed(), 
                            left.getGreen()%right.getGreen(),
                            left.getBlue()%right.getBlue());
    }
    
    /**
     * Combine two colors by raising the first value to the second one
     */
    public static RGBColor exponent (RGBColor left, RGBColor right)
    {
        return new RGBColor(Math.pow(left.getRed(),right.getRed()), 
        					Math.pow(left.getGreen(),right.getGreen()),
        					Math.pow(left.getBlue(),right.getBlue()));
    }
    
    public static RGBColor negate (RGBColor toNegate)
    {
        return new RGBColor(toNegate.getRed()*-1, 
        					toNegate.getGreen()*-1,
        					toNegate.getBlue()*-1);
    }
    
    public static RGBColor color (RGBColor red, RGBColor green, RGBColor blue)
    {
        return new RGBColor(red.getRed(), green.getGreen(), blue.getBlue());
    }
    
    public static RGBColor absolute (RGBColor toAbsolute){
    	
    	return new RGBColor(Math.abs(toAbsolute.getRed()), 
    						Math.abs(toAbsolute.getGreen()),
    						Math.abs(toAbsolute.getBlue())); 
    }
    
    
    
}