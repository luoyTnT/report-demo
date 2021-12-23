package com.example.demo.entity.template;

import com.example.demo.entity.IEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 融资担保项目信息
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RzContractBaseInfo extends IEntity {

    /**
     * 项目编号;该ID需要在系统中唯一
     */
    private String contractNo;
    /**
     * 客户ID;系统中已存在的客户ID
     */
    private String contcustCode;
    /**
     * 客户名称;不超过20个汉字
     */
    private String contcustName;
    /**
     * 项目名称;不超过30个汉字
     */
    private String contractName;
    /**
     * 担保项目类型;枚举型：
     * 融资担保项目录入
     * 再担保融资担保项目录入
     */
    private String projectCode;
    /**
     * 申请日期;格式为YYYY-MM-DD，例如：2013-01-01
     */
    private Date applyDate;
    /**
     * 项目状态;枚举型：
     * 待放款
     * 项目在保
     * 结束
     * 删除
     */
    private String contStateCode;
    /**
     * 担保行业分类;枚举型：见批注或代码
     */
    private String industryCode;
    /**
     * 是否绿色信贷;枚举型： 是 否
     */
    private String isCredit;
    /**
     * 是否首贷;枚举型： 是 否
     */
    private String isFirst;
    /**
     * 是否为关联方担保/是否为比例风险型;枚举型： 是 否
     */
    private String isRelevance;
    /**
     * 发放方式;枚举型：
     * 直接发放
     * 转入
     * 其他发放方式
     */
    private String isSuecode;
    /**
     * 交易对手类型;枚举型：见批注或代码
     */
    private String contLendingCode;
    /**
     * 政策类型;枚举型：“双创双服”主体担保农户及新型农业经营主体担保小微企业战略性新兴产业担保其他政策性担保非政策性担保业务
     */
    private String policyCode;
    /**
     * 客户归属地;枚举型：见批注或代码
     */
    private String contRegionCode;
    /**
     * 担保业务类型;枚举型：见批注或代码
     */
    private String warrantCode;
    /**
     * 担保期限;阿拉伯数字，不允许有小数，单位为月
     */
    private Integer fixedTerm;
    /**
     * 合同金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，必须大于“0”
     */
    private BigDecimal contractAmount;
    /**
     * 优惠金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，如没有可写“0”
     */
    private BigDecimal discountAmount;
    /**
     * 担保费;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，如没有可写“0”
     */
    private BigDecimal guaranteeAmount;
    /**
     * 其他费用;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，如没有可写“0”
     */
    private BigDecimal otherAmount;
    /**
     * 放款日期;格式为YYYY-MM-DD，例如：2013-01-01
     */
    private Date lendingDate;
    /**
     * 实际结束日期;格式为YYYY-MM-DD，例如：2013-01-01
     */
    private Date realendDate;

}