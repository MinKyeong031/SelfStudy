package Ch14;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer Lee = new Customer(10010, "이순신");
		Lee.bonusPoint = 1000;
		
		VIPCustomer Kim = new VIPCustomer(10020, "김유신", 12345);
		Kim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(Lee.getName() + "님이 지불해야하는 금액은 " + Lee.calcPrice(price) + "원입니다.");
		System.out.println(Kim.getName() + "님이 지불해야하는 금액은 " + Kim.calcPrice(price) + "원입니다.");
	}

}
