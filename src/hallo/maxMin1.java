package hallo;
import java.util.Scanner;
public class maxMin1 {

	public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
// System.out.println("Enter the number of elemnts thet You want to put:");
// int size=input.nextInt();
boolean assesnding=true;
boolean dessending =false;
int flag=0;
 int arr[]=new int[10];
 for(int i=0;i<arr.length;i++) {
	 
	 System.out.println("Enter the elemnts of the arrey: ");
	 arr[i]=input.nextInt();
	 
	 
 }
 //lets creat an another for loop;-
 for(int i=0;i<arr.length-1;i++) {
	 
	 if(arr[i]>arr[i+1]) {
		  flag=1;
		 
	 }else {
		  flag=0;
	 }
 } 
	 if(flag==1) {
		 System.out.println("assending");
 }else {
	 System.out.println("desending");
 }
}
}
