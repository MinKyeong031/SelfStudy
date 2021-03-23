package Ch23;

import java.util.ArrayList;

class myq{
	private ArrayList<String> aq = new ArrayList<String>();
	public void enq(String data) {
		aq.add(data);
	}
	public String deq() {
		int l = aq.size();
		if(l == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return (aq.remove(0));
	}
}

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myq q = new myq();
		q.enq("A");
		q.enq("B");
		q.enq("C");

		System.out.println(q.deq());
		System.out.println(q.deq());
		System.out.println(q.deq());
	}
}
