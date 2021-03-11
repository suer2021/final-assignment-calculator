package com.testauto.exam.final_assignment_calculator;

/*
 * Susanne Erixon assignment02
 */

public class BasicCalculator implements BasicOperations {

	@Override
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public double division(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		if (Double.isInfinite(result)) {
			System.out.println("Division by zero?");
			return -0.123456789;
		} else {
			return result;
		}
	}

}
