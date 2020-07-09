package com.epam.lambdas_and_streams;
import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
public class Task3{
	public void print() {
		List<String> list=new ArrayList<String>();
		list.add("radar");
		list.add("bacab");
		list.add("dacad");
		list.add("barbie");
		List<String> result=palindromeList(list);
		for(String s:result)
			System.out.println(s);
	}
	public List<String> palindromeList(List<String> l){
		List<String> res=new ArrayList<String>();
		for(String s:l)
		{
			String temp=s.replaceAll("\\s+","").toLowerCase();
			if(IntStream.range(0,temp.length()/2).noneMatch(i->temp.charAt(i)!=temp.charAt(temp.length()-i-1)))
				res.add(s);
		}
		return res;
	}
}