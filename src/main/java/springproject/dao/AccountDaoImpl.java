package springproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import springproject.model.Account;

@Component("accountDao")
public class AccountDaoImpl implements AccountDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Account account) {
		//insert query
        String query = "insert into account(student_id, slip_number) values(?,?)";
        int r = this.jdbcTemplate.update(query, account.getStudent_id(), account.getSlip_number());
		
        return r;
	}
	
	public int change(Account account) {
		//update data
		String query = "update account set slip_number=? where student_id=?";
		int r = this.jdbcTemplate.update(query,account.getSlip_number(), account.getStudent_id());
        return r;
	}
	
	public int delete(int student_id) {
		// delete data
		String query = "delete from account where student_id=? ";
		int r = this.jdbcTemplate.update(query, student_id);
        return r;
	}
	
	public Account getAccount(int student_id) {
		// select single student data
		String query = "select * from account where student_id=? ";
		RowMapper<Account> rowMapper = new RowMapperImpl_Account();
		Account account = this.jdbcTemplate.queryForObject(query, rowMapper, student_id);
        return account;
	}
	
	public List<Account> getAllAccounts() {
		// select all students
		String query = "select * from account";
		List<Account> accounts = this.jdbcTemplate.query(query, new RowMapperImpl_Account());
        return accounts;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
