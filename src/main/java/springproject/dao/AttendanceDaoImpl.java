package springproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import springproject.model.Attendance;

@Component("attendanceDao")
public class AttendanceDaoImpl implements AttendanceDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Attendance attendance) {
		//insert query
        String query = "insert into attendance(student_id,total_attendance) values(?,?)";
        int r = this.jdbcTemplate.update(query,attendance.getStudent_id(), attendance.getTotal_attendance());
		
        return r;
	}
	
	public int change(Attendance attendance) {
		//update data
		String query = "update attendance set total_attendance=? where student_id=? ";
		int r = this.jdbcTemplate.update(query, attendance.getTotal_attendance(), attendance.getStudent_id());
        return r;
	}
	
	public int delete(int student_id) {
		// delete data
		String query = "delete from attendance where student_id=?";
		int r = this.jdbcTemplate.update(query, student_id);
        return r;
	}
	
	public Attendance getAttendance(int student_id) {
		// select single student data
		String query = "select * from attendance where student_id=?";
		RowMapper<Attendance> rowMapper = new RowMapperImpl_Attendance();
		Attendance result = this.jdbcTemplate.queryForObject(query, rowMapper, student_id);
        return result;
	}
	
	public List<Attendance> getAllAttendance() {
		// select all students
		String query = "select * from attendance";
		List<Attendance> attendances = this.jdbcTemplate.query(query, new RowMapperImpl_Attendance());
        return attendances;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
