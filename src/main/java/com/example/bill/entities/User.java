package com.example.bill.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

	private String username;
    private String realName;
    private String password;
    private Integer gender;
    private Date birthday;
    private Integer userType;

    public User() {
    }

    public User(String username, Integer gender) {
        this.username = username;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public User(Integer id, String username, String realName, String password, Integer gender, Integer userType) {
        this.id = id;
        this.username = username;
        this.realName = realName;
        this.password = password;
        this.gender = gender;
        this.birthday = new Date();
        this.userType = userType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", userType=" + userType +
                '}';
    }
}
