package springproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import springproject.model.Teacher;

@Component
public class TeacherDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createTeacher(Teacher teacher)
	{

		this.hibernateTemplate.saveOrUpdate(teacher);
	}
	
	//get all 
	public List<Teacher> getTeachers()
	{
		List<Teacher> teachers = this.hibernateTemplate.loadAll(Teacher.class);
		return teachers;
	}
	
	//delete 
	@Transactional
	public void deleteTeacher(int teacher_id)
	{
		Teacher teacher = this.hibernateTemplate.load(Teacher.class, teacher_id);
		this.hibernateTemplate.delete(teacher);
	}
	
	//get the single 
	public Teacher getTeacher(int teacher_id)
	{
		return this.hibernateTemplate.get(Teacher.class, teacher_id);
	}
}
