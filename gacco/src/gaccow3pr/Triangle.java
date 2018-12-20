package gaccow3pr;

import java.awt.Point;

public class Triangle extends Figure {
	Point p2 = new Point();
	Point p3 = new Point();

	Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
		super(x1, y1);
		this.p2.x=x2;
		this.p2.y=y2;
		this.p3.x=x3;
		this.p3.y=y3;
	}
	Triangle(Point p1, Point p2, Point p3){
		super(p1);
		this.p2=p2;
		this.p3=p3;
	}

	@Override
	void printInfo() {
		System.out.println("三角形 位置("+this.base.x+","+this.base.y+") - ("+this.p2.x+","+this.p2.y+") - ("+this.p3.x+","+this.p3.y+")");

	}

	@Override
	double calcArea() {
		double a=base.distance(p2);
		double b=base.distance(p3);
		double c=p2.distance(p3);
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	void translate(int dx, int dy) {
		this.base.x+=dx;
		this.base.y+=dy;
		this.p2.x+=dx;
		this.p2.y+=dy;
		this.p3.x+=dx;
		this.p3.y+=dy;
	}


}
