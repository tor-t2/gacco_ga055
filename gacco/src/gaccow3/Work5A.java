package gaccow3;

import java.awt.Point;

public class Work5A {

	public static void main(String[] args) {
		Point p1 = new Point(10,50);
		Point p2 = new Point(40,100);
		Rect r1 = new Rect(p1, p2);
		r1.printInfo();
		System.out.println("-------------------");
		p1.setLocation(40, 100);
		p2.setLocation(10, 50);
		Rect r2 = new Rect(p1, p2);
		r2.printInfo();
		System.out.println("-------------------");
		p1.setLocation(40, 50);
		p2.setLocation(10, 100);
		Rect r3 = new Rect(p1, p2);
		r3.printInfo();
		System.out.println("-------------------");
		p1.setLocation(10, 100);
		p2.setLocation(40, 50);
		Rect r4 = new Rect(p1, p2);
		r4.printInfo();
		System.out.println("-------------------");
	}

}
