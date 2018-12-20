package gaccow3;

public class Student {
	private int id; // 学生番号
	private String name; // 名前
	private int credits;// 取得済単位数

	String makeInfo() {
		String ret;
		ret="学生番号："+this.id+"\n名前："+this.name+"\n単位数："+this.credits;
		return ret;
	}
	Student(int id, String name){
		this.id=id;
		this.name=name;
		this.credits=0;
	}
	void printInfo() {
		System.out.println(this.makeInfo());
	}
	void addCredits(int credits) {
		this.credits+=credits;
	}
}
