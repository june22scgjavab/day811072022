
public class Child3 extends Parent3{
	private int num2;
	public Child3(int num1,int num2) { 
		super(num1); // To call the parameterized constructor of the Parent class we have to use super(parameter value) 
		// otherwise it goes for default action as super() which will try to look for the default constructor in Parent
		// but in Parent if we write our own parameterized constructor, default constructor is not provided by the compiler
		// we have to design it explicitly.
		
		this.num2=num2;
		System.out.println("The Child2 class parameterized constructor");
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
