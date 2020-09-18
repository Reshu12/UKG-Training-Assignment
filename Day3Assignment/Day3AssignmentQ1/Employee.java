package Day3AssignmentQ1;

import java.math.BigDecimal;

abstract class Employee {
	private String name;
	private int id;
	private BigDecimal rate;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate =rate;
	}

	abstract BigDecimal getSalary();
}

