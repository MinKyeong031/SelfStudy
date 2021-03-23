package Ch12;

import java.util.ArrayList;

public class BookArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생택쥐페리"));
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
	}

}
