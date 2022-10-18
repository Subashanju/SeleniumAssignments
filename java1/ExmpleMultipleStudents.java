package assignment.week3.java1;

public class ExmpleMultipleStudents {
	
	public static void main(String[] args) {
		ExmpleMultipleStudents obj = new ExmpleMultipleStudents();
		obj.getStudentInfo(26);
		obj.getStudentInfo(026, "Subash");
		obj.getStudentInfo("subashraju.sr@gmail.com", 9944748123l);
		
		
	}
	public void getStudentInfo(int id) {
		System.out.println("ID :"+id+"\n" );
		
	}
	public void getStudentInfo(int empid , String name) {
		System.out.println("Name :"+name+"\n"+"emp id :"+empid+"\n" );
		
	}
	public void getStudentInfo(String Email , long number) {
		System.out.println("Email : " +Email+"\n"+"Number :"+ number+"\n");
	
}
}
