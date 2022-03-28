package com.tata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NewStringMethods {
	public static void main(String[] args) {
		String s1 = "Terra pay";
		String s2 = s1.repeat(2);
		System.out.println(s2);
		
		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("John");
		 Object[] strings = list.toArray();
		System.out.println(strings);
	}
}
