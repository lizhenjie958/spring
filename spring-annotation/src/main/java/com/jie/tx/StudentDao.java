package com.jie.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql = "INSERT INTO student (name,sex,stu_code,stu_date) VALUES (?,?,?,now())";
        jdbcTemplate.update(sql,"jie",1,"aaaaaaa");
    }

}
