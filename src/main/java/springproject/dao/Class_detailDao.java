package springproject.dao;

import java.util.List;

import springproject.model.Class_detail;

public interface Class_detailDao{
	
	public int insert(Class_detail class_detail);
	
	public int change(Class_detail class_detail);
	
	public int delete(int class_id, int subject_code);
	
	public Class_detail getClass_detail(int class_id, int subject_code);
	
	public List<Class_detail> getAllClass_details();

}



//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import springproject.model.Class_detail;
//
//@Component
//public class Class_detailDao {
//	
//	@Autowired
//	private HibernateTemplate hibernateTemplate;
//	
//	//create
//	@Transactional
//	public void createClass_detail(Class_detail Class_detail)
//	{
//		this.hibernateTemplate.saveOrUpdate(Class_detail);
//	}
//	
//	//get all 
//	public List<Class_detail> getClass__details()
//	{
//		List<Class_detail> Class_details = this.hibernateTemplate.loadAll(Class_detail.class);
//		return Class_details;
//	}
//	
	//delete 
//	@Transactional
//	public void deleteClass_detail(int class_id, int subject_code)
//	{
//		Class_detail c = this.hibernateTemplate.load(Class_detail.class, class_id);
//		this.hibernateTemplate.delete(c);
//	}
//	
//	//get the single 
//	public Class_detail getClass_detail(int class_id, int subject_code)
//	{
//		return this.hibernateTemplate.get(Class_detail.class, class_id);
//	}
//}
