package Ch14;

public class Customer {
	protected int ID;
	protected String Name;
	protected String Grade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		Grade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(int ID, String Name) {
		super();
		this.ID = ID;
		this.Name = Name;
		Grade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}

	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	public String showInfo() {
		return Name + "님의 등급은 " + Grade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
