package springproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int grade_id;
	private String grade_obtain;
	private String marks_range;
	private String description;
	
	
	public int getGrade_id() {
		return grade_id;
	}
	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}
	public String getGrade_obtain() {
		return grade_obtain;
	}
	public void setGrade_obtain(String grade_obtain) {
		this.grade_obtain = grade_obtain;
	}
	public String getMarks_range() {
		return marks_range;
	}
	public void setMarks_range(String marks_range) {
		this.marks_range = marks_range;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Grade(int grade_id, String grade_obtain, String marks_range, String description) {
		super();
		this.grade_id = grade_id;
		this.grade_obtain = grade_obtain;
		this.marks_range = marks_range;
		this.description = description;
	}
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Grade [grade_id=" + grade_id + ", grade_obtain=" + grade_obtain + ", marks_range=" + marks_range
				+ ", description=" + description + "]";
	}

	
	
}
