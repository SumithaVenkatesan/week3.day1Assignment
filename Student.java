package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Sumitha");
	}
	
	public void studentDept() {
		System.out.println("CS dept");
	}
	public void studentId() {
		System.out.println("09MIT65");
	}
	
	public static void main(String[] args) {
		Student student=new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}

}
