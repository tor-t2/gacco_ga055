package gacco;

public class ExampleMethod {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int score[]= {1,2,3,4,5};
		System.out.printf("平均値：%f\n",CalcAve(score));

	}
	private static double CalcAve(int[] a) {
		int i, s=0;
		for(i=0;i<a.length;i++) {
			s+=a[i];
		}
		return (double)s/a.length;
	}

}
