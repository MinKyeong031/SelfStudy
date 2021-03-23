package Ch16;

public class TemplateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car AI = new AICar();
		AI.run();
		
		System.out.println();
		Car Man = new ManualCar();
		Man.run();
	}

}
