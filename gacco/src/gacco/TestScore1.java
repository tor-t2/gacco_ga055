package gacco;
import java.util.Scanner;
public class TestScore1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("点数を入力してください");
		int in_score, num=1, total=0, pass_num=0;
		while(true) {
			in_score=scan.nextInt();
			total+=in_score;
			if(in_score >= 60) {
				pass_num++;
			}
			if(num >= 10) {
				break;
			}
			num++;
		}
		scan.close();
		double average, pass_rate;
		average=(double)total/num;
		pass_rate=(double)pass_num/num*100;
		System.out.println("平均点は "+average+" 点です。");
		System.out.println("合格者は "+pass_num+" 人で、合格率は "+pass_rate+" %です");

	}

}
