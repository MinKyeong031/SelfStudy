package Ch05;

public class SwitchCaseExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranking = 6;
		char medalColor;
		switch(ranking) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		case 4: case 5: case 6: case 7:
			medalColor = 'H';
			break;
		default:
			medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색은 " + medalColor + "입니다.");
	}

}
