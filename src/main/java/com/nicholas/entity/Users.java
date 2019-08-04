package com.nicholas.entity;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class Users {

    @Id
    @SequenceGenerator(name="user_generator", sequenceName = "user_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @Column(name = "id")
    private int id;

    @Column(name = "user")
    private String userName;

    @Column(name = "password")
    private String userPass;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                '}';
    }
}

