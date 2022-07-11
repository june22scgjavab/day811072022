package day811072022;

public class StaticDemo1 {
int i;  // I want to access non static i in the static method main
	public static void main(String[] args) {
		i=20; // This shows compilation error as non static cannot be accessed
		// within the static context.
		StaticDemo1 demo=new StaticDemo1();
		demo.i=20;
		System.out.println(demo.i);

	}

}
