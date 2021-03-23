package Ch22;

public class Util {
	public static<K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare, valueCompare;
		keyCompare = p1.getKey().equals(p2.getKey());
		valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
