package assignment.week3.java1;

public class MultiLevelStudent extends MultiLevelDepartment {
	public static void main(String[] args) {
		MultiLevelStudent student = new MultiLevelStudent();
		MultilevelCollage dept  = new MultilevelCollage();
		dept.collegeCode();
		dept.collegeName();
		dept.collegeRank();
		student.deptName();
		student.studentName();
		student.studentId();
		student.studentDept();
		
	}
	

	public void studentName() {
		System.out.println("Subash");
	}
	
	public void studentDept() {
		System.out.println("EEE");
	}
	
	public void studentId() {
		System.out.println("EE1004454");
		
	}
	

}
