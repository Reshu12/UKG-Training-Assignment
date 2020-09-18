package Day4Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable {
	private int id;
	private String name;
	private String address;
	private transient double salary;

	public Emp(int id, String name, String address, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	public void display() {
		System.out.println(this);
	}
}

public class Q3 {

	public static void main(String[] args) {
		Emp emp = new Emp(101, "reshu", "abc colony, delhi", 5000.0);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("demo121.ser")))) {
			System.out.println("before serialization");
			emp.display();
			oos.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("demo121.ser")));
			Emp emp1 = (Emp) objectInputStream.readObject();
			System.out.println("After deserialization");
			emp1.display();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
