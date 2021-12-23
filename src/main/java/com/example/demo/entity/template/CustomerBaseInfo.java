package com.example.demo.entity.template;

import com.example.demo.entity.IEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 客户信息
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerBaseInfo extends IEntity {

    /**
     * 客户ID;该ID需要在系统中唯一
     */
    private String custCode;
    /**
     * 客户类型;枚举型：
     * 企业客户
     * 个人客户
     */
    private String customerCode;
    /**
     * 客户名称;不超过20个汉字
     */
    private String custName;
    /**
     * 证件类型;枚举型：
     * 身份证
     * 统一社会信用代码
     */
    private String identityCode;
    /**
     * 证件号码
     */
    private String identityNumber;
    /**
     * 是否为农业经营主体;个人客户为空
     * 企业客户为枚举型：
     * 是
     * 否
     */
    private String isAgriculture;
    /**
     * 客户类型/企业规模;个人客户枚举型：
     * 农户
     * 住户
     * 其他
     * 企业客户枚举型：
     * 大型企业
     * 中型企业
     * 小型企业
     * 微型企业
     */
    private String scaleCode;
    /**
     * 归属地;枚举型：见批注或代码
     */
    private String custRegionCode;

}
