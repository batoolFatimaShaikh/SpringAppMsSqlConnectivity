package com.example.registrationlogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;



@SpringBootApplication
public class RegistrationLoggingSpringBootSecurityApplication implements CommandLineRunner
{
	@Autowired
    private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoggingSpringBootSecurityApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	String sql = "SELECT * FROM Student";
	List<Student>student=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
	
	student.forEach(System.out::println);
	
			
	}

}
