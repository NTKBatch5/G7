package team.g7;
import java.util.Random;
import java.util.Scanner;

import com.noorteck.java.day31.Calculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * this is a class used to test github stashes , push and pull.
 * Qamar and Alena practices stashes, push and pull.
 * James did too.
 * day2- issam: added some comments. practiced pull and push.
 * 
 * DONT FORGET ADAM, ISAAM, AND ABDULMOSIN!!!!!!
 * we didn't forget abdul kareem and ahmad.
 * 
 * 8/2/22 abdulKareem practiced stash pull push .
 * 
 * way to go team G7 !!!!!
 */


// Our class DemoG7
public class DemoG7 {
	// main method
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
		System.out.println("****WE********************************************");
		System.out.println("******Can't***************************************");
		System.out.println("***********forget*********************************");
		System.out.println("*****************about****************************");
		System.out.println("**********************Github**********************");
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

		// STEP 6 LOOP THROUGH THE RESULTSET OBJECT (RS) AND PRINT COLUMN OR DO ANY
		// OPERATION / VALIDATION

		while (rs1.next()) {
			System.out.println("DepartmentID: " + rs1.getString("department_id"));
			System.out.println("D_name: " + rs1.getString("department_name"));
			System.out.println("LocationID: " + rs1.getString("location_id"));

			System.out.println("----------------------------");
		}
	//stm.executeUpdate(myQuery);
		
		// STep 7 CLOSE CONNECTION WITH RS, STM, CON
		
		con.close();
		stm.close();
		rs.close();
		rs1.close();
		
		System.out.println("***********************************************************");
		
		int [] test = {5,8,9,15,7,4,1};
        int [] test1 = {5,8,9,1,7,4,1};
        String [] test2 = {"muhammad", "", "issam", "ehtesham" };
        DemoG7 obj = new DemoG7();
        boolean b11 = obj.findPeak(test);
        boolean b22 = obj.findPeak(test1);
        String str = obj.findLongest(test2);
        System.out.println("before reversing: " + Arrays.toString(test)  + "\n");
        System.out.println("after reversing: "+obj.reverseArray(test) + "\n");
        System.out.println(b11+"\n");
        System.out.println(b22+"\n");
        System.out.println(str+"\n");
        System.out.println(obj.avgMinSmallValue(test)+ "\n");
        System.out.println(obj.diflargeSmall(test) + "\n");
        System.out.println(obj.diflargeSmall(test1) + "\n");
        String str11 = "1234321";
        String str21 = "1254321";
        boolean b3 = obj.isPolyndrom(str11);
        boolean b4 = obj.isPolyndrom(str21);
        System.out.println(b3+ "\n");
        System.out.println(b4+ "\n");
        String date = "7/27/2022/";
        String date1 = "a/27/2022";
        boolean b5 =  obj.checkDate(date);
        boolean b6 =  obj.checkDate(date1);
        
        System.out.println(date + " "+ b5);
        System.out.println(date1 + " " +b6+ "\n");
        boolean b7 =  obj.checkDate1(date);
        boolean b8 =  obj.checkDate1(date1);
        
