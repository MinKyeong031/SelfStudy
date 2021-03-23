package Ch13;

public class Student3 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student3() {
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
		return serialNum;
	}
	public static void setSerialNum(int SerialNum) {
		Student3.serialNum = serialNum;
	}
}
