package gacco;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = new int[10];
		a[0]=5;
		a[1]=2;
		a[2]=10;
		a[3]=8;
		a[4]=1;
		a[5]=7;
		a[6]=3;
		a[7]=9;
		a[8]=12;
		a[9]=4;

		for(int j=a.length-1;j>0;j--) {
			for(int i= 0 ;i<j;i++) {
				if(a[i]<a[i+1]) {
					int b=a[i+1];
					a[i+1]=a[i];
					a[i]=b;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.printf("%d番目：%d\n",i+1,a[i]);
		}

	}

}
