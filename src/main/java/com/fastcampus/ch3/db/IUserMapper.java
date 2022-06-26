package com.fastcampus.ch3.db;

import java.util.List;

public interface IUserMapper {

    //회원 가입
    void insert(UserVO user);

    //회원 전체 조회
    List<UserVO> selectAll();

    //회원 1명 조회
    UserVO selectOne(int userNo);

    //회원 삭제
    void delete(int userNo);

    //회원 수정
    void update(UserVO user);
}
