package Ch12;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {85, 90, 75, 100, 95};
		int tot = 0;
		double avg;
		int i;
		
		for(int score : a) {
			tot += score;
		}
		avg = (double)tot/a.length;
		System.out.println("총합 = " + tot);
		System.out.println("평균 = " + avg);
	}

}
