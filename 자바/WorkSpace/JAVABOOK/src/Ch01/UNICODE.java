package Ch01;

public class UNICODE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'가');
		System.out.println((int)'나');

		System.out.println();
		
		System.out.printf("%x\n", (int)'A');
		System.out.printf("%x\n", (int)'a');
		System.out.printf("%x\n", (int)'가');
		System.out.printf("%x\n", (int)'나');

		System.out.println();

		System.out.println('\u0041');
		System.out.println('\u0061');
		System.out.println('\uac00');
		System.out.println('\ub098');
	}

}
