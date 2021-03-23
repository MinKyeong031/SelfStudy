package Ch22;

public class CompareMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> p1 = new Pair<>("이선균", 38);
		Pair<String, Integer> p2 = new Pair<>("이선균", 38);
		
		boolean result = Util.compare(p1, p2);
		System.out.println(result);

		Pair<String, String> p3 = new Pair<>("이선균", "이선균");
		Pair<String, String> p4 = new Pair<>("이선균", "균선이");
		
		result = Util.compare(p3, p4);
		System.out.println(result);
	}

}
