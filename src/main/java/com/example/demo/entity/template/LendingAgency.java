package com.example.demo.entity.template;

import com.example.demo.entity.IEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 风险分担机构信息
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class LendingAgency extends IEntity {

    /**
     * 机构ID 该ID需要在系统中唯一
     */
    private String lendingCode;

    /**
     * 机构类型 枚举型
     */
    private String leadersCode;

    /**
     * 机构名称 不超过30个汉字
     */
    private String lendingName;

    /**
     * 二级机构名称 不超过30个汉字
     */
    private String secondAgName;

    /**
     * 风险分担比例 阿拉伯数字，允许有小数，有效位为小数点后2位，单位为%，不能为“0”
     */
    private BigDecimal riskRate;

}
