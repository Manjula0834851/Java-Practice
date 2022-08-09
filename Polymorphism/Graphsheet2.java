package Polymorphism;

public class Graphsheet2 {
	public void drawPoint() {
		System.out.println("drawing poitn at 0,0");
	}

	public void drawPoint(double x, int y) {
		System.out.println("drawing point at " + x + " ," + y);
	}

	public void drawPoint(int x, char cord) {
		System.out.println("drawing point at " + cord + " , " + x);
	}

	public void drawPoint(int x, int y) {
		System.out.println("drawing point at " + x + " , " + y);
	}

	public static void main(String[] args) {
		Graphsheet g = new Graphsheet();
		g.drawPoint();
		g.drawPoint(10, 'X');
		g.drawPoint(10, 20);
		g.drawPoint(10.2, 23);
	}
}