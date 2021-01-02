package springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	private String slip_number;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	

	public String getSlip_number() {
		return slip_number;
	}
	public void setSlip_number(String slip_number) {
		this.slip_number = slip_number;
	}
	
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int student_id, String slip_number) {
		super();
		this.student_id = student_id;
		this.slip_number = slip_number;
	}
	@Override
	public String toString() {
		return "Account [student_id=" + student_id 
				+", slip_number=" + slip_number + "]";
	}
	
}
