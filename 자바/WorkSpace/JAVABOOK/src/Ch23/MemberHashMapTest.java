package Ch23;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap mhm = new MemberHashMap();
		Member Lee = new Member(1001, "아이유");
		Member Son = new Member(1002, "손나은");
		Member Park = new Member(1003, "박효신");
		Member Hong = new Member(1004, "홍길동");
		
		mhm.addMember(Lee);
		mhm.addMember(Son);
		mhm.addMember(Park);
		mhm.addMember(Hong);
		
		mhm.showAllMember();
		mhm.reMember(1004);
		mhm.showAllMember();
	}

}
