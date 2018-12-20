package gacco;




public class Chap2_2 {

	public static void main(String[] args) {
		Student sa=new Student();
		Student sb=new Student();
		// sa 25001,90,85,100,0
		sa.id=25001;
		sa.setScore(90, 85, 100);
		sa.abs=0;
		// sb 25002,70,60,65,1
		sb.id=25002;
		sb.setScore(70,60, 65);
		sb.abs=1;
		//sa.print();
		//sb.print();
		String line="25001,100,80,90,4";
		String[] result = line.split(",");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
