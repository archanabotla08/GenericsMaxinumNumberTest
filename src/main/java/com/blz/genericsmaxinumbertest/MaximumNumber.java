package com.blz.genericsmaxinumbertest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MaximumNumber extends FindMax {
	
	public static int maxInteger;
	public static int result;
	public static void main(String[] args) {
			
	}
	
	//First method to find max number
	public int maxinumNumberCollection(List<Integer> inputList) {
		 result = Collections.max(inputList,new FindMax());		
		return result;
	}
	
	//Second Method to find max
	public int maxinumNumber(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {
		
		maxInteger = firstNumber;
		if(secondNumber.compareTo(firstNumber) > 0 ) {
			maxInteger = secondNumber;
		}
		if(thirdNumber.compareTo(secondNumber) > 0) {
			maxInteger = thirdNumber;
		}
		
			return maxInteger;
	}
}

class FindMax implements Comparator<Integer>{
	@Override
	public int compare(Integer object_1,Integer object_2) {
		return object_1.compareTo(object_2);
	}
}
