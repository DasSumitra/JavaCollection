package com.list.operations;

import java.util.ArrayList;
import java.util.List;

public class CharListToArray {

	public static void main(String[] args) {
		List<Character>list=new ArrayList<>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		System.out.println("List ements are : "+list);
		char[]ch=new char[list.size()];
		for(int i=0;i<list.size();i++) {
			ch[i]=list.get(i);
			System.out.println("char array elements are : "+ch[i]);
		}
		Character[]c=list.toArray(new Character[0]);
		for(Character cc:list) {
			System.out.println("print "+cc);
		}
		
	}

}
