
public class Child2 extends Parent2{
	private int num2;
	public Child2(int num2) { 
		// super() Parameterized constructor of the Child class will try to invoke the parameterless or default constructor of the Parent class
		      //but currently parent class dont have the default constructor. It is having parameterized constructor
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
