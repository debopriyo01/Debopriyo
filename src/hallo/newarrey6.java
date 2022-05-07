package hallo;

import java.util.Scanner;
public class newarrey6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int arr[]=new int[10];
		
		System.out.println("Enter the elements in the arrey:");
	for(int i=0;i<arr.length;i++) {
		arr[i]=input.nextInt();
	}
	System.out.println("The odd numbers of the arrey is : ");
		for(int i=0;i<10;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
			
		
		}
	
}
}