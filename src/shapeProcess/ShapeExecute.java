package shapeProcess;
import shapePack.*;


public class ShapeExecute {

	public static void main(String[] args) {
		Square squ = new Square();
		SemiCircle scc = new SemiCircle();
		
		squ.printShape();
		squ.printRectangle();
		squ.printSquare();
		System.out.println("----");
		scc.printShape();
		scc.printSemiCircle();
		scc.printCircle();
	}

}
