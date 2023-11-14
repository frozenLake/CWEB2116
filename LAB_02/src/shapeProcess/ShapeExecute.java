package shapeProcess;
import shapePack.*;


public class ShapeExecute {

	public static void main(String[] args) {
		Square squ = new Square();
		Rectangle rec = new Rectangle();
		SemiCircle scc = new SemiCircle();
		
		squ.printShape();
		squ.printRectangle();
		squ.printSquare();
		System.out.println();
		squ.calculateArea();
		System.out.println();
		rec.calculateArea();
		System.out.println("----");
		scc.printShape();
		scc.printSemiCircle();
		scc.printCircle();
	}

}
