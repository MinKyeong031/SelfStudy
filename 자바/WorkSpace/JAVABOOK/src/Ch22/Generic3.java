package Ch22;

class Entry<K, V>{
	K key;
	V value;
	
	
	public Entry() {
		super();
	}


	public Entry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}


	public K getKey() {
		return key;
	}


	public V getValue() {
		return value;
	}
	
}

public class Generic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry test1 = new Entry();
		test1.key = "이름";
		test1.value = "정우균";
		System.out.println(test1.getKey() + " : " + test1.getValue());
		test1.key = "나이";
		test1.value = 34;
		System.out.println(test1.getKey() + " : " + test1.getValue());
		test1.key = "주소";
		test1.value = "대구광역시";
		System.out.println(test1.getKey() + " : " + test1.getValue());
	}

}
