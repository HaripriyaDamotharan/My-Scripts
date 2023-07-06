package week2.day3;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student ID : " +id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID : " +id + "Student name : " +name);
	}
	
	public void getStudentInfo(String mail, long number) {
		System.out.println("Mail ID " +mail +"Phone : " +number);
	}
	
	public static void main(String[] args) {
		Students details = new Students();
		details.getStudentInfo(1327);
		details.getStudentInfo(1327, "Haripriya");
		details.getStudentInfo("haripriya@gmail.com", 987654321);
	}
}
