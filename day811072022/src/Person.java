
public class Person {
private int age;
private String name;

public Person() {
	age=20;
	name="Radhika";
	System.out.println("I am the parameterless constructor of Person");
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
