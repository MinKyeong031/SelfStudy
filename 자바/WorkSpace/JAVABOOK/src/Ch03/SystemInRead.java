package Ch03;

public class SystemInRead {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.printf("정수 1개 입력 : ");
		int num = System.in.read()-48;
		System.out.println("num : " + num);
	}

}
