 package Ch15;

 class P1{
	 int x = 1;
	 int y = 2;
	public int z;
 }
 
 class P2 extends P1{
	 int z = 3;
 }
  
public class ClassTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 test1 = new P2();
		System.out.println(test1.x + ", " + test1.y);
	//	System.out.println(test1.z);
		
	//	P2 test2 = new P1();
	//	System.out.println(test2.x + ", " + test2.y + ", " + test2.z);
		
		P1 test3 = new P2();
		P2 down = (P2)test3;
		System.out.println(down.x + ", " + down.y + ", " + down.z);
	}

}
