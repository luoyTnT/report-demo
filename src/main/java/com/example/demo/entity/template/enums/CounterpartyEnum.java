package com.example.demo.entity.template.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 交易对手枚举
 */
@Getter
@AllArgsConstructor
public enum CounterpartyEnum implements IEnum {

    HOUSEHOLD(1, "住户"),
    NON_FINANCIAL_ENTERPRISE(2, "非金融企业"),
    DEVELOPMENT_BANK_AND_POLICY_BANK(3, "国家开发银行及政策性银行"),
    FOUR_MAJOR_STATE_OWNED_COMMERCIAL_BANK(4, "四大国有商业银行"),
    COMMUNICATION_POSTAL_SERVICES_COMMERCIAL_BANK(5, "交通银行、中国邮政储蓄银行及股份制商业银行"),
    CITY_COMMERCIAL_BANK(6, "城市商业银行"),
    RURAL_COOPERATIVE_FINANCIAL_INSTITUTIONS(7, "农村合作金融机构"),
    OTHER_BANKING_DEPOSIT_FINANCIAL_INSTITUTIONS(8, "其他银行业存款类金融机构"),
    BANKING_NON_DEPOSIT_FINANCIAL_INSTITUTIONS(9, "银行业非存款类金融机构"),
    NON_BANKING_FINANCIAL_INSTITUTIONS(10, "非银行业金融机构"),
    SPECIFIC_PURPOSE_VEHICLE(11, "特定目的载体"),
    MICROFINANCE_COMPANY(12, "小额贷款公司"),
    FINANCING_GUARANTEE_COMPANY(13, "融资担保公司"),
    REGIONAL_EQUITY_MARKET(14, "区域性股权市场"),
    PAWN_SHOP(15, "典当行"),
    FINANCE_LEASING_COMPANY(16, "融资租赁公司"),
    COMMERCIAL_FACTORING_COMPANY(17, "商业保理公司"),
    LOCAL_ASSET_MANAGEMENT_COMPANY(18, "地方资产管理公司"),
    OTHER(19, "其他"),
    ;

    private final Integer key;
    private final String value;

    @Override
    public List<String> getEnumValue() {
        List<String> list = new ArrayList<>();
        for (CounterpartyEnum counterpartyEnum : values()) {
            list.add(counterpartyEnum.getValue());
        }
        return list;
    }
}
