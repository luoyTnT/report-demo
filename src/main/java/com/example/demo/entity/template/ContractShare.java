package com.example.demo.entity.template;

import com.example.demo.entity.IEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 项目风险分担信息
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ContractShare extends IEntity {

    /**
     * 风险分担编号;该ID需要在系统中唯一
     */
    private String shareNo;
    /**
     * 项目编号;系统中已存在的项目编号
     */
    private String shareContractNo;
    /**
     * 分担机构ID;系统中已存在的ID，当分担机构为本身时，填值lendingcode
     */
    private String shareLendingCode;
    /**
     * 分担机构名称;系统中已存在的ID，当分担机构为本身时，填自身公司名称
     */
    private String shareLendingName;
    /**
     * 分担风险类型;枚举型：
     * 直接风险
     * 间接风险
     */
    private String riskCode;
    /**
     * 承担比例;阿拉伯数字，允许有小数，有效位为小数点后2位，最大值100
     */
    private BigDecimal bearProportion;
    /**
     * 承担金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元
     */
    private BigDecimal bearAmount;

}