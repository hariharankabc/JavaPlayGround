package org.practice.javaplayground.features.onedoteight;

import java.util.ArrayList;

public class LambdaExpression {
	public void exampleLambdaExpression(){
		   ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    numbers.forEach( (n) -> { System.out.println(n); } );
		    
		    //Lambda Expression In Method
		    LamdaExpressionInterface exclaim = (s) -> s + "!";
		    LamdaExpressionInterface ask = (s) -> s + "?";
		    printFormatted("Hello", exclaim);
		    printFormatted("Hello", ask);
		  }
	public static void printFormatted(String str, LamdaExpressionInterface format) {
	    String result = format.run(str);
	    System.out.println(result);
	  }
}
