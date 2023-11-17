



import java.util.Scanner;

public class Double_Calculator {

	public static void main(String[] args) {
		
				//Making a Simple Calculator
				
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter First number");
				double a = sc.nextDouble();
				
				System.out.println("Enter Second Number");
				double b = sc.nextDouble();
				
				System.out.println("The Differnce is:  ");
				double sum = a+b;
				double diff = a-b;
				double multply = a*b;
				double div = a/b;
				
				System.out.print("The sum is: ");
				System.out.println(sum);
				System.out.print("The Difference is: ");
				System.out.println(diff);
				System.out.print("The Multiplication is: ");
				System.out.println(multply);   
				System.out.print("The Division is: ");
			    System.out.println(div);

			
		

	}

}
