package Day3AssignmentQ1;

import java.math.BigDecimal;

class HourlyEmployee extends Employee{

	private BigDecimal hours;
	public HourlyEmployee(String name, int id, BigDecimal hours) {
		super(name, id);
		this.hours = hours;
	}

	@Override
	BigDecimal getSalary() {
		BigDecimal hourlyRate = getRate();
		return hours.multiply(hourlyRate);
	}

}
