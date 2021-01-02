package springproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import springproject.model.Student;

@Component
public class StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createStudent(Student student)
	{
		this.hibernateTemplate.saveOrUpdate(student);
	}
	
	//get all 
	public List<Student> getStudents()
	{
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//delete 
	@Transactional
	public void deleteStudent(int student_id)
	{
		Student s = this.hibernateTemplate.load(Student.class, student_id);
		this.hibernateTemplate.delete(s);
	}
	
	//get the single 
	public Student getStudent(int student_id)
	{
		return this.hibernateTemplate.get(Student.class, student_id);
	}
}
