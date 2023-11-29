package Bai1;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	
public Rectangle() {
	
}


public Rectangle(double width, double length) {
	this.width = width;
	this.length = length;
}
	


public Rectangle(double width, double length,String color, boolean filled) {
	super(color,filled);
	this.width = width;
	this.length = length;
}



	public double getWidth() {
	return width;
}


public void setWidth(double width) {
	this.width = width;
}


public double getLength() {
	return length;
}


public void setLength(double length) {
	this.length = length;
}


	@Override
	public double getArea() {
		
		return (getLength()+getWidth())*2;
	}

	@Override
	public double getPerimeter() {
		
		return getLength()*getWidth();
	}


	@Override
	public String toString() {
		return super.toString()+ "Rectangle [width=" + width + ", length=" + length +", Area="+ getArea()+", Perimete="+getPerimeter()+ "]";
	}


}
