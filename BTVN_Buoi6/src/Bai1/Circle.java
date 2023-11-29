package Bai1;

public class Circle extends Shape{
	private double radius;
	
public Circle() {
	
}


	public Circle(double radius) {
	this.radius = radius;
}
	


	public Circle(String color, boolean filled,double radius) {
		super(color,filled);
		this.radius = radius;
	}
	


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		
		return 2*Math.PI*getRadius();
	}

	@Override
	public double getPerimeter() {
		
		return Math.PI*getRadius()*getRadius();
	}


	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + ", area="+getArea()+",perimeter="+getPerimeter()+ "]";
	}
	

}
