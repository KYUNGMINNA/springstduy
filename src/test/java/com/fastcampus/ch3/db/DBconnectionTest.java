package com.fastcampus.ch3.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;



//pom.xml에 <!-- https://mvnrepository.com/artifact/org.springframework/spring-test --> ::버전 4.12
//++        <!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/**/root-context.xml"})
public class DBconnectionTest {

    @Test
    public void db_connection_test() throws SQLException {
        //수동으로 DB접근 테스트
        ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");
        DataSource ds = ac.getBean(DataSource.class);

        Connection conn=ds.getConnection();  // SQLException을 발생시킴
        System.out.println("conn = " + conn);
        assertTrue(conn!=null);
    }

    //bean 주입받아서 자동으로 DB접근 테스트
    @Autowired
    DataSource ds;
    @Test
    public void mybatis_dbconnection_test() throws SQLException{
        Connection conn= ds.getConnection(); // SQLException을 발생시킴
        System.out.println("conn = " + conn);
        assertTrue(conn!=null);
    }
}