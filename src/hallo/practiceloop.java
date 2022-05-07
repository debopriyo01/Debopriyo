//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
package hallo;

import java.util.Scanner;
public class practiceloop {

	public static void main(String[] args) {
	
		
		
		
		
	Scanner reverced=new Scanner(System.in);
System.out.println("Enter the string : ");
String num = reverced.nextLine();

while(num>0) {
	
  int r=num%10;
	num=num/10;
	System.out.println(r);
}

	}

}
