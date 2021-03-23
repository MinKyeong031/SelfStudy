package Ch23;

import java.util.ArrayList;
import java.util.Iterator;

public class Ch23Iterator {
	private ArrayList<Member> arrl;
	public Ch23Iterator() {
		arrl = new ArrayList<Member>();
	}
	public void addMember(Member mb) {
		arrl.add(mb);
	}
	public boolean removeMember(int mbid) {
		Iterator<Member> ir = arrl.iterator();
		while(ir.hasNext()) {
			Member mb = ir.next();
			int tempId = mb.getMemberId();
			if(tempId == mbid) {
				arrl.remove(mb);
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
