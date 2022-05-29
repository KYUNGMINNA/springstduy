package com.fastcampus.ch3.db;

import java.util.Date;

public class User_DTO {
    String id;
    String pwd;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }



    User_DTO(){}

    public User_DTO(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;

    }

    @Override
    public String toString() {
        return "User_DTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
