package Ch18;

class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}
	
	
}

public class ObjectToString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book(200, "개미");
		System.out.println(b);
		System.out.println(b.toString());
	}

}
