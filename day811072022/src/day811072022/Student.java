package day811072022;

public class Student {
  private static int counter;
  private int roll;
  private String name;
  private int marks;
  
  static
  {
	  counter=0;
  }

public Student(String name, int marks) {
	super();
	this.name = name;
	this.marks = marks;
	counter++;
	this.roll=counter;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

public  int getRoll() {
	return roll;
}




}
