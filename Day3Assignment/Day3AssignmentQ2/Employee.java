package Day3AssignmentQ2;

import java.math.BigDecimal;

abstract class Employee implements Payable {
	private String name;
	private int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	abstract public BigDecimal getSalary();

	abstract public void setSalary(BigDecimal salary);
	abstract public BigDecimal getPayment();
}

class SalariedEmployee extends Employee{
	private BigDecimal rate;
	
	public SalariedEmployee(String name, int id, BigDecimal rate) {
		super(name, id);
		this.rate = rate;
	}

	@Override
	public BigDecimal getSalary() {
		return this.rate;
	}

	@Override
	public void setSalary(BigDecimal salary) {
		this.rate=salary;
		
	}

	@Override
	public BigDecimal getPayment() {
		return this.getSalary();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SalariedEmployee [name=");
		builder.append(getName());
		builder.append(", id=");
		builder.append(getId());
		builder.append("rate=");
		builder.append(rate);
		builder.append("]");
		return builder.toString();
	}
	
}
class HourlyEmployee extends Employee{
	
	private BigDecimal noOfHoursWorked;
	private BigDecimal hourlyRate;
	

	public HourlyEmployee(String name, int id, BigDecimal noOfHoursWorked, BigDecimal hourlyRate) {
		super(name, id);
		this.noOfHoursWorked = noOfHoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public BigDecimal getSalary() {
		
		return this.hourlyRate.multiply(noOfHoursWorked);
	}

	@Override
	public void setSalary(BigDecimal salary) {
		this.hourlyRate=salary;
		
	}

	@Override
	public BigDecimal getPayment() {
		
		return this.getSalary();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HourlyEmployee [name=");
		builder.append(getName());
		builder.append(", id=");
		builder.append(getId());
		builder.append("noOfHoursWorked=");
		builder.append(noOfHoursWorked);
		builder.append(", hourlyRate=");
		builder.append(hourlyRate);
		builder.append("]");
		return builder.toString();
	}
	
}
class CommissionEmployee extends Employee{

	private BigDecimal sales;
	private BigDecimal percent;
	

	public CommissionEmployee(String name, int id, BigDecimal sales, BigDecimal percent) {
		super(name, id);
		this.sales = sales;
		this.percent = percent;
	}

	@Override
	public BigDecimal getSalary() {
		return (this.percent.multiply(sales)).divide(new BigDecimal(100.0));
	}

	@Override
	public void setSalary(BigDecimal salary) {
		this.percent=salary;
		
	}

	@Override
	public BigDecimal getPayment() {
		return this.getSalary();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommissionEmployee [name=");
		builder.append(getName());
		builder.append(", id=");
		builder.append(getId());
		builder.append("sales=");
		builder.append(sales);
		builder.append(", percent=");
		builder.append(percent);
		builder.append("]");
		return builder.toString();
	}
	
}