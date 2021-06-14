/**
  *  Print prime factors of N
  */

import java.util.*;
public class PrimeFactor {
        public static void main(String[] args) {

        // Get input from the user

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();

        // find prime factors of given number using for loop


	if ( number >2 ) {

        	for(int i = 2; i<= number; i++)  {
                	while(number%i == 0) {
                        	System.out.println(i);
                        	number = number/i;
                	}
        	}
	}
	else if ( number == 0 || number == 1 ) {
			
		System.out.println(" 0 and 1 are not counted as prime number");
	}
	else if ( number ==2 ) {

		System.out.println("All even number can be divide by 2");
		System.out.println("So 2 is only even prime minister");
	}

        }
}
