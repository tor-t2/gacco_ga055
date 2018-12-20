package gaccow3;

import java.awt.Point;

public class Oval extends Figure {

	Oval(int x, int y, int w, int h){
		super(x, y, w, h);
	}
	Oval(int x, int y, int wh){
		super(x, y, wh);
	}
	Oval(Point p1, Point p2){
		super(p1,p2);
	}
	@Override
	void printInfo() {
		System.out.println("楕円 位置("+this.x+","+this.y+") 幅"+this.width+",高さ"+this.height);
	}

	@Override
	double calcArea() {
		return Math.PI * (this.width/2) * (this.height/2);
	}

}
