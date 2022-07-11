
public class BookMain {

	public static void main(String[] args) {
		Book book=new Book();
		book.setId(1);
		book.setTitle("Java");
		String title=book.getTitle();
		System.out.println(title);
		System.out.println(book.getTitle()); // String can be accessed
		

	}

}
