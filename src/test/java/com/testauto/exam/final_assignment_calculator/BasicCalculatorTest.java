package com.testauto.exam.final_assignment_calculator;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator bc = new BasicCalculator();
	Random random = new Random();
	
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());

	@Test
	public void testAddition() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;  
		double tempExpectedResult = 0.0;
		
		//zero
		LOG.info("Testing the method addition with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.addition(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		
		//random positive numbers
		tempFirstNumber = random.nextDouble();
		tempSecondNumber = random.nextDouble();
		tempExpectedResult = tempFirstNumber + tempSecondNumber;
		LOG.info("Testing the method addition with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.addition(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		
		//random negative numbers
		tempFirstNumber = random.nextDouble() - 1.0;
		tempSecondNumber = random.nextDouble() - 1.0;
		tempExpectedResult = tempFirstNumber + tempSecondNumber;
		LOG.info("Testing the method addition with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.addition(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
	}
	
	@Test
	public void testSubtraction() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;  
		double tempExpectedResult = 0.0;
		
		//zero
		LOG.info("Testing the method subtraction with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.subtraction(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		
		//random positive numbers
		tempFirstNumber = random.nextDouble();
		tempSecondNumber = random.nextDouble();
		tempExpectedResult = tempFirstNumber - tempSecondNumber;
		LOG.info("Testing the method subtraction with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.subtraction(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		
		//random negative numbers
		tempFirstNumber = random.nextDouble() - 1.0;
		tempSecondNumber = random.nextDouble() - 1.0;
		tempExpectedResult = tempFirstNumber - tempSecondNumber;
		LOG.info("Testing the method subtraction with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.subtraction(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
	}

	@Test
	public void testMultiplication() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;  
		double tempExpectedResult = 0.0;
		
		//zero
		LOG.info("Testing the method multiplication with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.multiplication(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		
		//random positive numbers
		tempFirstNumber = random.nextDouble();
		tempSecondNumber = random.nextDouble();
		tempExpectedResult = tempFirstNumber * tempSecondNumber;
		LOG.info("Testing the method multiplication with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.multiplication(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		
		//random negative numbers
		tempFirstNumber = random.nextDouble() - 1.0;
		tempSecondNumber = random.nextDouble() - 1.0;
		tempExpectedResult = tempFirstNumber * tempSecondNumber;
		LOG.info("Testing the method multiplication with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.multiplication(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
	}
	
	@Test
	public void testDivision() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;  
		double tempExpectedResult = 0.0;
		
		//division 0/0
		LOG.info("Testing the method division with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.division(tempFirstNumber, tempSecondNumber), Double.NaN, -0.123456789);
		
		//divide with zero
		tempFirstNumber = random.nextDouble();
		tempExpectedResult = tempFirstNumber / tempSecondNumber;
		LOG.info("Testing the method division with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.division(tempFirstNumber, tempSecondNumber), -0.123456789, 0);
		
		//random positive numbers
		tempFirstNumber = random.nextDouble();
		tempSecondNumber = random.nextDouble();
		tempExpectedResult = tempFirstNumber / tempSecondNumber;
		LOG.info("Testing the method division with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.division(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		
		//random negative numbers
		tempFirstNumber = random.nextDouble() - 1.0;
		tempSecondNumber = random.nextDouble() - 1.0;
		tempExpectedResult = tempFirstNumber / tempSecondNumber;
		LOG.info("Testing the method division with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(bc.division(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
	}
}
