package Day2assignment;

class Circle {
	private double radius;
	private String color;
	
	public Circle(){
		this.radius=1.0;
		this.color="red";
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}

public class Q1 {

	public static void main(String[] args) {
		Circle c=new Circle(5.0);
		System.out.println("Radius of circle: "+c.getRadius());
		System.out.println("Area of circle: "+String.format("%.2f",c.getArea()));

	}

}
