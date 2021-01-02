package springproject.controller;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import springproject.dao.ResultDao;
import springproject.dao.ResultDaoImpl;

import springproject.dao.Class_detailDao;
import springproject.dao.Class_detailDaoImpl;

import springproject.dao.AccountDao;
import springproject.dao.AccountDaoImpl;

import springproject.dao.AttendanceDao;
import springproject.dao.AttendanceDaoImpl;


@Configuration
@ComponentScan(basePackages = {"springproject.dao"})
public class JdbcConfig {
	
	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/dbmspro");
		ds.setUsername("root");
		ds.setPassword("1234");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
}
