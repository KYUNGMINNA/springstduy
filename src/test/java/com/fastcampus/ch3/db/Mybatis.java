package com.fastcampus.ch3.db;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/**/root-context.xml"})
public class Mybatis {

    @Autowired
    private SqlSession session;

    String namespace="com.fastcampus.ch3.db.IuserMapper.";

    @Test
    public void insert(UserVO vo){
        session.insert(namespace+"insert",vo);
    }
}
