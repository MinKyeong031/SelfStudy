package Ch18;

class ObjtestA{
	int x;
	ObjtestA(){};
	public ObjtestA(int a) {
		this.x = a;
	}
}
class ObjtestB{
	int x = 0;
	private static int n = 100;

	ObjtestB(){};
	public ObjtestB(int a) {
		this.x = a;
	}
	public int getX() {
		return x;
	}
	@Override
	public int hashCode() {
		return n++;
	}
	@Override
	public boolean equals(Object obj) {//equals 재정의
		if(obj instanceof ObjtestB) {//형변환 가능 여부 확인
			ObjtestB mi = (ObjtestB)obj;//다운캐스팅
			return this.x == mi.x;//객체 값 비교
		}
		return false;
	}
	
}

public class ObjectHashCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjtestA o1 = new ObjtestA(12);
		ObjtestA o2 = new ObjtestA(12);
		ObjtestA o3 = new ObjtestA(56);
		
		System.out.println(o1);		//자바 가상머신이 부여한 객체의 주소 저장
		System.out.println(o2);		
		System.out.println(o3);		
		System.out.println();

		System.out.println(System.identityHashCode(o1));	//실제 부여되는 고유 식별 해시코드
		System.out.println(System.identityHashCode(o2));
		System.out.println(System.identityHashCode(o3));
		System.out.println();

		System.out.println(o1.hashCode());	//재정의가 가능한 해시코드(재정의 하지 않을 시 고유 식별  해시코드 적용)
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		System.out.println();
		
		System.out.println(o1.equals(o2));	//false(서로 다른 해시코드 적용)
		System.out.println(o1.equals(o3));
		System.out.println(o2.equals(o3));
		System.out.println();
		
		System.out.println("=======================");
		ObjtestB o4 = new ObjtestB(12);
		ObjtestB o5 = new ObjtestB(12);
		ObjtestB o6 = new ObjtestB(56);

		System.out.println(o4);		//자바 가상머신이 부여한 객체의 주소 저장
		System.out.println(o5);		
		System.out.println(o6);		
		System.out.println();

		System.out.println(System.identityHashCode(o4));	//실제 부여되는 고유 식별 해시코드
		System.out.println(System.identityHashCode(o5));
		System.out.println(System.identityHashCode(o6));
		System.out.println();

		System.out.println(o4.hashCode());	//재정의가 가능한 해시코드(재정의 하지 않을 시 고유 식별  해시코드 적용)
		System.out.println(o5.hashCode());
		System.out.println(o6.hashCode());
		System.out.println();
		
		System.out.println(o4.equals(o5));	//false(서로 다른 해시코드 적용)
		System.out.println(o4.equals(o6));
		System.out.println(o5.equals(o6));
		System.out.println();
	}
}