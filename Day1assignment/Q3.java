package Day1assignment;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		int noOfStudent;
		double average;
		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		noOfStudent = in.nextInt();
		int grades[] = new int[noOfStudent];
		for(int i=1; i<=noOfStudent; i++) {
			System.out.println("Enter the grade for student " + i + ":");
			int marks = in.nextInt();
			if(marks >=0 && marks <=100) {
				grades[i-1] = marks;
				sum += marks;
			}
			else {
				System.out.println("Invalid grade, try again...");
				i--;
			}
				
		}
		average= (double)sum/noOfStudent;
		System.out.println("The average is: " + average);
		in.close();
	}

}
