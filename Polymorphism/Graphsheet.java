package Polymorphism;

public class Graphsheet {

	public void drawPoint() {
		System.out.println("drawing poitn at 0,0");
	}

	public void drawPoint(double d, int i) {
		System.out.println("drawing point at " + i + " , " + d);
	}

	public static void drawPoint(int x, int y) {
		System.out.println("drawing point at " + x + " , " + y);
	}

	public static void main(String[] args) {
		Graphsheet g = new Graphsheet();
		g.drawPoint();
		g.drawPoint(10, 'X');
		Graphsheet.drawPoint(10, 20);
	}
}