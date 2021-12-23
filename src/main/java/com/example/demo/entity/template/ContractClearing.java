package com.example.demo.entity.template;

import com.example.demo.entity.IEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 项目解保信息
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ContractClearing extends IEntity {

    /**
     * 解保编号;该ID需要在系统中唯一
     */
    private String clearingNo;
    /**
     * 项目编号;系统中已存在的项目编号
     */
    private String clearingContractNo;
    /**
     * 解保机构ID;项目中已存在的分担机构ID，当解保机构为本身时，填值lendingcode
     */
    private String clearingCode;
    /**
     * 解保金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元
     */
    private BigDecimal clearingAmount;
    /**
     * 其他费用;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元
     */
    private BigDecimal clearingOtherAmount;
    /**
     * 解保日期;格式为YYYY-MM-DD，例如：2013-01-01
     */
    private Date clearingDate;
    /**
     * 收回方式;枚举型：
     * 直接收回
     * 转出
     * 发行abs
     * 其他收回方式
     */
    private String clearingTakeBackCode;

}