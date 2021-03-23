package Ch23;

public class MemberArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList mbal = new MemberArrayList();
		Member sul = new Member(1001, "설현");
		Member iu = new Member(1002, "아이유");
		Member kang = new Member(1003, "강동원");
		Member won = new Member(1004, "원빈");
		
		mbal.addMember(sul);
		mbal.addMember(iu);
		mbal.addMember(kang);
		mbal.addMember(won);
		
		mbal.showAllMember();
		
		mbal.removeMember(won.getMemberId());
		mbal.showAllMember();
	}

}
	