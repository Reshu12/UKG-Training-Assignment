package Day3AssignmentQ2;

import java.math.BigDecimal;

public class Application {

	public static void main(String[] args) {
		Employee emp = new SalariedEmployee("abc" ,1, new BigDecimal(1000.0));
		Employee emp1 = new HourlyEmployee("abcd" ,2, new BigDecimal(10.0),new BigDecimal(3000.0));
		Employee emp2 = new CommissionEmployee("abcde" ,3,new BigDecimal(6000.0), new BigDecimal(30.0));
		Invoice invoice = new Invoice("Pipe", "Fitting", new BigDecimal(2.0), new BigDecimal(200.0));
		System.out.println(emp);
		System.out.println(emp.getPayment());
		System.out.println(emp1);
		System.out.println(emp1.getPayment());
		System.out.println(emp2);
		System.out.println(emp2.getPayment());
		System.out.println(invoice);
		invoice.getPayment();

	}

}
