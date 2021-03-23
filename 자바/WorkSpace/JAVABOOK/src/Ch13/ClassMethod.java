package Ch13;

public class ClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이선균");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentLee.studentName + "의 학번 : " + studentLee.studentID);
		
		Student3 studentSon = new Student3();
		studentSon.setStudentName("손수경");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentSon.studentName + "의 학번 : " + studentSon.studentID);
	}

}
