package springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subjects{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subject_code;
	private String subject_name;
	
	
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
		
	public int getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(int subject_code) {
		this.subject_code = subject_code;
	}
	
	
	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subjects(int subject_code, String subject_name, int class_id) {
		super();
		this.subject_code = subject_code;
		this.subject_name = subject_name;
	}
	@Override
	public String toString() {
		return "Subjects [subject_code=" + subject_code + ", subject_name=" + subject_name
				+ "]";
	}
	
	
	
	
}
