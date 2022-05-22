package com.fastcampus.ch3.db;

import com.mysql.cj.protocol.Resultset;
import org.apache.ibatis.jdbc.SQL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void db_insert_test() throws SQLException{
        String sql="INSERT INTO db_table VALUES(?,?)";
        try(Connection conn=ds.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)

                ){

                pstmt.setString(1, "아이디임");
                pstmt.setString(2, "비밀번호임");
                pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void db_delete_tset() throws SQLException{
        String sql="delete FROM db_table WHERE id=?";
        try(Connection conn=ds.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)

        ){
            pstmt.setString(1,"아이디임10");
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public void db_update_test() throws SQLException {
        String sql="UPDATE db_table SET pw=? WHERE id=?";
        try(Connection conn=ds.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)

        ){
            pstmt.setString(1,"비밀번호임1");
            pstmt.setString(2,"아이디임");
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void db_select_test() throws SQLException{
        String sql="SELECT * FROM db_table";
        try(Connection conn=ds.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs=pstmt.executeQuery()

        ){

            while(rs.next()){
                System.out.println( "id = "+rs.getString("id")+" "+
                        "pw ="+rs.getString("pw"));
                System.out.println("---------");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}