package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point(100,50);
		point1.show();
		point1.show(false);
		
		
		Point point2 = new Point(200,200);
		point2.show();
		point2.show(false);
		
		
		Point point3 = new ColorPoint(300, 300, "Red");
		point3.show();
		//point3.show(false);
		
		
		Point point4 = new ColorPoint(300, 300, "yellow");
		point4.show(true);
		
		
		System.out.println("--------------------------");
		
		drawPoint( new Point(100, 100) );
		drawPoint( new ColorPoint(200, 200, "green") );
		
		System.out.println("--------------------------");
		
		//shape
		Shape triangle = new Triangle();
		triangle.draw();
		
		System.out.println("--------------------------");
		
		drawShape( new Rectangle() );
		
	}
	
	
	private static void drawPoint( Point point ) {
		point.show();
	}

	private static void drawShape( Shape s ) {
		s.draw();
	}
	
}
