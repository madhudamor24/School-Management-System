package springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacher_id;
	private String teacher_name;
	private int subject_code;
	
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	
	
	public int getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(int subject_code) {
		this.subject_code = subject_code;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int teacher_id, String teacher_name, int subject_code) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.subject_code = subject_code;
	}
	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name
				+ ", subject_code=" + subject_code + "]";
	}
	
	
	
	
	
	
	
}
