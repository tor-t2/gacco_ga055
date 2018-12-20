package gacco;

import java.util.Scanner;

public class TestScore3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int scores[]=new int[10];
		for(int i=0; i<scores.length;i++) {
			System.out.printf("%d人目の点数を入力してください",i+1);
			scores[i]=scan.nextInt();
		}
		scan.close();
		// 成績順に入れ替える
		for(int j=scores.length-1;j>0;j--) {
			for(int i=0;i<j;i++) {
				if(scores[i]<scores[i+1]) {
					int tmp=scores[i+1];
					scores[i+1]=scores[i];
					scores[i]=tmp;
				}
			}
		}
		double av=CalcAve(scores);
		double stdev=CalcStdev(scores);
		for(int i=0;i<scores.length;i++) {
			System.out.printf("%d 番目の成績は点数 %d 点、偏差値 %.1f です。\n", i+1,scores[i],10*((scores[i]-av)/stdev)+50);
		}

	}
	private static double CalcAve(int[] a) {
		double ret=0;
		for(int i=0;i<a.length;i++) {
			ret += a[i];
		}
		ret /= a.length;
		return ret;
	}
	private static double CalcStdev(int[] a) {
		int pow2[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			pow2[i]=(int)Math.pow(a[i], 2);
		}
		return Math.sqrt(CalcAve(pow2)-Math.pow( CalcAve(a),2));
	}
}
