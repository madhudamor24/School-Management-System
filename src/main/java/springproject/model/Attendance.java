package springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	private int total_attendance;
	
	public int getTotal_attendance() {
		return total_attendance;
	}
	public void setTotal_attendance(int total_attendance) {
		this.total_attendance = total_attendance;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	
	public Attendance(int student_id, int total_attendance) {
		super();
		this.student_id = student_id;
		this.total_attendance = total_attendance;
	}
	
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Attendance [student_id=" + student_id 
				 +", total_attendance=" + total_attendance + "]";
	}
	
	
}
