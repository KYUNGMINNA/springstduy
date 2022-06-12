package com.fastcampus.ch3.db;

/*
오라클  DB계정 명 : itenlij
CREATE TABLE user_table(
        user_no NUMBER PRIMARY KEY,
        user_id VARCHAR2(30) NOT NULL,
        user_pw VARCHAR2(50) NOT NULL
        );

        CREATE SEQUENCE user_no_seq
        START WITH 1
        INCREMENT BY 1
        MAXVALUE 1000
        NOCYCLE
        NOCACHE;
*/

public class UserVO {

    private int userNo;
    private String userId;
    private String userPw;

    public UserVO() {
    }

    public UserVO(int userNo, String userId, String userPw) {
        this.userNo = userNo;
        this.userId = userId;
        this.userPw = userPw;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userNo=" + userNo +
                ", userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                '}';
    }
}
