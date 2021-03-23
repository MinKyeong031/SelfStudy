package Ch05;
import java.io.IOException;

public class IfExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = System.in.read()-48;
		
		if((num!=0)&&(num%3==0)&&(num%2==0)) {
			System.out.printf("%d는 3의 배수이면서, 2의 배수입니다.\n", num);
		} else if((num!=0)&&(num%3==0)) {
			System.out.printf("%d는 3의 배수입니다.\n", num);
		} else if((num!=0)&&(num%2==0)) {
			System.out.printf("%d는 2의 배수입니다.\n", num);
		} else {
			System.out.printf("%d는 3의 배수도 2의 배수도 아닙니다.\n", num);
		}
	}

}
