package gacco;

public class Student {
	int id;
	int test1;
	int test2;
	int report;
	int abs;
	int calc() {
		int result=1;
		if(abs < 4) {
			if((test1 >= 80) && (test2 >= 80) && (report >= 80)) {
				result=3;
			}else if((test1+test2>=120) && (report >= 60)) {
				result=2;
			}
		}
		return result;
	}
	void print() {
		System.out.print("学籍番号："+id);
		System.out.print(" 中間テスト点数："+test1);
		System.out.print(" 期末テスト点数："+test2);
		System.out.print(" レポート点数："+report);
		System.out.println(" 欠席回数："+abs);
	}
	void setScore(int test1, int test2, int report) {
		this.test1=test1;
		this.test2=test2;
		this.report=report;
	}
	boolean judge() {
		/*
		if(this.calc() >= 2) {
			return true;
		}
		return false;
		*/
		return this.calc() >= 2;
	}
}
