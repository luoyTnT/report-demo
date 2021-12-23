package com.example.demo.entity.template;

import com.example.demo.entity.IEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 项目代偿信息
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ContractCompen extends IEntity {

    /**
     * 代偿编号;该ID需要在系统中唯一
     */
    private String compenNo;
    /**
     * 项目编号;系统中已存在的项目编号
     */
    private String compenContractNo;
    /**
     * 代偿机构ID;项目中已存在的分担机构ID，当解保机构为本身时，填值compencode
     */
    private String compenCode;
    /**
     * 代偿机构名称;项目中已存在的分担机构名称，当解保机构为本身时，填值本身公司名称
     */
    private String compenName;
    /**
     * 代偿金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元
     */
    private BigDecimal compenAmount;
    /**
     * 其他费用;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元
     */
    private BigDecimal compenOtherAmount;
    /**
     * 代偿日期;格式为YYYY-MM-DD，例如：2013-01-01
     */
    private Date compenDate;

}