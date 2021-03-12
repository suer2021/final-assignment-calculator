package com.testauto.exam.final_assignment_calculator;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator ac = new AdvancedCalculator();
	
	Random random = new Random();
	
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());

	@Test
	public void testSquare() {
		double tempNumber = 0.0;  
		double tempExpectedResult = 0.0;
		
		//zero
		LOG.info("Testing the method square with the value: "+ tempNumber);
		assertEquals(ac.square(tempNumber), tempExpectedResult, 0);
		
		//random positive numbers
		tempNumber = random.nextDouble();
		tempExpectedResult = tempNumber * tempNumber;
		LOG.info("Testing the method square with the value: "+ tempNumber);
		assertEquals(ac.square(tempNumber), tempExpectedResult, 0);
		
		//random negative numbers
		tempNumber = random.nextDouble() - 1.0;
		tempExpectedResult = tempNumber * tempNumber;
		LOG.info("Testing the method square with the value: "+ tempNumber);
		assertEquals(ac.square(tempNumber), tempExpectedResult, 0);
	}
	
	@Test
	public void testRaisedToThePowerOf() {
		double tempBase = 0.0;
		double tempExponent = 0.0;
		double tempExpectedResult = 0.0;
		
		//zero
		LOG.info("Testing the method raised to the power of with the values: "+ tempBase + " and "+ tempExponent);
		assertEquals(ac.raisedToThePowerOf(tempBase, tempExponent), tempExpectedResult, 1.0);
		
		//random positive numbers
		tempBase = random.nextDouble();
		tempExponent = random.nextDouble();
		tempExpectedResult = Math.pow(tempBase, tempExponent);
		LOG.info("Testing the method raised to the power of with the values: "+ tempBase + " and "+ tempExponent);
		assertEquals(ac.raisedToThePowerOf(tempBase, tempExponent), tempExpectedResult, 0);
		
		//random negative numbers
		tempBase = random.nextDouble() - 1.0;
		tempExponent = random.nextDouble() - 1.0;
		tempExpectedResult = Math.pow(tempBase, tempExponent);
		LOG.info("Testing the method raised to the power of with the value: "+ tempBase + " and "+ tempExponent);
		assertEquals(ac.raisedToThePowerOf(tempBase, tempExponent), tempExpectedResult, 0);
	}
	
	@Test
	public void testSquareRoot() {
		double tempNumber = 0.0;  
		double tempExpectedResult = 0.0;
		
		//zero
		LOG.info("Testing the method square root with the value: "+ tempNumber);
		assertEquals(ac.squareRoot(tempNumber), tempExpectedResult, 0);
		
		//random positive numbers
		tempNumber = random.nextDouble();
		tempExpectedResult = Math.sqrt(tempNumber);
		LOG.info("Testing the method square root with the value: "+ tempNumber);
		assertEquals(ac.squareRoot(tempNumber), tempExpectedResult, 0);
		
		//random negative numbers
		tempNumber = random.nextDouble() - 1.0;
		tempExpectedResult = Math.sqrt(tempNumber);
		LOG.info("Testing the method square root with the value: "+ tempNumber);
		assertEquals(ac.squareRoot(tempNumber), tempExpectedResult, 0);
	}
	
	@Test
	public void testMax() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;  
		double tempExpectedResult = 0.0;
		
		//zero
		LOG.info("Testing the method max with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(ac.max(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		
		//random positive numbers
		tempFirstNumber = random.nextDouble();
		tempSecondNumber = random.nextDouble();
		tempExpectedResult = Math.max(tempFirstNumber, tempSecondNumber);
		LOG.info("Testing the method max with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(ac.max(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		
		//random negative numbers
		tempFirstNumber = random.nextDouble() - 1.0;
		tempSecondNumber = random.nextDouble() - 1.0;
		tempExpectedResult = Math.max(tempFirstNumber, tempSecondNumber);
		LOG.info("Testing the method max with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(ac.max(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
	}
	
	@Test
	public void testMin() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;  
		double tempExpectedResult = 0.0;
		
		//zero
		LOG.info("Testing the method min with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(ac.min(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		
		//random positive numbers
		tempFirstNumber = random.nextDouble();
		tempSecondNumber = random.nextDouble();
		tempExpectedResult = Math.min(tempFirstNumber, tempSecondNumber);
		LOG.info("Testing the method max with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(ac.min(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		
		//random negative numbers
		tempFirstNumber = random.nextDouble() - 1.0;
		tempSecondNumber = random.nextDouble() - 1.0;
		tempExpectedResult = Math.min(tempFirstNumber, tempSecondNumber);
		LOG.info("Testing the method min with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
		assertEquals(ac.min(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
	}
	
}
