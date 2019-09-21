package com.itheima.domain;

import lombok.*;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Integer id;
    private String userName;
    private String password;
    private String nickName;

//    public User() {
//    }
//
//    public User(Integer id, String userName, String password, String nickName) {
//        this.id = id;
//        this.userName = userName;
//        this.password = password;
//        this.nickName = nickName;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getNickName() {
//        return nickName;
//    }
//
//    public void setNickName(String nickName) {
//        this.nickName = nickName;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", userName='" + userName + '\'' +
//                ", password='" + password + '\'' +
//                ", nickName='" + nickName + '\'' +
//                '}';
//    }
}
