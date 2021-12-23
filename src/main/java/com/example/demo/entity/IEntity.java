package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class IEntity implements Serializable {

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
