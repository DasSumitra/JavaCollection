package com.convertion.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50};
		
		System.out.println("After converting array to List elements are : "+arryToListConvertion(arr));
		System.out.println("After converting array to List elements are : "+getArryToListConvertion());
	}
	public static List<Integer> arryToListConvertion(int[]arr){
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		return  list;
	}
	public static List<Integer> getArryToListConvertion(){
		List<Integer>list=new ArrayList<>(Arrays.asList(90,80,70,60,50));
		return  list;
	}
	
	

}
