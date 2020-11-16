package com.blz.genericsmaxinumnumbertest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.blz.genericsmaxinumbertest.MaximumNumber;

import junit.framework.Assert;


public class GenericsMaxinumNumberTest {

	static MaximumNumber maxinumNumberObject;
	public List<Integer> inputList =  Arrays.asList(50,10,20);
	@BeforeClass
	public static void GenericsMaxinumNumberCreation() {
		maxinumNumberObject = new MaximumNumber();
	}
	@AfterClass
	public static void nullObject() {
		maxinumNumberObject = null;
	}
	@Test
	public void GenericsMaxinumNumberTestIntegerFirstNumberMax_thenAssertionHappy() {
		int result = (Integer) maxinumNumberObject.maxinumNumber(30,20,10);
		maxinumNumberObject.display(null, result);
		assertEquals(30,result);
	}
	@Test
	public void GenericsMaxinumNumberTestIntegeSecondNumberMax_thenAssertionHappy() {
		int result = (Integer) maxinumNumberObject.maxinumNumber(50,90,10);
		maxinumNumberObject.display(null, result);
		assertEquals(90,result);
	}
	
	@Test
	public void GenericsMaxinumNumberTestIntegetThirdNumberMax_thenAssertionHappy() {
		int result = (Integer) maxinumNumberObject.maxinumNumber(50,90,100);
		maxinumNumberObject.display(null, result);
		assertEquals(100,result);
	}

	@Test
	public void GenericsMaxinumNumberTestIntegerFirstNumberMax_thenAssertionSad() {
		int result = (Integer) maxinumNumberObject.maxinumNumber(30,20,10);
		maxinumNumberObject.display(null, result);
		assertEquals(20,result);
	}
	@Test
	public void GenericsMaxinumNumberTestIntegeSecondNumberMax_thenAssertionSad() {
		int result = (Integer) maxinumNumberObject.maxinumNumber(50,90,10);
		maxinumNumberObject.display(null, result);
		assertEquals(20,result);
		
	}
	
	@Test
	public void GenericsMaxinumNumberTestIntegetThirdNumberMax_thenAssertionSad() {
		int result = (Integer) maxinumNumberObject.maxinumNumber(50,90,100);
		maxinumNumberObject.display(null, result);
		assertEquals(20,result);
		
	}
	
	//test cases for float
	@Test
	public void GenericsMaxinumNumberTestFloatFirstNumberMax_thenAssertionHappy() {
		float result = (Float) maxinumNumberObject.maxinumNumber(50.9f,9.3f,10.9f);
		maxinumNumberObject.display(null, result);
		assertEquals(50.9f,result,0.0);
	}
	@Test
	public void GenericsMaxinumNumberTestFloatSecondNumberMax_thenAssertionHappy() {
		float result = (Float) maxinumNumberObject.maxinumNumber(50.9f,90.3f,10.9f);
		maxinumNumberObject.display(null, result);
		assertEquals(90.3f,result,0.0);
	}
	
	@Test
	public void GenericsMaxinumNumberTestFloatThirdNumberMax_thenAssertionHappy() {
		float result = (Float) maxinumNumberObject.maxinumNumber(50.9f,90.3f,100.9f);
		maxinumNumberObject.display(null, result);
		assertEquals(100.9f,result,0.0);
	}
	@Test
	public void GenericsMaxinumNumberTestGenericsFloatFirstNumberMax_thenAssertionSad() {
		float result = (Float) maxinumNumberObject.maxinumNumber(500.9f,90.3f,100.9f);
		maxinumNumberObject.display(null, result);
		assertEquals(100.9f,result,0.0);
		
	}
	@Test
	public void GenericsMaxinumNumberTestFloatSecondNumberMax_thenAssertionSad() {
		float result = (Float) maxinumNumberObject.maxinumNumber(50.9f,900.3f,100.9f);
		maxinumNumberObject.display(null, result);
		assertEquals(100.9f,result,0.0);
		
	}
	
	@Test
	public void GenericsMaxinumNumberTestFloatThirdNumberMax_thenAssertionSad() {
		float result = (Float) maxinumNumberObject.maxinumNumber(50.9f,90.3f,1000.9f);
		maxinumNumberObject.display(null, result);
		assertEquals(100.9f,result,0.0);
	}

	
	//test cases for String
	@Test
	public void GenericsMaxinumNumberTestStringFirstMax_thenAssertionHappy() {
		String result = (String) maxinumNumberObject.maxinumNumber("Banana","Apple", "Orange");
		maxinumNumberObject.display(null, result);
		assertEquals("Orange",result);
	}
	@Test
	public void GenericsMaxinumNumberTestStringSecondMax_thenAssertionHappy() {
		String result = (String) maxinumNumberObject.maxinumNumber("Apple", "Peach", "Banana");
		maxinumNumberObject.display(null, result);
		assertEquals("Peach",result);
	}
	
	@Test
	public void GenericsMaxinumNumberTestStringtThirdMax_thenAssertionHappy() {
		String result = (String) maxinumNumberObject.maxinumNumber("Apple", "Peach", "Watermelon");
		maxinumNumberObject.display(null, result);
		assertEquals("Watermelon",result);
	}
	@Test
	public void GenericsMaxinumNumberTestStringFirstMax_thenAssertionSad() {
		String result = (String) maxinumNumberObject.maxinumNumber("Banana","Apple", "Orange");
		maxinumNumberObject.display(null, result);
		assertEquals("Apple",result);
	}
	@Test
	public void GenericsMaxinumNumberTestStringSecondMax_thenAssertionSad() {
		String result = (String) maxinumNumberObject.maxinumNumber("Banana","Apple", "Orange");
		maxinumNumberObject.display(null, result);
		assertEquals("Apple",result);
	}
	
	@Test
	public void GenericsMaxinumNumberTestStringtThirdMax_thenAssertionSad() {
		String result = (String) maxinumNumberObject.maxinumNumber("Banana","Apple", "Orange");
		maxinumNumberObject.display(null, result);
		assertEquals("Apple",result);
	}


	
}

