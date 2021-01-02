package springproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springproject.model.Attendance;


public class RowMapperImpl_Attendance implements RowMapper<Attendance>{

	public Attendance mapRow(ResultSet rs, int rowNum) throws SQLException {
		Attendance attendance = new Attendance();
		attendance.setStudent_id(rs.getInt(1));
		attendance.setTotal_attendance(rs.getInt(2));
		
		return attendance;
	}

}

