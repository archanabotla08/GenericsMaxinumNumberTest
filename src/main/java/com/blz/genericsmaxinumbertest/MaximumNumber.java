package com.blz.genericsmaxinumbertest;

public class MaximumNumber<T extends Comparable<T>> {

	T variable1, variable2, variable3;

	public MaximumNumber(T variable1, T variable2, T variable3) {
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.variable3 = variable3;
	}

//	public T maximumNumber() {
//		return (T) MaximumNumber.maximumNumber(variable1, variable2, variable3);
//	}

	public static <T extends Comparable<T>> T maxinumNumber(T variable1, T variable2, T variable3) {
		T maxVariable = variable1;
		if (variable2.compareTo(maxVariable) > 0) {
			maxVariable = variable2;
		}
		if (variable3.compareTo(maxVariable) > 0) {
			maxVariable = variable3;
		}
		return maxVariable;
	}
}
