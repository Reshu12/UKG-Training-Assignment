package Day4Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max_range = sc.nextInt();
		while(true) {
			try {
				System.out.println("Enter a no. or enter -1 to quit");
				int n= sc.nextInt();
				if(n== -1)
					break;
				else if(n>100)
					throw new InputException(max_range);
				else if(n%2 !=0) 
					System.out.println("You have entered an odd number");
				else
					System.out.println("You have entered an even integer");
			}catch (InputMismatchException e) {
				System.out.println("You must enter an integer");
				sc.next();
			} catch (InputException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		sc.close();

	}

}
