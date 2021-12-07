package com.example.demo.util;

import lombok.Data;

@Data
public class Result {

    private boolean success = false;

    private String message;

    private String projectId;

    public boolean success() {
        return this.success;
    }

}
