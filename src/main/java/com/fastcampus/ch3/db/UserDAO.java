package com.fastcampus.ch3.db;

import com.mysql.cj.protocol.Resultset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO  implements  IUserDAO{
    @Autowired
    DataSource ds;


    @Override
    public void insert(UserVO user) {
        String sql="INSERT INTO user_table VALUES(?,?)";
        try(Connection conn=ds.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)
        ){
            pstmt.setString(1, user.getUserId());
            pstmt.setString(2, user.getUserPw());
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public List<UserVO> selectAll() {
        String sql="SELECT * FROM user_table";
        List<UserVO> selectList=new ArrayList<>();

        try(Connection conn=ds.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet set= pstmt.executeQuery();
        ){
            while(set.next()){
                UserVO user=new UserVO();
                set.getString("user_id");
                set.getString("user_pw");

                selectList.add(user);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return selectList;

    }

    @Override
    public UserVO selectOne(int userNo) {
        String sql="SELECT * FROM user_table WHERE=?";
        UserVO select=null;

        try(Connection conn=ds.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql);
        ){
            pstmt.setInt(1,userNo);
            ResultSet set= pstmt.executeQuery();
            if(set.next()){
                select=new UserVO();
                set.getString("user_id");
                set.getString("user_pw");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return select;

    }

    @Override
    public void delete(int userNo) {


    }

    @Override
    public void update(UserVO user) {
        String sql="UPDATE db_table SET pw=? WHERE id=?";
        try(Connection conn=ds.getConnection();
            PreparedStatement pstmt=conn.prepareStatement(sql)

        ){
            pstmt.setString(1, user.getUserId());
            pstmt.setString(2,user.getUserPw());
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
