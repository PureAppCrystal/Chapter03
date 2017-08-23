package com.bigdata2017.paint.main;

import com.bigdata2017.paint.interface_main.Drawable;
import com.bigdata2017.paint.interface_main.Resizable;
import com.bigdata2017.paint.point.ColorPoint;
import com.bigdata2017.paint.point.Point;
import com.bigdata2017.paint.shape.Circle;
import com.bigdata2017.paint.shape.Rectangle;
import com.bigdata2017.paint.shape.Shape;
import com.bigdata2017.paint.shape.Triangle;

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
		
		draw( new Point(100, 100) );
		draw( new ColorPoint(200, 200, "green") );
		
		System.out.println("--------------------------");
		
		//shape
		Shape triangle = new Triangle();
		triangle.draw();
		
		System.out.println("--------------------------");
		System.out.println("====== draw =======");
		draw( new Rectangle() );
		draw( new Triangle() );
		draw( new Circle(10,20,5) );
		
		//resize test
		//resize( new Triangle() );
		
		Shape s1 = new Triangle();
		Shape s2 = new Rectangle();
		Shape s3 = new Circle(10,20,5);
		
		
		//anonymous class - 한번만...객체를만들고 버리겠다?
		Point[] points = new Point[10];
		draw( new Drawable() {

			@Override
			public void draw() {
				System.out.println( points );
				System.out.println("한번만 만들고 버릴 도형을 그렸습니다.");
				
			}
			
		});
		
		
		System.out.println("--------------------------");
		System.out.println("====== resize =======");
		resize( new Triangle() );
		resize( new Rectangle() );
		resize( new Circle(10,20,10) );
		
		
		
		
		System.out.println("--------------------------");
		System.out.println("====== instanceof =======");
		
		Shape s11 = new Rectangle();
		System.out.println( s11 instanceof Object );
		System.out.println( s11 instanceof Shape );
		System.out.println( s11 instanceof Triangle );
		System.out.println( s11 instanceof Rectangle );
		
		System.out.println("--------------------------");
		//instanceof 는 클래스 경우에 상속 관계에 있을 때 연산이 가능
		
		Triangle s22 = new Triangle();
		System.out.println( s22 instanceof Object );
		System.out.println( s22 instanceof Shape );
		System.out.println( s22 instanceof Triangle );
		//계층 구조상 s22는 triangle클래스 이므로 rectangle과는 다른 계층이라 접근할 수 없다.
		//System.out.println( s22 instanceof Rectangle );
		
		System.out.println("--------------------------");
		Object s33 = new Rectangle();
		System.out.println( s33 instanceof Object );
		System.out.println( s33 instanceof String );
		System.out.println( s33 instanceof Shape );
		System.out.println( s33 instanceof Triangle );
		
	}
	
	
	/*
	private static void drawPoint( Point point ) {
		point.show();
	}

	private static void drawShape( Shape shape ) {
		shape.draw();
	}
	*/
	
	private static void draw( Drawable drawable) {
		drawable.draw();
	}
	
	private static void resize(Shape s) {
		
		System.out.println(s instanceof Resizable);
		System.out.println(s instanceof Drawable);
		
		if ( s instanceof Resizable == false ) {
			return;
		}

		Resizable resizable = ( Resizable)s;
		resizable.resize(9);
	}
}

