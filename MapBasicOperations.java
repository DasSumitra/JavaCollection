package com.map.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapBasicOperations {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		System.out.println("Map Size :" + map.size());
		System.out.println("Map elements :" + map.isEmpty());
		map.put(1010, "Apple");
		map.put(1020, "Cat");
		map.put(1030, "Rat");
		map.put(1040, "Horse");
		System.out.println("Map Size :" + map.size());
		System.out.println("Map elements :" + map.isEmpty());
		System.out.println("Map key  element check :"+map.containsKey(1030));
		System.out.println("Map key  element check :"+map.containsKey(1090));
		System.out.println("Map value  element check :"+map.containsValue("Cat"));
		System.out.println("Map value  element check :"+map.containsValue("Ball"));
		System.out.println("Remove map  element  :"+map.remove(1010));
		System.out.println("print map afetr remove element :"+map);
		System.out.println("Remove map  element  :"+map.remove(1010, "Apple"));
		System.out.println("Remove map  element  :"+map.remove(1020, "Cat"));
		System.out.println("print map afetr remove element :"+map);
		System.out.println("Get Map  element  :"+map.get(1030));
		//map.clear();
		//System.out.println("Map "+map);
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(3030, "Dog");
		map2.put(3020, "Monkey");
		map2.putAll(map);
		System.out.println("Print Map2 Elements :"+map2);
		
		Set<Integer>key=map.keySet();
		System.out.println("Map keys are : "+key);
		
		for(String s:map.values()) {
			System.out.println("Map values are : "+s);
		}
		for(Map.Entry<Integer, String>entry:map.entrySet()) {
			System.out.println("Map keys and values : "+entry.getKey()+" : "+entry.getValue());
		}
		Iterator <Integer>it=map.keySet().iterator();
		while(it.hasNext()) {
			Integer keys=(Integer) it.next();
			String values=map.get(keys);
			System.out.println("Map key and value : "+keys+" : "+values);
		}
		
	}

}
