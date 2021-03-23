package Ch23;

public class MemberHashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet mhs = new MemberHashSet();
		Member Lee = new Member(1001, "아이유");
		Member Son = new Member(1002, "손나은");
		Member Park = new Member(1003, "박효신");
		
		mhs.addMember(Lee);
		mhs.addMember(Son);
		mhs.addMember(Park);
		mhs.showAllMember();
		
		Member Hong = new Member(1003, "홍길동");
		mhs.addMember(Hong);
		mhs.showAllMember();
	}

}
