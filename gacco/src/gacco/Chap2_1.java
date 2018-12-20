package gacco;

import java.util.Scanner;

public class Chap2_1 {

	public static void main(String[] args) {
		int NUM=100;					// 学生数
		int[] id = new int[NUM];		// 学生番号
		int[] test1 = new int[NUM];	// 中間試験
		int[] test2 = new int[NUM];	// 期末試験
		int[] report = new int[NUM];	// レポート
		int[] abs = new int[NUM];		// 欠席回数
		int[] grades = new int[NUM];	// 成績判定 1～3の三段階評価で1が不合格、2が可、3が優

		Scanner s = new Scanner(System.in);
		int cnt=0;
		int sum=0; // 期末試験の合計値を格納
		while(s.hasNext()) {
			id[cnt]=s.nextInt();
			test1[cnt]=s.nextInt();
			test2[cnt]=s.nextInt();
			report[cnt]=s.nextInt();
			abs[cnt]=s.nextInt();
			sum+=test2[cnt];
			cnt++;
		}
		s.close();
		double ave=(double)sum/NUM;
		// 成績判定
		for(int i=0; i<NUM;i++) {
			// 欠席回数が4回以上は不合格
			if(abs[i]>=4) {
				grades[i]=1;
				continue;
			}
			if((test1[i]>=80) && (test2[i]>=80) && (report[i]>=80)) {
				grades[i]=3;
			}else if((test1[i]+test2[i] >= 120) && (report[i]>=60)) {
				grades[i]=2;
			}else {
				grades[i]=1;
			}

		}
		System.out.println("平均点以上の学生の出力");
		for(int i=0;i<NUM;i++) {
			if(test2[i]>=ave) {
				System.out.print(id[i]+" "+test1[i]+" "+test2[i]+" "+report[i]+" ");
				System.out.println(abs[i]);
			}
		}
		System.out.println("成績出力");
		for(int i=0;i<id.length;i++) {
			System.out.println("学生番号："+id[i]+" 成績："+grades[i]);
		}

	}

}
