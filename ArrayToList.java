package com.list.operations;

import java.util.ArrayList;

public class ArrayToList {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("Array Size() :" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array elements are : " + arr[i]);
		}
		ArrayList<Integer> listOfInts = new ArrayList<>(arr.length);
		for (int i : arr) {
			listOfInts.add(i);
		}
		System.out.println("Array elements  are after converstion :" + listOfInts);

	}

}
