package gaccow3pr;

import java.awt.Point;

public class Oval extends Figure {
	int width;
	int height;
	Oval(int x, int y, int w, int h){
		super(x, y);
		this.width=w;
		this.height=h;
	}
	Oval(int x, int y, int wh){
		super(x, y);
		this.width=wh;
		this.height=wh;
	}
	Oval(Point p1, Point p2){
		super(Math.min(p1.x, p2.x),Math.min(p1.y, p2.y));
		this.width=Math.abs(p1.x-p2.x);
		this.height=Math.abs(p1.y-p2.y);
	}

	@Override
	void printInfo() {
		System.out.println("楕円 位置("+this.base.x+","+this.base.y+") 幅"+this.width+",高さ"+this.height);
	}

	@Override
	double calcArea() {
		return Math.PI * (this.width/2) * (this.height/2);
	}

}
