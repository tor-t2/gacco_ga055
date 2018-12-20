package gacco;

import java.util.Scanner;

public class CalcShare {

	public static void main(String[] args) {
		int sum[] = {0,0,0,0};
		int i,j,total=0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("店舗番号と売り上げ金額は？");
			i=scan.nextInt();
			if(i==0) {
				break;
			}
			j=scan.nextInt();
			sum[i]=sum[i]+j;
			total=total+j;
		}
		scan.close();
		for(i=1;i<sum.length;i++) {
			double s=sum[i]/total*100.0;
			System.out.printf("店舗番号 %d： シェア %.2f%%\n",i,s);
		}
	}

}
