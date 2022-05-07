package hallo;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

public class doWhileLopp {

	public static void main(String[] args) {
		Scanner doWhile=new Scanner(System.in);
		System.out.println("Enter the number of total veriebles: ");
		int n=doWhile.nextInt();

		do {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the verieble1 ");
			int num1=input.nextInt();
			System.out.println("Enter the verieble2 ");
			int num2=input.nextInt();
			System.out.println(num1+num2);
			
			Scanner doWhile1=new Scanner(System.in);
			System.out.println("do you wanted to continew press 1 other wise press 2: ");
			int n1=doWhile1.nextInt();
			if(n1==1) {
				continue;
			}else {
				break;
			}
			
		}while(n>0);
	}

}
