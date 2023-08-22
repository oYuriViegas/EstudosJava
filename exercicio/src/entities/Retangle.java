package entities;

public class Retangle {
	public double height;
	public double width;
	
	public double area(){
		return height * width;
	}
	
	public double perimeter() {
		return (height + width) * 2;
	}
	
	public double diagonal() {
		
		return Math.sqrt((height * height) + (width * width));
	}
	
}
