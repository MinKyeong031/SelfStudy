package Ch06;

public class GooGooDanRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int times;
		
		for(dan = 9; dan > 1; dan--) {
			for(times = 9; times > 0; times--) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println("=======");
		}
	}

}
