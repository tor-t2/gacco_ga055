package gaccow3pr;

public class UseFig {

	public static void main(String[] args) {
	    Figure[] farray = new Figure[5];
	    farray[0] = new Rect(10,20,100,50);
	    farray[1] = new Oval(30,20,50,10);
	    farray[2] = new Triangle(35,40, 50,20, 10, 15);
	    farray[3] = new Rect(40,25,10,40);
	    farray[4] = new Oval(30,40,20,10);

	    System.out.println("全図形情報出力");
	    for(int i=0; i<farray.length; i++) {
	              System.out.print("第" + i +"図形　");
	              farray[i].printInfo();
	    }
	    System.out.println("--------------------");
	    System.out.println("全図形の面積出力");
	    for(int i=0; i<farray.length; i++) {
	              System.out.println("第" + i +"図形　" + farray[i].calcArea());
	    }
	    System.out.println("--------------------");
	    System.out.println("第3図形を(10,20)だけ移動");
	    farray[3].translate(10,20);
	    farray[3].printInfo();
	    System.out.println("--------------------");
	    System.out.println("第1図形を(-20,10)だけ移動");
	    farray[1].translate(-20,10);
	    farray[1].printInfo();
	    System.out.println("--------------------");
	    System.out.println("第2図形を(5,30)だけ移動");
	    farray[2].translate(5,30);
	    farray[2].printInfo();
	    System.out.println("--------------------");
	    System.out.println("第2図形を 13 だけ移動");
	    farray[2].translate(13);
	    farray[2].printInfo();
	}

}
