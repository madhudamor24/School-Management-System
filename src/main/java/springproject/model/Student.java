package springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	private String student_name;
	private int class_id;
	private String address;
	private String contact_number;
	

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	
	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int student_id, String student_name, int class_id, String address,
			String contact_number) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.class_id = class_id;
		this.address = address;
		this.contact_number = contact_number;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name
				+ ", class_id=" + class_id + ", address=" + address + ", contact_number=" + contact_number + "]";
	}


		
}
