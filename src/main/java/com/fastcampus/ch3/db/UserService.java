package com.fastcampus.ch3.db;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    IUserDAO userDAO;
    @Override
    public void insert(UserVO user) {
        userDAO.insert(user);
    }

    @Override
    public List<UserVO> selectAll() {
    return userDAO.selectAll();
    }

    @Override
    public UserVO selectOne(int userNo) {
        return userDAO.selectOne(userNo);
    }

    @Override
    public void delete(int userNo) {
        userDAO.delete(userNo);
    }

    @Override
    public void update(UserVO user) {
        userDAO.update(user);
    }
}
