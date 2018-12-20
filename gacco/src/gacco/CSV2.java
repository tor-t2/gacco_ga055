package gacco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSV2 {

	public static void main(String[] args) {
		Student2 st = new Student2();
		Scanner s = null;

		try {
			s = new Scanner(new File("student.csv"));
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String[] data=line.split(",");
				st.setData(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]));
				st.printData();
			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			if(s != null) {
				s.close();
			}
		}
	}

}
