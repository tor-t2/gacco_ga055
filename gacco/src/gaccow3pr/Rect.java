package gaccow3pr;

import java.awt.Point;

public class Rect extends Figure {
	int width;
	int height;
	Rect(int x, int y, int w, int h){
		super(x,y);
		this.width=w;
		this.height=h;
	}
	Rect(Point p1, Point p2){
		super(Math.min(p1.x, p2.x),Math.min(p1.y, p2.y));
		this.width=Math.abs(p1.x-p2.x);
		this.height=Math.abs(p1.y-p2.y);
	}

	@Override
	void printInfo() {
		System.out.println("長方形 位置("+this.base.x+","+this.base.y+") 幅"+this.width+",高さ"+this.height);

	}

	@Override
	double calcArea() {
		return this.width*this.height;
	}

}
