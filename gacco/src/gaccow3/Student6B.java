package gaccow3;

public class Student6B {
	protected int id; // 学生番号
	protected String name; // 名前

	Student6B(int id, String name){
		setData(id, name);
	}

	void setData(int id, String name) {
		this.id=id;
		this.name=name;
	}
	void print(){
		System.out.println("学生番号: " + id);
		System.out.println("名前: " + name);
    }
}
