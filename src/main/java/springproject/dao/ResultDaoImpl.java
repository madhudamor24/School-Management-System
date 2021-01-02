package springproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import springproject.model.Result;

@Component("resultDao")
public class ResultDaoImpl implements ResultDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Result result) {
		//insert query
        String query = "insert into result(student_id,subject_code, marks, grade) values(?,?,?,?)";
        int r = this.jdbcTemplate.update(query,result.getStudent_id(), result.getSubject_code(), result.getMarks(), result.getGrade());
		
        return r;
	}
	
	public int change(Result result) {
		//update data
		String query = "update result set marks=? ,grade=? where student_id=? and subject_code=?";
		int r = this.jdbcTemplate.update(query,result.getMarks(), result.getGrade(), result.getStudent_id(), result.getSubject_code());
        return r;
	}
	
	public int delete(int student_id, int subject_code) {
		// delete data
		String query = "delete from result where student_id=? and subject_code=?";
		int r = this.jdbcTemplate.update(query, student_id, subject_code);
        return r;
	}
	
	public Result getResult(int student_id, int subject_code) {
		// select single student data
		String query = "select * from result where student_id=? and subject_code=?";
		RowMapper<Result> rowMapper = new RowMapperImpl();
		Result result = this.jdbcTemplate.queryForObject(query, rowMapper, student_id, subject_code);
        return result;
	}
	
	public List<Result> getAllResults() {
		// select all students
		String query = "select * from result";
		List<Result> results = this.jdbcTemplate.query(query, new RowMapperImpl());
        return results;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
