package com.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//sorted in stream
public class streamSort {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,4,6,3,9);
	List<Integer>sortedList=list.stream().sorted().collect(Collectors.toList());
	
	System.out.println(sortedList);
	//descending
	List<Integer>reversesort=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

	System.out.println(reversesort);
}
}
