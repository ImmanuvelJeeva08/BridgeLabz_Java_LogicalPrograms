/**
  * Measure the elapsed time between start and end time
  * importing java packages for rounding and get two decimal point afer point
  */

import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.util.*;
public class StopWatch  {

	// use elapsedtime method for find elapsed time in hours and minutes

	static void elapsedtime(double full) {

        // difference between start and end time is multiply by 10

        double round=full*10;
        double remainder=60;

        while (round >= 60) {
                round = round % 60;
                remainder=round / 60;
        }
        System.out.println(round+" hours");
        System.out.println(remainder+" minutes");

        }


	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	// get two decimal point after point

	DecimalFormat df=new DecimalFormat(".##");

	// get start and end time from user

	System.out.println("Enter the Starting time");
	double start=sc.nextDouble();

	System.out.println("Enter the Ending time");
        double end=sc.nextDouble();

	double diff=Math.abs(start-end);
	
	df.setRoundingMode(RoundingMode.DOWN);

        String full=df.format(diff);
        System.out.println(full);

	// function calling

	elapsedtime(full);

	}
}
