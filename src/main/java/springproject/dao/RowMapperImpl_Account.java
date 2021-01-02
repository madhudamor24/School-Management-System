package springproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import springproject.model.Account;


public class RowMapperImpl_Account implements RowMapper<Account>{

	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account();
		account.setStudent_id(rs.getInt(1));
		account.setSlip_number(rs.getString(2));
		
		return account;
	}

}

