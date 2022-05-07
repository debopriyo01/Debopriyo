package hallo;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
public class count {

	public static void main(String[] args) {
 Scanner Elements=new Scanner(System.in);
 
 
 System.out.println("Enter the total number of elemnets: ");
 int total=Elements.nextInt();
 
 int countPosetive=0;
 int countNegetive=0;
 int countZero=0;
 while(total>0) {
	 
	 
	 Scanner number=new Scanner(System.in);
	 System.out.println("Enter the num : ");
	 int num=number.nextInt();
	 
	 if(num>0) {
		 countPosetive++;
	 }else if(num<0) {
		 countNegetive++;
	 }else {
		 countZero++;
	 }
	 Scanner choice=new Scanner(System.in);
System.out.println("Enter your choice");
int ch=choice.nextInt();

if(ch==1) {
	continue;
 }else {
	 break;
 }
 }
 System.out.println("The posetive element Enterned are ");
	System.out.println(countPosetive); 
	 System.out.println("The Negetive element Enterned are ");
	System.out.println(countNegetive); 
	 System.out.println("The Zero element Enterned are ");
	System.out.println(countZero);
	} 
	}


