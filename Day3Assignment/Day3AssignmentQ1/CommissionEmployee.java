package Day3AssignmentQ1;

import java.math.BigDecimal;

class CommissionEmployee extends Employee{

	private BigDecimal sales;
	public CommissionEmployee(String name, int id, BigDecimal sales) {
		super(name, id);
		this.sales = sales;
	}

	@Override
	BigDecimal getSalary() {
		BigDecimal commission=getRate();
		BigDecimal salary=sales.multiply(commission);
	    salary=salary.divide(new BigDecimal(100.00));
		return salary;
	}

}
