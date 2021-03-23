package Ch15;

class Animal{
	int x = 10;
}
class Human extends Animal{
	int y = 20;
}
class Tiger extends Animal{
	int z = 30;
}

public class instanceOfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal h = new Human();
		System.out.println(h.x);
		//System.out.println(h.y);
		
		if(h instanceof Human) {
			Human human = (Human)h;
			System.out.println(human.y);
		}
		Animal ani = new Tiger();
		//if(ani instanceof Human) {
			Human H = (Human)ani;
		//}
	}

}
