package com.example.demo.entity.template.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 担保行业枚举
 */
@Getter
@AllArgsConstructor
public enum GuaranteeTradeEnum implements IEnum {

    AGRICULTURE(1, "农、林、牧、渔业"),
    MINING(2, "采矿业"),
    MANUFACTURING(3, "制造业"),
    SUPPLY_INDUSTRY(4, "电力、热力、燃气及水的生产和供应业"),
    CONSTRUCTION(5, "建筑业"),
    WHOLESALE_AND_RETAIL(6, "批发和零售业"),
    POSTAL_INDUSTRY(7, "交通运输、仓储和邮政业"),
    ACCOMMODATION_AND_CATERING(8, "住宿和餐饮业"),
    INFORMATION_SERVICE_INDUSTRY(9, "信息传输、软件和信息技术服务业"),
    FINANCE(10, "金融业"),
    REAL_ESTATE(11, "房地产业"),
    LEASING_AND_BUSINESS_SERVICE(12, "租赁和商务服务业"),
    SCIENTIFIC_TECHNOLOGY_SERVICE(13, "科学研究和技术服务业"),
    PUBLIC_FACILITIES_MANAGEMENT(14, "水利、环境和公共设施管理业"),
    RESIDENTIAL_AND_OTHER_SERVICE(15, "居民服务、修理和其他服务业"),
    EDUCATION(16, "教育"),
    HEALTH_AND_SOCIAL_WORK(17, "卫生和社会工作"),
    ENTERTAINMENT(18, "文化、体育和娱乐业"),
    PUBLIC_ADMINISTRATION_SOCIAL_SECURITY_SOCIAL_ORGANIZATION(19, "公共管理、社会保障和社会组织"),
    INTERNATIONAL_ORGANIZATION(20, "国际组织"),
    INDIVIDUAL_BUSINESS(21, "个体工商户"),
    SMALL_AND_MICRO_BUSINESS_OWNER(22, "小微企业主"),
    OTHER(23, "其他"),
    ABROAD(24, "境外"),
    ;

    private final Integer key;
    private final String value;

    @Override
    public List<String> getEnumValue() {
        List<String> list = new ArrayList<>();
        for (GuaranteeTradeEnum guaranteeTradeEnum : values()) {
            list.add(guaranteeTradeEnum.getValue());
        }
        return list;
    }
}
