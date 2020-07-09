package com.epam.lambdas_and_streams;
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
public class Task2{
	public void print() {
		List<String> list=new ArrayList<String>();
		list.add("chandler");
		list.add("joey");
		list.add("rachel");
		list.add("monica");
		list.add("ross");
		list.add("phoebe");
		list.add("adam");
		list.add("ace");
		list.add("ana");
		List<String> res=startswithAandLengthThree(list);
		for(String s:res)
			System.out.println(s);
	}
	public List<String> startswithAandLengthThree(List<String> l){
		return l.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).collect(Collectors.toList());
	}
}