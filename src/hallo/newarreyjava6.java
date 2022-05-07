// wap to input two arrey an marge them and display the arrey in assending order;
package hallo;
import java.util.Scanner;
public class newarreyjava6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	int arr1[]=new int[7];
	int arr2[]=new int[7];
	System.out.println("Enter the elemnts for arr1:");
for(int i=0;i<arr1.length;i++) {
	System.out.println("Enter the elemnts one by one :");
	arr1[i]=input.nextInt();
	
}
System.out.println("Enter the elemnts for arr32:");
for(int i=0;i<arr2.length;i++) {
	System.out.println("Enter the elemnts one by one :");
	arr2[i]=input.nextInt();
}


for(int i=6;i>-1;i--) {
	
	for(int j=i;j>i-1;j--) {
		
		System.out.print(arr1[i]);
		System.out.print(arr2[j]);
	}

}

}
}

	
	
	
	
	
	
	
	
	
	
	


