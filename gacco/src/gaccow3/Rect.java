package gaccow3;

import java.awt.Point;

public class Rect extends Figure{
	// 一般長方形
	Rect(int x, int y, int width, int height){
		super(x,y,width,height);
	}
	Rect(Point p1, Point p2){
		super(p1,p2);
	}
	// 正方形
	Rect(int x, int y, int wh){
		super(x,y,wh,wh);
	}
	@Override
	void printInfo() {
		System.out.println("長方形 位置("+this.x+","+this.y+") 幅"+this.width+",高さ"+this.height);
	}
	@Override
	double calcArea() {
		return this.width*this.height;
	}
}
