package com.convertion.test;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);	
		getListToArrayElements(list);
		listToArrayConvertion();
	}
		
		public static void getListToArrayElements(List<Integer>list) {
			
			int[]arr=new int[list.size()];
			for(int i=0;i<list.size();i++) {
				arr[i]=list.get(i);
				System.out.println("After converting list to array elements are :"+arr[i]);
			}	
		}
		public static void listToArrayConvertion() {
			List<Integer>list=new ArrayList<>();
			list.add(100);
			list.add(200);
			list.add(300);
			list.add(400);
			list.add(500);
			Integer[]arr=list.toArray(new Integer[0]);
			for(Integer i:arr) {
				System.out.println("Array elements :"+i);
			}
		}
		
	}
	


