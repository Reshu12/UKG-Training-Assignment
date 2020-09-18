package Day3AssignmentQ1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		employees.add(new SalariedEmployee("ABC", 123));
		employees.add(new SalariedEmployee("XYZ", 124));
		employees.add(new HourlyEmployee("ABCD", 121, new BigDecimal(5)));
		employees.add(new HourlyEmployee("PQR", 122, new BigDecimal(3)));
		employees.add(new CommissionEmployee("ABCDQ", 125, new BigDecimal(3.45)));
		employees.add(new CommissionEmployee("ABCF", 126, new BigDecimal(4.56)));
		while (true) {
			System.out.println("1. Get weekly salary of any employee");
			System.out.println("2. Set rate of employee");
			System.out.println("3. Increase salary");
			System.out.println("0. Exit");
			System.out.println("Enter your choice");
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter emp id");
				int id = in.nextInt();
				for (Employee employee : employees) {
					if (employee.getId() == id) {
						System.out.println("Weekly salary = " + employee.getSalary());
						break;
					} else
						System.out.println("Invalid employee id");
				}
				break;
			case 2:
				System.out.println("Enter emp id for which you want to set rate");
				int id1 = in.nextInt();
				for (Employee employee : employees) {
					if (employee.getId() == id1) {
						System.out.println("Enter the rate");
						BigDecimal rate = in.nextBigDecimal();
						employee.setRate(rate);
						System.out.println("Rate is updated successfully");
						break;
					} else
						System.out.println("Invalid employee id");
				}
				break;
			case 3:
				System.out.println("Enter emp id for which you want to increase salary");
				int id2 = in.nextInt();
				for (Employee employee : employees) {
					if (employee.getId() == id2) {
						System.out.println("Enter the new salary");
						BigDecimal salary = in.nextBigDecimal();
						employee.setRate(salary);
						System.out.println("Salary is updated successfully");
						break;
					} else
						System.out.println("Invalid employee id");
				}
				break;
			}
			if (choice == 0)
				break;
		}
		in.close();
	}
}
