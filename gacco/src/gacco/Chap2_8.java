package gacco;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Chap2_8 {

	public static void main(String[] args) {
		PrintWriter p = null;
		try {
			p = new PrintWriter("output.txt");
			p.println("Hello");
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			if(p != null) {
				p.close();
			}
		}
	}

}
