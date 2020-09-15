package Day2assignmentQ4;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Student student = null;
		while (true) {
			System.out.println("1. Create Student object \n 2. Display student info");
			System.out.println("Your choice:");
			int option = in.nextInt();
			in.nextLine(); 
			switch (option) {
				case 1:
					System.out.println("Enter id");
					String id = in.nextLine();
					student = new Student(id,"avc",98.0);
					break;
		
				case 2:
					student.display();
					break;
			}
		}
	}

}
