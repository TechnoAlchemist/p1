import java.util.Scanner;

public class QuadraticEquation 
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter a value of A: ");

	int a = scan.nextInt();

	System.out.print("Enter a value of B: ");

	int b = scan.nextInt();

	System.out.print("Enter a value of C: ");

	int c = scan.nextInt();

	double root1 = 0;
	double root2 = 0;
	double root3 = 0;

	int discriminant = b * b - 4 * a * c;

	if (discriminant < 0) {
	    System.out.println("Roots are imaginary ...");
	    root1 = Math.sqrt(Math.abs(discriminant)) / (2 * a);
	    System.out.println("The imaginary number here" + root1);
	}

	if (discriminant == 0) {
	    System.out.println("Roots are equal ...");
	    
	    root1 = -(double)b / (2 * (double)a);
	    root2 = -(double)b / (2 * (double)a);

	    if (a == 0 && b == 0 && c == 0) {
		System.out.println("Any value for x is a solution");	
	    }
	    
	   else if (a == 0 && b == 0) {
		System.out.println("No  value for x is a solution");
	    }
	   
	    // if (c == 0) {
	    //System.out.println("Any value for x is a solution");
	    // }
	}

	if (discriminant > 0) {
	    System.out.println("Roots are unequal...");

	    root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	    root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	    
	    root3 = 0 - Math.sqrt(discriminant);
	    System.out.println("The result here is " + root3);
	}
	
	System.out.println("Roots of the quadrtic ");
	System.out.println("Root 1 " + root1);
        System.out.println("Root 2 " + root2);
    }
}
