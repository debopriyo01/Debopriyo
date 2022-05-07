// only the out put will be 375;-
package hallo;
public class amstrongNumber {

	public static void main(String[] args) {
	
	
	
	
	// taking the veriebls hear:-
  int temp;
	int digit1,digit2,digit3;
	
	for(int number=1;number<=500;number++) {
		
		
		temp=number;
		digit1=number%10;
		
		temp=number/10;
		digit2=number%10;
		
		
		temp=number/10;
		digit3=number%10;
		
// lets take the condition now :-
if(digit1*digit1*digit1+digit2*digit2*digit2+digit3*digit3*digit3==number) {
	System.out.println(number);
	
}
	}	
	
	
	
	
	
	
	
	}
	}
