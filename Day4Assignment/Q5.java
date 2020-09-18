package Day4Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter a no. or enter -1 to quit");
				int n= sc.nextInt();
				if(n== -1)
					break;
				else if(n>100)
					throw new Exception("Number can't be greater than 100");
				else if(n%2 !=0) 
					System.out.println("You have entered an odd number");
				else
					System.out.println("You have entered an even integer");
			}catch (InputMismatchException e) {
				System.out.println("You must enter an integer");
				sc.next();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		sc.close();
	}

}
