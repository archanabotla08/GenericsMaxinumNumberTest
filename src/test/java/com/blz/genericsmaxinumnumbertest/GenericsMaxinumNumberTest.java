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

	static MaximumNumber number;
	public List<Integer> inputList =  Arrays.asList(50,10,20);
	@BeforeClass
	public static void GenericsMaxinumNumberCreation() {
		number = new MaximumNumber();
	}
	@AfterClass
	public static void nullObject() {
		number = null;
	}
	@Test
	public void GenericsMaxinumNumberTestIntegerFirstNumberMax_thenAssertionHappy() {
		assertEquals(30,number.maxinumNumber(30, 20, 10));
	}
	@Test
	public void GenericsMaxinumNumberTestIntegeSecondNumberMax_thenAssertionHappy() {
		assertEquals(90,number.maxinumNumber(50, 90, 10));
	}
	
	@Test
	public void GenericsMaxinumNumberTestIntegetThirdNumberMax_thenAssertionHappy() {
		assertEquals(100,number.maxinumNumber(50, 90, 100));
	}
	@Test
	public void GenericsMaxinumNumberTestIntegetList_thenAssertionHappy() {
		assertEquals(50,number.maxinumNumberCollection(inputList));
	}
	@Test
	public void GenericsMaxinumNumberTestIntegerFirstNumberMax_thenAssertionSad() {
		assertEquals(20,number.maxinumNumber(30, 20, 10));
	}
	@Test
	public void GenericsMaxinumNumberTestIntegeSecondNumberMax_thenAssertionSad() {
		assertEquals(30,number.maxinumNumber(50, 90, 10));
	}
	
	@Test
	public void GenericsMaxinumNumberTestIntegetThirdNumberMax_thenAssertionSad() {
		assertEquals(10,number.maxinumNumber(50, 90, 100));
	}
	@Test
	public void GenericsMaxinumNumberTestIntegetList_thenAssertionSad() {
		assertEquals(10,number.maxinumNumberCollection(inputList));
	}
	
	
	//test cases for float
	@Test
	public void GenericsMaxinumNumberTestFloatFirstNumberMax_thenAssertionHappy() {
		assertEquals(50.9f, number.maxinumNumberFloat(50.9f, 90.3f, 10.9f),0.01);
	}
	@Test
	public void GenericsMaxinumNumberTestFloatSecondNumberMax_thenAssertionHappy() {
		assertEquals(90.3f,number.maxinumNumberFloat(50.9f, 90.3f, 10.9f),0.01);
	}
	
	@Test
	public void GenericsMaxinumNumberTestFloatThirdNumberMax_thenAssertionHappy() {
		assertEquals(100.9f,number.maxinumNumberFloat(50.1f, 90.2f, 100.9f),0.01);
	}
	@Test
	public void GenericsMaxinumNumberTestGenericsFloatFirstNumberMax_thenAssertionSad() {
		assertEquals(10.9f, number.maxinumNumberFloat(100.9f, 50.0f, 79.1f), 0.01);
	}
	@Test
	public void GenericsMaxinumNumberTestFloatSecondNumberMax_thenAssertionSad() {
		assertEquals(9.3f,number.maxinumNumberFloat(50.9f, 90.3f, 10.9f),0.01);
	}
	
	@Test
	public void GenericsMaxinumNumberTestFloatThirdNumberMax_thenAssertionSad() {
		assertEquals(10.9f,number.maxinumNumberFloat(50.1f, 90.2f, 100.9f),0.01);
	}

	
	//test cases for String
	@Test
	public void GenericsMaxinumNumberTestStringFirstMax_thenAssertionHappy() {
		assertEquals( "Orange", number.maxinumNumberString("Banana","Apple", "Orange"));
	}
	@Test
	public void GenericsMaxinumNumberTestStringSecondMax_thenAssertionHappy() {
		assertEquals("Peach",number.maxinumNumberString("Apple", "Peach", "Banana"));
	}
	
	@Test
	public void GenericsMaxinumNumberTestStringtThirdMax_thenAssertionHappy() {
		assertEquals("Watermelon",number.maxinumNumberString("Apple", "Peach", "Watermelon"));
	}
	@Test
	public void GenericsMaxinumNumberTestStringFirstMax_thenAssertionSad() {
		assertEquals("Apple", number.maxinumNumberString("Banana","Apple", "Orange"));
	}
	@Test
	public void GenericsMaxinumNumberTestStringSecondMax_thenAssertionSad() {
		assertEquals("Apple",number.maxinumNumberString("Banana","Apple", "Orange"));
	}
	
	@Test
	public void GenericsMaxinumNumberTestStringtThirdMax_thenAssertionSad() {
		assertEquals("Apple",number.maxinumNumberString("Banana","Apple", "Orange"));
	}
}

