package Ch12;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {};
	
	public Book(String bookname, String author) {
		this.bookName = bookname;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
}
