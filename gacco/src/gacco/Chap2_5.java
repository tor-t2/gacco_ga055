package gacco;

import java.awt.Point;

public class Chap2_5 {

	public static void main(String[] args) {
		Point p0= new Point();
		Point p1=new Point(20,30);
		Point p2=new Point(p1.x*2,p1.y/2);
		System.out.println(p0.distance(p2));
	}

}
