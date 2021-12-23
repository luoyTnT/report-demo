package com.example.demo.entity.template.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 机构类型枚举
 */
@Getter
@AllArgsConstructor
public enum LendingAgencyEnum implements IEnum {

    NON_FINANCIAL_ENTERPRISE(1, "非金融企业"),
    DEVELOPMENT_BANK_AND_POLICY_BANK(2, "国家开发银行及政策性银行"),
    FOUR_MAJOR_STATE_OWNED_COMMERCIAL_BANK(3, "四大国有商业银行"),
    COMMUNICATION_POSTAL_SERVICES_COMMERCIAL_BANK(4, "交通银行、中国邮政储蓄银行及股份制商业银行"),
    CITY_COMMERCIAL_BANK(5, "城市商业银行"),
    RURAL_COOPERATIVE_FINANCIAL_INSTITUTIONS(6, "农村合作金融机构"),
    OTHER_BANKING_DEPOSIT_FINANCIAL_INSTITUTIONS(7, "其他银行业存款类金融机构"),
    BANKING_NON_DEPOSIT_FINANCIAL_INSTITUTIONS(8, "银行业非存款类金融机构"),
    NON_BANKING_FINANCIAL_INSTITUTIONS(9, "非银行业金融机构"),
    SPECIFIC_PURPOSE_VEHICLE(10, "特定目的载体"),
    MICROFINANCE_COMPANY(11, "小额贷款公司"),
    FINANCING_GUARANTEE_COMPANY(12, "融资担保公司"),
    REGIONAL_EQUITY_MARKET(13, "区域性股权市场"),
    PAWN_SHOP(14, "典当行"),
    FINANCE_LEASING_COMPANY(15, "融资租赁公司"),
    COMMERCIAL_FACTORING_COMPANY(16, "商业保理公司"),
    LOCAL_ASSET_MANAGEMENT_COMPANY(17, "地方资产管理公司"),
    OTHER(18, "其他"),
    NATIONAL_GUARANTEE_FUND(19, "国家级担保基金"),
    PROVINCIAL_GUARANTEE_FUND(20, "省级担保基金"),
    MUNICIPAL_GUARANTEE_FUND(21, "市级担保基金"),
    PROVINCIAL_PEOPLE_IS_GOVERNMENT(22, "省级人民政府"),
    MUNICIPAL_PEOPLE_IS_GOVERNMENT(23, "市级人民政府"),
    COUNTY_LEVEL_PEOPLE_IS_GOVERNMENT(24, "县级人民政府"),
    PROVINCIAL_FINANCING_GUARANTEE_COMPANY(25, "省级融资担保公司"),
    MUNICIPAL_FINANCING_GUARANTEE_COMPANY(26, "市级融资担保公司"),
    COUNTY_LEVEL_FINANCING_GUARANTEE_COMPANY(27, "县级融资担保公司"),
    ;

    private final Integer key;
    private final String value;

    @Override
    public List<String> getEnumValue() {
        List<String> list = new ArrayList<>();
        for (LendingAgencyEnum agencyEnum : values()) {
            list.add(agencyEnum.getValue());
        }
        return list;
    }
}
