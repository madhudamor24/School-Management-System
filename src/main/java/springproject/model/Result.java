package springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	private int subject_code;
	private int marks;
	private String grade;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}


	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(int subject_code) {
		this.subject_code = subject_code;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(int student_id, int subject_code, int marks, String grade) {
		super();
		this.student_id = student_id;
		this.subject_code = subject_code;
		this.marks = marks;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Result [student_id=" + student_id + ", subject_code=" + subject_code + ", marks=" + marks + ", grade="
				+ grade + "]";
	}
	
	
	
	
}
