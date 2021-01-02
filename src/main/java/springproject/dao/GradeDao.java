package springproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import springproject.model.Grade;

@Component
public class GradeDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createGrade(Grade grade)
	{
		this.hibernateTemplate.saveOrUpdate(grade);
	}
	
	//get all 
	public List<Grade> getGrades()
	{
		List<Grade> grades = this.hibernateTemplate.loadAll(Grade.class);
		return grades;
	}
	
	//delete 
	@Transactional
	public void deleteGrade(int grade_id)
	{
		Grade g = this.hibernateTemplate.load(Grade.class, grade_id);
		this.hibernateTemplate.delete(g);
	}
	
	//get the single 
	public Grade getGrade(int grade_id)
	{
		return this.hibernateTemplate.get(Grade.class, grade_id);
	}
}
