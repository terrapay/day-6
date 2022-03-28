package com.tata.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(-1);
		list.add(-15);
		list.add(101);
		System.out.println(list);
		Stream<Integer> stream = list.stream();
		Stream filtered = stream.filter((Integer arg0)-> {
				System.out.println(arg0);
				return arg0 > 0;
		})
				.sorted((number1, number2)->  number1- number2);
		
		List<Integer> finalvalue =  (List<Integer>) filtered.collect(Collectors.toList());
		System.out.println(finalvalue);
	}
}
