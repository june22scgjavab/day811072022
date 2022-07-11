package day811072022;

public class StudentMain {

	public static void main(String[] args) {
		Student stud1=new Student("Ravi",80);
		Student stud2=new Student("Sudesh",100);
       System.out.print(stud1.getRoll());  //1
       System.out.println(stud1.getName());
       System.out.println(stud1.getMarks());
       System.out.println(stud1.getRoll()); //2
       System.out.println(stud1.getName());
       System.out.println(stud2.getMarks());
	}

}
