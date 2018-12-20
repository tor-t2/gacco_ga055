package gacco;

public class Student2 {
	int id;	// 学籍番号
	String name;	// 名前
	int test;		// 中間試験の得点
	void setData(int i, String n, int t) {
		this.id = i;
		this.name = n;
		this.test = t;
	}
	void printData() {
		System.out.println("===================");
		System.out.println("学生番号:" + id);
		System.out.println("名前    :" + name);
		System.out.println("中間試験:" + test);

	}
}
