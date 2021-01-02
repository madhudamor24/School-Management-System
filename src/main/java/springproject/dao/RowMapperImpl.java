package springproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import springproject.model.Result;


public class RowMapperImpl implements RowMapper<Result>{

	public Result mapRow(ResultSet rs, int rowNum) throws SQLException {
		Result result = new Result();
		result.setStudent_id(rs.getInt(1));
		result.setSubject_code(rs.getInt(2));
		result.setMarks(rs.getInt(3));
		result.setGrade(rs.getString(4));
		
		return result;
	}

}

