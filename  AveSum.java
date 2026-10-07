import java.util.Scanner;

public class Calculator{
	public static void main(String[] args) {
	
		int num1,num2, Total;
		
		Scanner inputDevice = new Scanner(System.in) ;
		System.out.print("Enter First Number ") ;
		num1 = inputDevice.nextInt() ;
		System.out.print("Enter Second Number ");
		num2 = inputDevice.nextInt();
		Total = num1 + num2;
		System.out.println("The Sum is " + Total);
		System.out.println("The average of two number is "+ (num1+num2)/2);
		
	}
}