package team.g7;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * this is a class used to test github stashes , push and pull.
 * Qamar and Alena practices stashes, push and pull.
 * James did too.
 * 
 * DONT FORGET ADAM, ISAAM, AND ABDULMOSIN!!!!!!
 */

public class DemoG7 {
	// main method
	public static void main(String[] args) {
		System.out.println("G7 team is testing github....");
		System.out.println("Test");

		String var = " JAva IS LOVELY";
		String var2 = " SDET sdet sdet";
		String str1 = reverseWord(var);
		String str2 = reverseWord(var2);
		System.out.println(str1);
		System.out.println(str2);
	}

	// this method reverses string word by word
	public static String reverseWord(String str) {
		String result = "";

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];

			String reverse = "";

			for (int j = word.length() - 1; j >= 0; j--) {

				reverse = reverse + word.charAt(j);
			}
			result = result + reverse + " ";
		}
		result = result.trim();
		return result;
	}

// hello team g7 ----> THE BEST TEAM IN B7*
	public static void display() {
		System.out.println(" team G7 rocks");
		System.out.println("*************");
		System.out.println("Rain Rain Go Away");
		System.out.println("Java is fun");
	}

	// add method
	public static void add(int a, int b) {
		System.out.println(a + b);

		System.out.println("G7 Rocks");
		System.out.println("adam was here");

		System.out.println("I hope we dont mess this up!!!!!!!!!");

		System.out.println("While you are all sleeping!!!!");

		System.out.println("its going to look like a whole new document next time you PULL!");

	}
//comment 
//testing again

//printing java loving messages
	public static void print() {
		System.out.println("we are java lovers");
		System.out.println("we are java lovers");
		System.out.println("we are java lovers");
		System.out.println("we are java lovers");
		System.out.println("we are java lovers");
		System.out.println("we are java lovers");
		System.out.println("we are java lovers");
		System.out.println("we are java lovers");

	}

	public HashMap<String, String> reverse(ArrayList<String> list) {
		HashMap<String, String> myMapList = new HashMap<>();

		// to do

		return myMapList;
	}
}
