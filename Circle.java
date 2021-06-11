package circle;

public class Circle {
	private double radius=1.0;
	private String color="red";
	public Circle(double r) {
		radius=r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return getRadius()*getRadius()*3.14;
	}
}
