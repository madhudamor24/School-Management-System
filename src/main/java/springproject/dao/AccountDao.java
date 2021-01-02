package springproject.dao;

import java.util.List;

import springproject.model.Account;

public interface AccountDao {
	
	public int insert(Account account);
	
	public int change(Account account);
	
	public int delete(int student_id);
	
	public Account getAccount(int student_id);
	
	public List<Account> getAllAccounts();

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
//import springproject.model.Account;
//
//@Component
//public class AccountDao {
//	
//	@Autowired
//	private HibernateTemplate hibernateTemplate;
//	
//	//create
//	@Transactional
//	public void createAccount(Account account)
//	{
//		
//		this.hibernateTemplate.saveOrUpdate(account);
//	}
//	
//	//get 
//	public List<Account> getAccounts()
//	{
//		List<Account> accounts = this.hibernateTemplate.loadAll(Account.class);
//		return accounts;
//	}
//	
//	//delete the single product
//	@Transactional
//	public void deleteAccount(int student_id)
//	{
//		Account a = this.hibernateTemplate.load(Account.class, student_id);
//		this.hibernateTemplate.delete(a);
//	}
//	
//	//get the single product
//	public Account getAccount(int student_id)
//	{
//		return this.hibernateTemplate.get(Account.class, student_id);
//	}
//}
