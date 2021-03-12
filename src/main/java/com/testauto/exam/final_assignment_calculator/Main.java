package com.testauto.exam.final_assignment_calculator;

/*
 * Susanne Erixon assignment02
 */

public class Main {
	
	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		System.out.println(bc.addition(2, 3));
		System.out.println(bc.subtraction(2, 3));
		System.out.println(bc.multiplication(3, 5));
		System.out.println(bc.division(10, 2));
		
		AdvancedCalculator ac = new AdvancedCalculator();
		System.out.println(ac.square(4));
		System.out.println(ac.raisedToThePowerOf(3, 4));
		System.out.println(ac.squareRoot(3));
		System.out.println(ac.max(3, 8));
		System.out.println(ac.min(5, 9));
	}

}
