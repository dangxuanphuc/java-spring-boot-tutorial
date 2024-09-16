package com.phucdx.SpringJDBCExample.repo;

import com.phucdx.SpringJDBCExample.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        String sql = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
        int rows = jdbc.update(sql, student.getId(), student.getName(), student.getAge());
        System.out.println(rows + " effected");
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";

        return jdbc.query(sql, (ResultSet rs, int rowNum) -> {
            Student s = new Student();

            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setAge(rs.getInt("age"));

            return s;
        });
    }
}
