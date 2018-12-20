package gaccow3;

public class Work7A {

	public static void main(String[] args) {
		Rect r1 = new Rect(10,20,100,50);
		r1.printInfo();
		System.out.println("長方形の面積"+r1.calcArea());
		//r1.translate(20, 10);
		//r1.printInfo();
		//System.out.println("面積"+r1.calcArea());
		Oval o1 = new Oval(30, 40,20,10);
		o1.printInfo();
		System.out.println("楕円の面積"+o1.calcArea());
	}

}
