package springproject.dao;

import java.util.List;

import springproject.model.Attendance;

public interface AttendanceDao {
	
	public int insert(Attendance attendance);
	
	public int change(Attendance attendance);
	
	public int delete(int student_id);
	
	public Attendance getAttendance(int student_id);
	
	public List<Attendance> getAllAttendance();

}



//package springproject.dao;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import springproject.model.Attendance;
//
//@Component
//public class AttendanceDao {
//	
//	@Autowired
//	private HibernateTemplate hibernateTemplate;
//	
//	//create
//	@Transactional
//	public void createAttendance(Attendance product)
//	{
//
//		this.hibernateTemplate.saveOrUpdate(product);
//	}
//	
//	//get all 
//	public List<Attendance> getAttendances()
//	{
//		List<Attendance> attendances = this.hibernateTemplate.loadAll(Attendance.class);
//		return attendances;
//	}
//	
//	//delete 
//	@Transactional
//	public void deleteAttendance(int student_id)
//	{
//		Attendance at = this.hibernateTemplate.load(Attendance.class, student_id);
//		this.hibernateTemplate.delete(at);
//	}
//	
//	//get the single 
//	public Attendance getAttendance(int student_id)
//	{
//		return this.hibernateTemplate.get(Attendance.class, student_id);
//	}
//}
