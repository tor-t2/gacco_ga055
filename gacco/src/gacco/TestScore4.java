package gacco;

import java.util.Scanner;

public class TestScore4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int index[]= {0,1,2,3,4,5,6,7,8,9};
		int scores[]=new int[10];
		String names[] = new String[10];
		for(int i=0; i<scores.length;i++) {
			System.out.printf("%d人目の名前と点数を入力してください",i+1);
			names[i]=scan.next();
			scores[i]=scan.nextInt();
		}
		scan.close();
		// 成績順に入れ替える
		for(int j=scores.length-1;j>0;j--) {
			for(int i=0;i<j;i++) {
				if(scores[index[i]]<scores[index[i+1]]) {
					ExValues(index,i,i+1);
				}
			}
		}
		double av=CalcAve(scores);
		double stdev=CalcStdev(scores);
		for(int i=0;i<scores.length;i++) {
			System.out.printf("%d 番目の成績は %s 点数 %d 点、偏差値 %.1f です。\n", i+1,names[index[i]],scores[index[i]],10*((scores[index[i]]-av)/stdev)+50);
		}
	}
	private static void ExValues(int a[], int i, int j) {
		int tmp = a[i];
		a[i]=a[j];
		a[j]=tmp;
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
