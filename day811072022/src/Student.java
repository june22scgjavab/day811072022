
public class Student {
private int rollNo;
private String name;
private Address address;


public Student(int rollNo, String name, Address address) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.address = address;
}


public void issueBook(Book book) // book is a parameter and local to issueBook
// and cannot be accessed by any other method
{
	
	System.out.println("The details of the book issued");
	System.out.println(book.getId());
	System.out.println(book.getTitle());
	System.out.println(book.getAuthor());
}


public int getRollNo() {
	//System.out.println(book); // book cannot be accessed here
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
