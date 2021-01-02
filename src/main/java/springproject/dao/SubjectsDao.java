package springproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import springproject.model.Subjects;

@Component
public class SubjectsDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createSubjects(Subjects subjects)
	{

		this.hibernateTemplate.saveOrUpdate(subjects);
	}
	
	//get all 
	public List<Subjects> getSubjectss()
	{
		List<Subjects> subjectss = this.hibernateTemplate.loadAll(Subjects.class);
		return subjectss;
	}
	
	//delete 
	@Transactional
	public void deleteSubjects(int subject_code)
	{
		Subjects sub = this.hibernateTemplate.load(Subjects.class, subject_code);
		this.hibernateTemplate.delete(sub);
	}
	
	//get the single 
	public Subjects getSubjects(int subject_code)
	{
		return this.hibernateTemplate.get(Subjects.class, subject_code);
	}
}
