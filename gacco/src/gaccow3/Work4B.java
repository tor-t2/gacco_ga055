package gaccow3;

public class Work4B {

	public static void main(String[] args) {
		Student s1 = new Student(15001,"太郎");
		Student s2 = new Student(15002,"花子");
		s1.printInfo();
		s2.printInfo();
		System.out.println("---------------------------");
		System.out.println("前期,太郎が単位12を得た");
		s1.addCredits(12);
		System.out.println("前期,花子が単位16を得た");
		s2.addCredits(16);
		s1.printInfo();
		System.out.println("-------------");
		s2.printInfo();
		System.out.println("---------------------------");
		System.out.println("後期,太郎が単位24を得た");
		s1.addCredits(24);
		System.out.println("後期,花子が単位18を得た");
		s2.addCredits(18);
		s1.printInfo();
		System.out.println("-------------");
		s2.printInfo();
	}

}
