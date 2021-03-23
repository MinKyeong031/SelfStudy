package Ch23;

import java.util.HashSet;

public class Ch23HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add(new String("아이유"));
		hs.add(new String("설현"));
		hs.add(new String("강동원"));
		hs.add(new String("원빈"));
		hs.add(new String("강동원"));
		
		System.out.println(hs);
	}

}
