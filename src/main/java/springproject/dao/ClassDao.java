package springproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import springproject.model.Class;

@Component
public class ClassDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createClass(Class Class)
	{
		this.hibernateTemplate.saveOrUpdate(Class);
	}
	
	//get all 
	public List<Class> getClasses()
	{
		List<Class> Classes = this.hibernateTemplate.loadAll(Class.class);
		return Classes;
	}
	
	//delete 
	@Transactional
	public void deleteClass(int class_id)
	{
		Class c = this.hibernateTemplate.load(Class.class, class_id);
		this.hibernateTemplate.delete(c);
	}
	
	//get the single 
	public Class getClass(int class_id)
	{
		return this.hibernateTemplate.get(Class.class, class_id);
	}
}
