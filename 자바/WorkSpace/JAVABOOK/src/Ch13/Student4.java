package Ch13;

public class Student4 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student4() {
		serialNum++;
		studentID = serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public static int getSerialNum() {
		int i = 10;
		int a = 5;
	//	studentName = "이선균";
		return serialNum;
	}
	public static void setSerialNum(int SerialNum) {
		Student3.serialNum = serialNum;
	}
}
