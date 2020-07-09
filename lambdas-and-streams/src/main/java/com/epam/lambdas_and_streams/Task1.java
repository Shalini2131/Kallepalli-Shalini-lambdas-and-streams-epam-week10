package com.epam.lambdas_and_streams;
import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
public class Task1{
	public static void print(){
	List<Integer> list=Arrays.asList(11,14,16,9,21);
	OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
	System.out.println("The average of the list is "+avg.getAsDouble());
	}
}