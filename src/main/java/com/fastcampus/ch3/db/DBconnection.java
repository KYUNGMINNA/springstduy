package com.fastcampus.ch3.db;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;


@Controller
public class DBconnection {


    @Autowired
    DataSource ds;

    @GetMapping("/jdbc")
    public void db() {
        System.out.println("JDBC로 DB연결하기 root-context.xml 파일  <bean id='dataSource'> ");
        System.out.println("ds = " + ds);

    }





}

