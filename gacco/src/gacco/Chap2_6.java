package gacco;

import java.util.ArrayList;

public class Chap2_6 {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		int a = 10;
		alist.add(new Integer(a));
		for(int i=0; i<alist.size();i++) {
			System.out.println(alist.get(i));

		}
	}

}
