package Ch23;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hs;
	public MemberHashSet() {
		hs = new HashSet<Member>();
	}
	public void addMember(Member mb) {
		hs.add(mb);
	}
	public boolean reMember(int mbid) {
		Iterator<Member> ir = hs.iterator();
		while(ir.hasNext()) {
			Member mb = ir.next();
			int tid = mb.getMemberId();
			if(tid == mbid) {
				hs.remove(mb);
				return true;
			}
		}
		System.out.println(mbid + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member mb : hs) {
			System.out.println(mb);
		}
		System.out.println();
	}
}
