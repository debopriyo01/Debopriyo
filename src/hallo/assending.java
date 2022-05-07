package hallo;
import java.util.Scanner;
public class assending {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Enter the total elemnts of the arrey:");
int size=input.nextInt();
int arr[]=new int[size];
int temp;
for(int i=0;i<arr.length;i++) {
	
	System.out.println("Enter the elements one bye one :");
	arr[i]=input.nextInt();
}

for(int i=0;i<arr.length-1;i++) {
	
	if(arr[i]<arr[i+1]) {
	temp=arr[i];
	arr[i]=arr[i+1];
	arr[i+1]=temp;
	
}
}
System.out.println("\n");
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}

	}

}
