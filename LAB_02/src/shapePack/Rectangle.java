package shapePack;
import java.util.Scanner;

public class Rectangle extends Shape {
	public void printRectangle(){
		System.out.println("This is Rectangle. Subclass of Shape");
	}
	public void calculateArea() {
		Scanner scannerR = new Scanner(System.in);
		double length, breadth, area;
		System.out.println("Area of Rectangle: ");
		System.out.println("Enter the measure of length: ");
		length = scannerR.nextDouble();
		System.out.println("Enter the measure of breadth: ");
		breadth = scannerR.nextDouble();
		area = length*breadth;
		scannerR.close();
		System.out.println("RESULT: Area of Rectangle = " + area);
	}

}
