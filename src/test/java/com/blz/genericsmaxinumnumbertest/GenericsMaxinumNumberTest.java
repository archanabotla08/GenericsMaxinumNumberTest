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
}
