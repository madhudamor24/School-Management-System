package springproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import springproject.model.Class_detail;


public class RowMapperImpl_Class_detail implements RowMapper<Class_detail>{

	public Class_detail mapRow(ResultSet rs, int rowNum) throws SQLException {
		Class_detail class_detail = new Class_detail();
		class_detail.setClass_id(rs.getInt(1));
		class_detail.setSubject_code(rs.getInt(2));
		
		return class_detail;
	}

}

