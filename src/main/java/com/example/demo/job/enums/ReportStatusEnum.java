package com.example.demo.job.enums;

import lombok.Getter;

@Getter
public enum ReportStatusEnum {

    INIT("INIT", "初始状态"),

    WAIT("WAIT", "待上报"),

    STOP("STOP", "暂停上报"),

    FAILED("FAILED", "上报失败"),

    SUCCESS("SUCCESS", "上报成功"),

    AUDIT_WAIT("AUDIT_WAIT", "上报待审核"),

    AUDIT_REJECT("AUDIT_REJECT", "审核不同意"),
    ;

    /**
     * 枚举值
     */
    private final String code;

    /**
     * 枚举描述
     */
    private final String message;

    /**
     * @PARAM CODE 枚举值
     * @PARAM MESSAGE 枚举描述
     */
    ReportStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
