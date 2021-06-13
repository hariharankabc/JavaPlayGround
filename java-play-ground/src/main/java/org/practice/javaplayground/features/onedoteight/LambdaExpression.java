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
		  }
}