        System.out.println(date + " "+ b7);
        System.out.println(date1 + " " +b8+ "\n");
        
        

	} // close main 
	

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

	// this method checks if a string is palindrom or not
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
	
	// this method checks if a number is prime or not
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
	
	
    
    public boolean checkDate1(String date){
        // check if a date is supplied is in the corect format and it is going to be a String . date should be separated by / like 7/27/2022 and first character needs to a number and within the range of 1-12
            // and for days , it should be within 1-31 and years needs to be a number.
            // 7 / 27 / 2022
            int count =0;
            for (int i =0 ; i < date.length() ; i ++){
                if (date.charAt(i) == '/'){
                    count++;
                }
            }
            if (count != 2){
                return false;
            }
            String [] arr = date.split("/");
            int num =0;
            for (int i = 0 ; i <arr.length; i++){
               try{
                   num =  Integer.valueOf(arr[i]);
               }
               catch(NumberFormatException nFe) {
                   return false;
               }
               if (i == 0 && !(num >0 && num < 13)) {
                   return false;
               }
               if (i==1 && !(num > 0 && num < 32)) {
                   return false;
               }
            }
            
        return true;
    }
    public boolean checkDate(String date){
        // check if a date is supplied is in the correct format and it is going to be a String . date should be separated by / like 7/27/2022 and first character needs to be a number and within the range of 1-12
            //  for days , it should be within 1-31 and years needs to be a number.
            // 7 / 27 / 2022
            
            String [] arr = date.split("/");
            //System.out.println(Arrays.toString(arr));
            if (arr.length != 3){
                return false;
            }
            int num =0;
            for (int i = 0 ; i <arr.length; i++){
               try{
                   num =  Integer.valueOf(arr[i]);
               }
               catch(NumberFormatException nFe) {
                   return false;
               }
               if (i == 0 && !(num >0 && num < 13)) {
                   return false;
               }
               if (i==1 && !(num > 0 && num < 32)) {
                   return false;
               }
            }
            
        return true;
    }
    boolean isPolyndrom(String str){
        boolean result = true;
        for (int i=0 ; i < str.length(); i++){
            if (str.charAt(i)!= str.charAt(str.length()-1-i)){
                result =false;
            }
        }
        return result;
    }
    ArrayList<Integer> reverseArray(int [] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = nums.length-1 ; i >= 0 ; i-- ){
            list.add(nums[i]);
        }
        return list;
    }
    int [] reverseArray1(int [] nums){
        int arr [] = new int [nums.length];
        int j = 0;
        for (int i = nums.length-1 ; i >= 0; i --){
            arr[j] = nums[i];
            j++;
        }
        return arr;
    }
    
    boolean findPeak(int [] arr){
        int max =arr[0];
        int len = arr.length;
        for (int i =0 ; i< len ; i++){
            if (arr[i] > max){
                max = arr[i];
                }
            }
            if (max == arr[len/2]){
                return true;
            }
        return false;
    }
    
    String findLongest(String [] str){
        String max ="";
        for (int i = 0 ; i < str.length; i++){
            if (str[i].length() > max.length()){
                max = str[i];
            }
        }
        return max;
    }
    
    int avgMinSmallValue(int [] arr){
        int sum =0;
        int avg = 0;
        int small = arr[0];
        int len = arr.length;
        for (int i = 0 ; i < arr.length; i ++){
            sum+=arr[i];
            if (arr[i] < small){
                small = arr[i];
            }
        }
        avg = sum / len;
        int avgMinSmall = avg - small;
        return avgMinSmall;
    }
    
    int diflargeSmall(int [] arr){
        int max = arr[0];
        int min = arr[1];
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        int diff = max - min ;
        return diff;
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

/**
 * 		\(*_*)				 _______
 * 		  ) )Z				(  O o  )
 *        / \				/   0    \
 * 						   / /|    |\ \
 *                        ///  |   |  \\\
 * 		___				        | |
 * 	   ('v')					/ \
 * 	  ((___))				   /   \
 * 		^ ^					 _|     |_
 * 				
 * nice work . piece of art!!!
 * 
 * 
 * 			  
 */




// guess method
     public static void guess() {
		
		Scanner scanner = new Scanner(System.in);
		
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(100)+1;
		
		boolean playerGuessedCorrectly= false; //1 way
		while (!playerGuessedCorrectly) {	   //1 way
		
		// OR 
		// while(true) { //2 way
		System.out.println("Enter your guess (1-100):");
		int playerGuess = scanner.nextInt();
		
		if(playerGuess == randomNumber) {
			System.out.println("Correct! You are one smart MOFO, but it took you long enough!!");
			//break; // 2 way
			playerGuessedCorrectly = true; //1 way
			
		}
		else if(randomNumber> playerGuess) {
			System.out.println("Nope! The number is higher.");
	
		}else {
			System.out.println("Nope! The number is lower.");
		}
	}
}



	int [] ary = {1,2,3,4,5}; 

	public static int getSum(int [] a) {
		int result = 0;
		for(int i = 0; i<a.length; i++) {
			result = a[i];
			System.out.println("get Sum: " + result );
		}
		return result;
	}
	public void add (int a, int b, int c) {
		System.out.println(a+b+c);
}
	public void add (double a, int b, String c) {
	System.out.println(a);
	System.out.println(b);
	System.out. println(c);
	}
	public static void main (String[] args) {
		Calculator obj = new Calculator() ;
	
	
	obj.add(2, 4);//it will call add method with 2 parameters
	obj.add(2, 4, 6); // it will call add method with 3 parameters
	
	obj.add (22.22, 111, "Java");
	
	int num= 0;
	
	System.out.println(num); //this is an example of Compile TIme Exception
	String name = null;
	System.out.println(name.length()); //the compiler will not know if this line will fail/pass
	}

}

