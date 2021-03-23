package Ch23;

import java.util.HashMap;

import java.util.Iterator;
public class MemberHashMap {
	private HashMap<Integer, Member> hm;
	public MemberHashMap() {
		hm = new HashMap<Integer, Member>();
	}
	public void addMember(Member mb) {
		hm.put(mb.getMemberId(), mb);
	}
	public boolean reMember(int mbid) {
		if(hm.containsKey(mbid)) {
			hm.remove(mbid);
			return true;
		}
		System.out.println(mbid + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> ir = hm.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member mb = hm.get(key);
			System.out.println(mb);
		}
		System.out.println();
	}
}
