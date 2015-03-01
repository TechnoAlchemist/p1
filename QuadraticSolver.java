/*
 * @(#)Solver.java 1.0
 *
 *
 * Quadratic equation solver class
 * Bob Wilson
 * 01/11/2014
 *
 */

public class QuadraticSolver {

  public static String getEquation(int a, int b, int c) 
  {
    String result = null;
    
    result = "Solving: " + a + "x\u00b2 " +        // x squared term
             ( (b >= 0) ? "+ " : "") + b + "x " +  // x term
             ( (c >= 0) ? "+ " : "") + c +         // constant term
             " = 0";                               // finish the equation
    
    return result;
  }

  public static String getSolution(int a, int b, int c) {
  
    String result = null;
  
    // write your code for solving the equation here
   
    double root1 = 0;
    double root2 = 0;
    double value;

    int discriminant = b * b - 4 * a * c;

    if (discriminant < 0) {
	root1 = Math.sqrt(Math.abs(discriminant)) / (2 * a);
	root2 = Math.sqrt(Math.abs(discriminant)) / (2 * a);
	value = -(double)b / (2 * (double)a);

	result = "Root 1 is " + value + " + i*" + root1 + 
	"\nRoot 2 is " + value + " - i*" + root2;
    }

    if (discriminant == 0) {
	root1 = -(double)b / (2 * (double)a);
	result = "The only root is " + root1;
	
	if (a == 0 && b == 0 && c == 0) {
	    result = "Any value for x is a solution";
	}
	else if (a == 0 && b == 0) {
	    result = "No value for x is a solution";
	}
    }
    
    if (discriminant > 0) {
	root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

	result = "Root 1 is " + root1 + "\nRoot 2 is " + root2 ;
	
	if (a == 0) {
	    root1 = 0 - Math.sqrt(discriminant);
	    result = "The only root is " + root1;
	}
    }

    return result;
  }
}/*201420*/
