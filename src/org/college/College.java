package org.college;

public class College {
	public void collegeName() {
		System.out.println("college name is JJCET");
	}
	public void collegeCode() {
		System.out.println("college code is 5026");
	}
	public void collegeRank() {
		System.out.println("college rank is 10");
	}
	public static void main(String[]args) {
		College l = new College();
		l.collegeName();
		l.collegeCode();
		l.collegeRank();
		Student e = new Student();
		e.studentName();
		e.studentDept();
		e.studentId();
		HostelName t = new HostelName();
		t.hostelName();
		Dept r = new Dept();
		r.deptName();
	}
}
