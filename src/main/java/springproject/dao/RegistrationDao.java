package springproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import springproject.model.Registration;

@Component
public class RegistrationDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createRegistration(Registration registration)
	{

		this.hibernateTemplate.saveOrUpdate(registration);
	}
	
	//get all 
	public List<Registration> getRegistrations()
	{
		List<Registration> registrations = this.hibernateTemplate.loadAll(Registration.class);
		return registrations;
	}
	
	//delete 
	@Transactional
	public void deleteRegistration(int student_id)
	{
		Registration r = this.hibernateTemplate.load(Registration.class,student_id);
		this.hibernateTemplate.delete(r);
	}
	
	//get the single 
	public Registration getRegistration(int student_id)
	{
		return this.hibernateTemplate.get(Registration.class, student_id);
	}
}
