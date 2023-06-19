package com.zad.eng.excellence.core.standard.group;

public class StringAndStringBufferExamples {

	public static void main(String args[]) {
		StringAndStringBufferExamples instance = new StringAndStringBufferExamples();
		instance.basicOperationExamples();

	}

	public void basicOperationExamples() {
		String str1 = "Welcome To String ";
		str1 = str1 + "Example"; 
		System.out.println("The final String is - " + str1);

		StringBuffer str2 = new StringBuffer("Welcome To StringBuffer ");
		str2.append("Example"); 
		System.out.println("The final String is - " + str2);

		StringBuilder str3 = new StringBuilder("Welcome To StringBuilder ");
		str3.append("Example"); 
		System.out.println("The final String is - " + str3);

	}

	// Write Some Important advance methods for Practice:

}
