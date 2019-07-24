package com.weirdstudio.model;


import com.weirdstudio.enums.UserSexEnum;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String userName;
    private String passWord;
    private String nickName;
    private UserSexEnum userSex;

    public User(){
        super();
    }

    public User(String userName, String passWord, UserSexEnum userSex) {
        this.userName = userName;
        this.passWord = passWord;
        this.userSex = userSex;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public UserSexEnum getUserSex() {
        return userSex;
    }

    public void setUserSex(UserSexEnum userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "userName " + this.userName + ", pasword " + this.passWord + "sex " + userSex.name();
    }
}
