package Ch13;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company my1 = Company.getInstance();
		Company my2 = Company.getInstance();
		System.out.println(my1 == my2);
	}

}
