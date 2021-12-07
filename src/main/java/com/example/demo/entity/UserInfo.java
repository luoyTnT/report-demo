package com.example.demo.entity;

import lombok.Data;

@Data
public class UserInfo {

    private String id;
    private String name;
    private String age;
    private String sex;

    private Account account;

}
