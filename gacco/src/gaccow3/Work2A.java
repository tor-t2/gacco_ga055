package gaccow3;

public class Work2A {

	public static void main(String[] args) {
		Rect r1 = new Rect(100, 40, 60, 80);
		r1.printInfo();
		System.out.println("面積は"+r1.calcArea());
		System.out.println("--------------------");
		System.out.println("x方向に 30 y方向に 50 だけ移動する。");
		r1.translate(30, 50);
		r1.printInfo();
	}

}
