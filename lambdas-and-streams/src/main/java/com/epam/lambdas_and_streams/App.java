package com.epam.lambdas_and_streams;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.io.*;
public class App 
{
    public static void main( String[] args )
    {
       Task1 t1 = new Task1();
       System.out.println("--------------Task 1-------------------");
       t1.print();
       System.out.println();
       Task2 t2 = new Task2();
       System.out.println("--------------Task 2-------------------");
       System.out.println("The words that starts with 'a' and having length exactly three are:");
       t2.print();
       System.out.println();
       Task3 t3 = new Task3();
       System.out.println("--------------Task 3-------------------");
       System.out.println("The palindrome words are:");
       t3.print();
    }
}
