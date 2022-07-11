
public class StudentDetails extends Person {
private int rollNo;
private int marks;

public StudentDetails() {
	super(); // Use to invoke the parent class parameterless constructor but by default it called and we 
	   // need not write this explicitly. So without writing also we will have the same work but if we
	   // are using super(), it should be the first statement in the constructor
	rollNo=1;
	marks=80;
	//super(); // not possible
	System.out.println("I am the parameterless constructor StudentDetails");
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}

}
