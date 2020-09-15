package Day2assignmentQ4;

class Student {
	private String name;
	private String id;
	private double grade;
	public Student(String id, String name, double grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public Student(String id, String name) {
		this(id,name, -1.0);
	}
	public Student(String id) {
		this(id,"",-1.0);
	}
	public void display() {
		if(!name.equals(""))
			System.out.println("Name = " + name);
		System.out.println("Id = " + id);
		if(grade != -1.0)
			System.out.println("Grade = " + grade);

	}
	public void display(int year) {
		display();
		System.out.println("Current year = " + year);
	}

}
