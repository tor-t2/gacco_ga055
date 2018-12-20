package gacco;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSV1 {

	public static void main(String[] args) {
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		s1.setData(1001, "太郎", 80);
		s2.setData(1002, "次郎", 60);

		PrintWriter p = null;

		try {
			p = new PrintWriter("student.csv");
			p.println(s1.id+","+s1.name+","+s1.test);
			p.println(s2.id+","+s2.name+","+s2.test);
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			if(p != null) {
				p.close();
			}
		}
		System.out.println("書き出し処理終了");
	}

}
