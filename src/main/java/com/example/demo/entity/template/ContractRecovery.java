package com.example.demo.entity.template;

import com.example.demo.entity.IEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 项目追偿信息
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ContractRecovery extends IEntity {

    /**
     * 追偿编号;该ID需要在系统中唯一
     */
    private String recoveryNo;
    /**
     * 项目编号;系统中已存在的项目编号
     */
    private String recoveryContractNo;
    /**
     * 追偿金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元
     */
    private BigDecimal recoveryAmount;
    /**
     * 其他费用;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元
     */
    private BigDecimal recoveryOtherAmount;
    /**
     * 追偿日期;格式为YYYY-MM-DD，例如：2013-01-01
     */
    private Date recoveryDate;
    /**
     * 收回方式;枚举型：
     * 核销（损失减少额）
     * 转出
     * 代偿
     * 损失
     */
    private String recoveryTakeBackCode;

}