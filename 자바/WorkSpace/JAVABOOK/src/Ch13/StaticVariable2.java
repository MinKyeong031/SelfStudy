package Ch13;

public class StaticVariable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.setStudentName("이선균");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		studentSon.serialNum++;
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}

}
