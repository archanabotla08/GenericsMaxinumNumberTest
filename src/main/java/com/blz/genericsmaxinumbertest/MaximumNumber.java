package com.blz.genericsmaxinumbertest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MaximumNumber extends FindMax {

	public static int maxInteger;
	public static int resultInt;
	public static float maxFloat;
	public static String maxString;

	public static void main(String[] args) {
		MaximumNumber maxNumber = new MaximumNumber();
		System.out.println("Integer Max  :" + maxNumber.maxinumNumber(20, 30, 59));
		System.out.println("Float Max: " + maxNumber.maxinumNumberFloat(30.9f, 40.3f, 90.2f));
		System.out.println("String : " + maxNumber.maxinumNumberString("Apple", "Banana", "Orange"));
		
	}

	// First method to find max number
	public int maxinumNumberCollection(List<Integer> inputList) {
		resultInt = Collections.max(inputList, new FindMax());
		return resultInt;
	}

	// Second Method to find max
	public int maxinumNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {

		maxInteger = firstNumber;
		if (secondNumber.compareTo(firstNumber) > 0) {
			maxInteger = secondNumber;
		}
		if (thirdNumber.compareTo(secondNumber) > 0) {
			maxInteger = thirdNumber;
		}

		return maxInteger;
	}

	// Max method for Float
	public float maxinumNumberFloat(Float firstNumber, Float secondNumber, Float thirdNumber) {

		maxFloat = firstNumber;
		if (secondNumber.compareTo(firstNumber) > 0) {
			maxFloat = secondNumber;
		}
		if (thirdNumber.compareTo(secondNumber) > 0) {
			maxFloat = thirdNumber;
		}

		return maxFloat;
	}

	// String method
	public String maxinumNumberString(String firstValue, String secondValue, String thirdValue) {

		maxString = firstValue;
		if (secondValue.compareTo(firstValue) > 0) {
			maxString = secondValue;
		}
		if (thirdValue.compareTo(secondValue) > 0) {
			maxString = thirdValue;
		}

		return maxString;
	}

}

class FindMax implements Comparator<Integer> {
	@Override
	public int compare(Integer object_1, Integer object_2) {
		return object_1.compareTo(object_2);
	}
}

class FindMaxString implements Comparator<String> {
	@Override
	public int compare(String object_1, String object_2) {
		return object_1.compareTo(object_2);
	}
}
