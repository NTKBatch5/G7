package team.g7;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * this is a class used to test github stashes , push and pull.
 * Qamar and Alena practices stashes, push and pull.
 * James did too.
 * 
 * DONT FORGET ADAM, ISAAM, AND ABDULMOSIN!!!!!!
 * we didn't forget abdul kareem and ahmad.
 * 
 * way to go team G7 !!!!!
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
		
		boolean b1 = isPalindrom("LEVEL");
		System.out.println(b1);
		boolean b2 = isPalindrom("sdet");
		System.out.println(b2);
		
		
		
		
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		
		System.out.println("**************************************************");
		
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "123456";
		String myQuery = "select * from hr.employees;";
		String query1 = "select * from hr.departments;";
		
		// STEP 1 MAKE SURE WE HAVE THE DATABASE DEPENDENCY IN THE POM.XML FILE
		
		// STEP 2 LOAD THE DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// STEP 3 CREATE A CONNECTION WITH DATABASE
		Connection con = DriverManager.getConnection(url, username, password);
		
		// STEP 4 CREATE A STATEMENT OBJECT
		// STATEMENT OBJECT ALLOWS US TO PERFORM DATABASE OPERATIONS (INSERT, SELECT, DELETE, UPDATE)
		Statement stm = con.createStatement();
		Statement stm2 = con.createStatement();
		
		// STEP 5 EXECUTE THE QUERY AND STORE THE RESULT IN RESULTSET OBJECT
		
		ResultSet rs = stm.executeQuery(myQuery);
		ResultSet rs1 = stm2.executeQuery(query1);
		
		// STEP 6 LOOP THROUGH THE RESULTSET OBJECT (RS) AND PRINT COLUMN OR DO ANY OPERATION / VALIDATION
		
		while(rs.next()) {
			System.out.println("FN: "+ rs.getString("first_name"));
			System.out.println("LN: "+ rs.getString("last_name"));
			System.out.println("$$: "+ rs.getString("salary"));
			System.out.println("JobID: "+ rs.getString("job_id"));
			System.out.println("email: "+ rs.getString("email"));
			System.out.println("----------------------------");
			


		}
		
		
		
		
		
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
	
	public static boolean isPalindrom(String str1) {
		boolean result = false;
		String reverse = "";
		char[] cha = str1.toCharArray();
		for (int i = cha.length - 1; i >= 0; i--) {
			reverse = reverse + cha[i];
		}
		if (str1.equals(reverse)) {
			result = true;
		}
		return result;
	}
	
	
	public static boolean isPrime(int num) {
		
		int count=0;
		
		boolean result = false;
		
		
		if(num > 1) {
						
			for(int i = 1; i <= num; i++) {
			
				if(num % i == 0) {
					
					count++;
					
				}
			}		
		}
		if(count==2) {
			result = true;
		}
		
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
