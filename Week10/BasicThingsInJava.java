package Week10;

//includes
import java.util.Scanner;
import java.util.Random;

public class BasicThingsInJava {
    
    //setting up the cin >>
    static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	//cout << and \n
	System.out.println("Initiating Program \n"); // '\n' not needed
	System.out.println("-------------------------------------");

	//declaring variables, incrementation and const
	int comparison_num = 0;
	comparison_num++; //also +=1
	System.out.println("comparison_num: " + comparison_num);
	comparison_num+=1; 
	System.out.println("comparison_num: " + comparison_num);
	//String description = ""; //string is a TYPE
	//boolean flag = false; //not bool == boolean
	//String name = "Chayce Leonard";
	//final double studentSSN = 5.31; // const == final
	System.out.println("-------------------------------------");

	//using cin >>
	//name2 = sc.next();
	//System.out.println("Welcome to Java: " + name2 + "\n");
	System.out.println("-------------------------------------");

	//other scanner methods
	//sc.next();	//obtain until a delimeter
	//sc.nextInt(); //obtain next int		
	System.out.println("-------------------------------------");

	//accessing elements of a string
	String firstname = "joe";
	String lastname = "joe";
	//System.out.println("Enter firstname:\t");
	//String firstname = sc.next();
	//System.out.println("Enter lastname:\t");
	//String lastname = sc.next();
	//String account = firstname.toLowerCase().charAt(0) + lastname.toLowerCase();
	//System.out.println("Account will be: \t" + account + "31@javamail.org");
	System.out.println("-------------------------------------");

	//find length of strings
	//System.out.println(firstname.length() + " is the length of: " + firstname);
	//System.out.println(lastname.length() + " is the length of: " + lastname);
	System.out.println("-------------------------------------");

	//comparison and if, else if, else
	String evaluation = "These names are of equal length";
	if(firstname.length() < lastname.length()) {evaluation = "First name is of lesser length";}
	else if(firstname.length() > lastname.length()) {evaluation = "Last name is of lesser length";}
	else if(firstname.compareTo(lastname) == 0) {evaluation = "Names are the same";}
	else{evaluation = "names are equal length";}
	System.out.println(evaluation);
	System.out.println("-------------------------------------");

	
	//concatenation
	Random r = new Random();
	int x = r.nextInt(899)+100;
	int y = r.nextInt(899)+100;
	int z = r.nextInt(8999)+1000;
	String phone_number = x + "-" + y + "-" + z;
	System.out.println(phone_number);
	System.out.println("-------------------------------------");
	
	
	//string methods
	String email_address = "Woah31@javamail.com";
	int index_of_delimiter = email_address.indexOf("@");
	
	System.out.println("@ symbol index: " + index_of_delimiter);
	System.out.println("-------------------------------------");
	
	//more String methods
	//replace part of a string
	System.out.println(email_address.replace("31", "69"));
	String before_delimter = email_address.substring(0, index_of_delimiter);
	String after_delimter = email_address.substring(index_of_delimiter+1);
	System.out.println("String Before_delimeter: " + before_delimter);
	System.out.println("String After_delimiter: " + after_delimter);
	System.out.println("-------------------------------------");

	

	

	
	
	
    }

}
