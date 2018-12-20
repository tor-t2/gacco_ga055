package gacco;

import java.util.Scanner;

public class TestScore2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int scores[]=new int[10];
		for(int i=0; i<scores.length;i++) {
			System.out.printf("%d人目の点数を入力してください",i+1);
			scores[i]=scan.nextInt();
		}
		scan.close();
		double var, av;
		av=average(scores);
		var=variance(scores);
		System.out.println("成績は以下の通りとなります。");
		for(int i=0; i<scores.length;i++) {
			System.out.printf("%d 番目の成績 : 素点 %d 点 偏差値 %f \n", i+1,scores[i],(scores[i]-av)/Math.sqrt(var)*10+50);
		}

	}
	private static double average(int[] a) {
		double ret=0;
		for(int i=0;i<a.length;i++) {
			ret += a[i];
		}
		ret /= a.length;
		return ret;
	}
	private static double variance(int[] a) {
		double av;
		av=average(a);
		double ret=0;
		for(int i=0;i<a.length;i++) {
			ret+=Math.pow(a[i]-av,2);
		}
		ret /= a.length;
		return ret;
	}
}
