package com.blz.genericsmaxinumbertest;

public class MaximumNumber<T extends Comparable<T>> {

	public static <T extends Comparable<T>> T maxinumNumber(T...types) {
		T maxVariable = types[0];
		for(T type: types)
			if(type.compareTo(maxVariable) > 0)
				maxVariable = type;
		return maxVariable;
	}

}
