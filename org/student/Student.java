package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name from student class");
	}
	public void studentDept() {
		System.out.println("Student department from student class");
	}
	public void studentId() {
		System.out.println("Student id from student class");
	}

	public static void main(String[] args) {
		Student multilevel = new Student();
		multilevel.collegeCode();
		multilevel.collegeName();
		multilevel.collegeRank();
		multilevel.deptName();
		multilevel.studentDept();
		multilevel.studentId();
		multilevel.studentName();
	}
}
