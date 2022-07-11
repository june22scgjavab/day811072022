package day811072022;

public class StaticDemo2 {
static int i;  // I want to access  static i in the static method main
	public static void main(String[] args) {
		i=20; // This shows compilation error as non static cannot be accessed
		// within the static context.
		//StaticDemo2 demo=new StaticDemo2();
		//demo.i=20;
		//System.out.println(demo.i);
          System.out.println(i);
	}

}
