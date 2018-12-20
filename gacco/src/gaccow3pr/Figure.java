package gaccow3pr;

import java.awt.Point;

public abstract class Figure {
	// 基準点
	Point base=new Point();
	Figure(int x,int y){
		setData(x,y);
	}
	Figure(Point p){
		setData(p);
	}
	void setData(int x, int y) {
		this.base.x=x;
		this.base.y=y;
	}
	void setData(Point p) {
		this.base=p;
	}
	void translate(int dx, int dy) {
		this.base.x+=dx;
		this.base.y+=dy;
	}
	void translate(int d) {
		this.translate(d, d);
	}
	abstract void printInfo();
	abstract double calcArea();
}
