package Day3AssignmentQ1;

import java.math.BigDecimal;

class SalariedEmployee extends Employee {

	public SalariedEmployee(String name, int id) {
		super(name, id);
	}

	@Override
	BigDecimal getSalary() {
		return this.getRate();
	}
}
