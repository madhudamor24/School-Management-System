package springproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import springproject.model.Class_detail;

@Component("class_detailDao")
public class Class_detailDaoImpl implements Class_detailDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Class_detail class_detail) {
		//insert query
        String query = "insert into class_detail(class_id,subject_code) values(?,?)";
        int r = this.jdbcTemplate.update(query, class_detail.getClass_id(), class_detail.getSubject_code());
		
        return r;
	}
	
	public int change(Class_detail class_detail) {
		//update data
		String query = "update class_detail set subject_code=? where class_id=? and subject_code=?";
		int r = this.jdbcTemplate.update(query, class_detail.getSubject_code(), class_detail.getClass_id(), class_detail.getSubject_code());
        return r;
	}
	
	public int delete(int class_id, int subject_code) {
		// delete data
		String query = "delete from class_detail where class_id=? and subject_code=?";
		int r = this.jdbcTemplate.update(query, class_id, subject_code);
        return r;
	}
	
	public Class_detail getClass_detail(int class_id, int subject_code) {
		// select single student data
		String query = "select*from class_detail where class_id=? and subject_code=?";
		RowMapper<Class_detail> rowMapper = new RowMapperImpl_Class_detail();
		Class_detail class_detail = this.jdbcTemplate.queryForObject(query, rowMapper, class_id, subject_code);
        return class_detail;
	}
	
	public List<Class_detail> getAllClass_details() {
		// select all students
		String query = "select*from class_detail";
		List<Class_detail> class_details = this.jdbcTemplate.query(query, new RowMapperImpl_Class_detail());
        return class_details;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


}
