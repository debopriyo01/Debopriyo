// write a proggram in java to short an arrey in the assending order:-
package hallo;
import java.util.Scanner;
public class newarrey3 {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int temp;
int arr[]=new int[6];

for(int i=0;i<6;i++) {
	System.out.println("Enter the elements m one bye one");
	arr[i]=input.nextInt();
}

for(int i=0;i<arr.length;i++) {
	
	int min=arr[i];
	
	for(int j=i+1;j<arr.length;j++) {
		
		if(arr[i]>arr[j]) {
			 temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}
	}
	for(int k=0;k<arr.length;k++) {
		System.out.println(arr[k]);
	}
}
}
