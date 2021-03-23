package Ch23;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrl;
	public MemberArrayList() {
		arrl = new ArrayList<Member>();
	}
	public void addMember(Member mb) {
		arrl.add(mb);
	}
	public boolean removeMember(int mbid) {
		for(int i = 0; i < arrl.size(); i++) {
			Member mb = arrl.get(i);
			int tempid = mb.getMemberId();
			if(tempid == mbid) {
				arrl.remove(i);
				return true;
			}
		}
		System.out.println(mbid + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member mb : arrl)
		{
			System.out.println(mb);
		}
		System.out.println();
	}
}
