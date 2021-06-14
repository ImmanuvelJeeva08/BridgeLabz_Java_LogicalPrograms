/**
  * Find the Fibonacci number to given limit
  */

public class Fib {

	public static void main(String[] args) {

	// Initialization

	int a=0, b=1, c;
	System.out.println(a);
	System.out.println(b);

	// Print  fibonacci number using for loop

	for (int i=0; i <= 10; i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
 	}

	}
} 
	
	
