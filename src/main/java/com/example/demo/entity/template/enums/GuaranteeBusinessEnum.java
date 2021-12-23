package com.example.demo.entity.template.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 担保业务枚举
 */
@Getter
@AllArgsConstructor
public enum GuaranteeBusinessEnum implements IEnum {

    LOAN_GUARANTEE(1, "借款类担保（贷款担保）"),
    HOUSING_AND_REAL_ESTATE_GUARANTEE(2, "借款类担保（住房置业担保）"),
    VEHICLE_LOAN_GUARANTEE(3, "借款类担保（车贷担保）"),
    PRIVATE_LOAN_GUARANTEE(4, "借款类担保（民间借贷担保）"),
    INTERNET_LOAN_GUARANTEE(5, "借款类担保（互联网借贷担保）"),
    FINANCE_LEASE_GUARANTEE(6, "借款类担保（融资租赁担保）"),
    COMMERCIAL_FACTORING_GUARANTEE(7, "借款类担保（商业保理担保）"),
    BILL_ACCEPTANCE_GUARANTEE(8, "借款类担保（票据承兑担保）"),
    LETTER_OF_CREDIT_GUARANTEE(9, "借款类担保（信用证担保）"),
    PERSONAL_CONSUMPTION_GUARANTEE(10, "借款类担保（个人消费担保）"),
    OTHER_GUARANTEE(11, "借款类担保（其他）"),
    URBAN_INVESTMENT_BOND_ISSUANCE_GUARANTEE(12, "发行债券类担保（城投债发行担保）"),
    OTHER_BOND_ISSUANCE_GUARANTEE(13, "发行债券类担保（其他债券发行担保）"),
    OTHER_FINANCING_GUARANTEE_BUSINESS(14, "其他融资担保业务"),
    ;

    private final Integer key;
    private final String value;

    @Override
    public List<String> getEnumValue() {
        List<String> list = new ArrayList<>();
        for (GuaranteeBusinessEnum guaranteeBusinessEnum : values()) {
            list.add(guaranteeBusinessEnum.getValue());
        }
        return list;
    }
}
