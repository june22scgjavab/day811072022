
public class StudentMain {

	public static void main(String[] args) {
	Book book=new Book(1,"DOTNET","Samuel");
	Address address=new Address(111,"Indira Nagar","Mumbai");
	Student student=new Student(1,"Nidhi",address);
	System.out.println("Student Details");
	System.out.println(student.getRollNo());
	System.out.println(student.getName());
	Address addr=student.getAddress();
	System.out.println(addr.getHno());
	System.out.println(addr.getLocality());
	System.out.println(addr.getCity());
	student.issueBook(book);

	}

}
