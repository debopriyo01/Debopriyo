// write a proggram to short the elemnts and arrange them in the assending for where n is user by the input :_
package hallo;

import java.util.Scanner;
public class newarreyShorting {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("Enter the size of the arrey:");
    int size=input.nextInt();
    int arr[]=new int[size];
    int min;
    int temp;
    
    // lets creat the for loop for inputing the value of the elemnts:
    System.out.println("Enter the elemnts of the arre:");
    for(int i=0;i<size;i++) {
    arr[i]=input.nextInt();
    }
    
    for(int i=0;i<arr.length-1;i++) {
    	
    	min=arr[0];
    	
    	if(min>arr[i]) {
    		
    		 temp=min;
    		min=arr[i];
    		arr[i]=temp;
    		
    	}
    }  
    
    for(int i=0;i<arr.length;i++) {
    	
    	System.out.println(arr[i]);
    }
    System.out.println("\n");
	

    
    
    
    
    
	}

}
