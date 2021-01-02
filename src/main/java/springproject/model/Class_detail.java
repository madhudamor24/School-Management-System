package springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Class_detail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int class_id;
	private int subject_code;
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public int getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(int subject_code) {
		this.subject_code = subject_code;
	}
	public Class_detail(int class_id, int subject_code) {
		super();
		this.class_id = class_id;
		this.subject_code = subject_code;
	}
	public Class_detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Class_detail [class_id=" + class_id + ", subject_code=" + subject_code + "]";
	}
	
	

}
