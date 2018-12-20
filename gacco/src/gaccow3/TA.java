package gaccow3;

public class TA extends Student6B {
	protected String kamoku;
	protected int time;
	TA(int id, String name, String kamoku){
		super(id, name);
		this.kamoku = kamoku;
		this.time=0;
	}
	void work(int t) {
		time +=t;
	}
	void print() {
		super.print();
		System.out.println("TA科目："+kamoku);
		System.out.println("勤務時間："+time);
	}
}
