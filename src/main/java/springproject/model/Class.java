package springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Class {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int class_id;
	private String class_name;
	
	
	
	
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	
	
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Class(int class_id, String class_name) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
	}
	@Override
	public String toString() {
		return "Class [class_id=" + class_id + ", class_name=" + class_name
				+ "]";
	}
	
	
	
	
	

}
