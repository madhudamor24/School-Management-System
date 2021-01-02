package springproject.dao;

import java.util.List;

import springproject.model.Result;

public interface ResultDao {
	
	public int insert(Result result);
	
	public int change(Result result);
	
	public int delete(int student_id, int subject_code);
	
	public Result getResult(int student_id, int subject_code);
	
	public List<Result> getAllResults();

}





//package springproject.dao;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//import springproject.model.Result;
//
//@Component
//public class ResultDao {
//	
//	@Autowired
//	private HibernateTemplate hibernateTemplate;
//	
//	//create
//	@Transactional
//	public void createResult(Result result)
//	{
//
//		this.hibernateTemplate.saveOrUpdate(result);
//	}
//	
//	//get all
//	public List<Result> getResults()
//	{
//		List<Result> results = this.hibernateTemplate.loadAll(Result.class);
//		return results;
//	}
//	
//	//delete
//	@Transactional
//	public void deleteResult(int student_id, int subject_code)
//	{
//		Result res = this.hibernateTemplate.load(Result.class, student_id);
//		this.hibernateTemplate.delete(res);
//	}
//	
//	//get the single
//	public Result getResult(int student_id, int subject_code)
//	{
//		return this.hibernateTemplate.get(Result.class, student_id);
//	}
//}
