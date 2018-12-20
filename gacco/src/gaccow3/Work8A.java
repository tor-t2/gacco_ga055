package gaccow3;

public class Work8A {

	public static void main(String[] args) {
		Figure[] farray = new Figure[5];
		farray[0]= new Rect(10,20,10,50);
		farray[1]= new Oval(30,20,50,10);
		farray[2]= new Oval(50,30,35,20);
		farray[3]= new Rect(40,25,10,40);
		farray[4]= new Oval(30,40,20,10);
		for(int i=0;i<farray.length;i++) {
			farray[i].printInfo();
		}
	}

}
