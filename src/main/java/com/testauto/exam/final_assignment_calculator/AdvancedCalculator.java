package com.testauto.exam.final_assignment_calculator;

/*
 * Susanne Erixon assignment02
 */

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	@Override
	public double square(double number) {
		return number * number;
	}

	@Override
	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	@Override
	public double squareRoot(double number) {
		return Math.sqrt(number);
	}

	@Override
	public double max(double firstNumber, double secondNumber) {
		return Math.max(firstNumber, secondNumber);
	}

	@Override
	public double min(double firstNumber, double secondNumber) {
		return Math.min(firstNumber, secondNumber);
	}

}
