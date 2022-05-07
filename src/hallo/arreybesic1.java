package hallo;
import java.util.Scanner;
public class arreybesic1 {

	public static void main(String[] args) {
		
		//lets declear an arrey over hear:-
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total elements of the arrey: ");
    int total=sc.nextInt();
    
    int arr[]=new int [total];
    
    for(int i=0;i<total;i++) {
    	
    System.out.println("Enter the  elemnts one bye one : "+i);
    	arr[i] =sc.nextInt();
    }
    System.out.println("Enter the value of x now: ");
    int x=sc.nextInt();
    for(int i=0;i<total;i++) {
    	if(arr[i]==x)
    		System.out.println("The index of the value x is:"+i);
    		
    		
    	}
    if(x>10) {
		System.out.println("x is the largest number");
	}else {
		System.out.println("x is smallest number");
	}
    }
    
}



