package com.springbootdemo.springboot.entity;

import java.util.Date;

public class TestVo {
    private String name;
    private Integer score;
    private Integer male;
    private Date birthday;

    public TestVo(String name, Integer score, Integer male, Date birthday) {
        this.name = name;
        this.score = score;
        this.male = male;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getMale() {
        return male;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setMale(Integer male) {
        this.male = male;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
