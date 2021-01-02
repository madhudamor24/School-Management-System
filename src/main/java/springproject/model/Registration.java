package springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	private int class_id;
	
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int student_id, int class_id) {
		super();
		this.student_id = student_id;
		this.class_id = class_id;
	}
	@Override
	public String toString() {
		return "Registration [student_id=" + student_id + ", class_id=" + class_id + "]";
	}
	
	
	

}
