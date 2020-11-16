package com.blz.genericsmaxinumbertest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MaximumNumber {

	public static <T extends Comparable<T>> T maxinumNumber(T variable1,T variable2,T variable3) {
		T maxVariable = variable1;
		if(variable2.compareTo(maxVariable) > 0) {
			maxVariable = variable2;
		}
		if(variable3.compareTo(maxVariable) > 0) {
			maxVariable = variable3;
		}
		return maxVariable;
	}
}
