package com.zad.eng.excellence.core.standard.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.zad.eng.excellence.core.util.DataSetPreperationUtil;

public class ArrayListAndLinkedListExamples {

	public static void main(String args[]) 
	{
		ArrayListAndLinkedListExamples instance = new ArrayListAndLinkedListExamples();
		instance.arrayListBasicMethodExamples();
		instance.linkedListBasicMethodExamples();
	}
	
	public void arrayListBasicMethodExamples()
	{
		List<String> nameList = DataSetPreperationUtil.prepareAndGetNameList();		
	
		System.out.println("====================================================");
		System.out.println("Print The Names of All ");
		for (String name : nameList) {
			System.out.println(name);
		}
		
		System.out.println("====================================================");
		System.out.println("Sort the Names of All");
		Collections.sort(nameList);
		for (String name : nameList) {
			System.out.println(name);
		}
	}
	
	
	public void linkedListBasicMethodExamples()
	{
		List<String> nameList = DataSetPreperationUtil.prepareAndGetNameList();	
		
		List<String> nameLinkedList = new LinkedList<String>();
		nameLinkedList.addAll(nameList);
	
		System.out.println("====================================================");
		System.out.println("Print The Names of All ");
		for (String name : nameLinkedList) {
			System.out.println(name);
		}
		
		System.out.println("====================================================");
		System.out.println("Sort the Names of All");
		Collections.sort(nameLinkedList);
		for (String name : nameLinkedList) {
			System.out.println(name);
		}
	}
	

	// Write Some More Important Methods for Practice:
	
	
	
	


}
