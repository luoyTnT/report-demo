package com.example.demo.entity.template.enums;

import java.util.List;

public interface IEnum {

    Integer getKey();

    String getValue();

    /**
     * 获取所有枚举值
     */
    default List<String> getEnumValue() { return null; }
}
