package gaccow3;

import java.awt.Point;

abstract class Figure {
	protected int x; // 始点 x 座標
	protected int y; // 始点 y 座標
	protected int width; // 幅
	protected int height; // 高さ

	Figure(int x, int y, int w, int h){
		setData(x,y,w,h);
	}
	Figure(int x, int y, int wh){
		setData(x, y, wh, wh);
	}

	Figure(Point p1,Point p2){
		setData(p1,p2);
	}

	void setData(int x, int y, int w, int h) {
		this.x=x;
		this.y=y;
		this.width=w;
		this.height=h;
	}
	void setData(Point p, int w, int h) {
		setData(p.x, p.y, w, h);
	}
	void setData(Point p1, Point p2) {
		setData(Math.min(p1.x, p2.x),Math.min(p1.y, p2.y),Math.abs(p1.x-p2.x),Math.abs(p1.y-p2.y));
	}
	void translate(int dx, int dy) {
		this.x+=dx;
		this.y+=dy;
	}
	void translate(int d) {
		this.x+=d;
		this.y+=d;
	}
	abstract void printInfo();
	abstract double calcArea();

}
