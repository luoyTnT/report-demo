package com.example.demo.entity.template.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 归属地枚举
 */
@Getter
@AllArgsConstructor
public enum AttributionEnum implements IEnum {

    BEIJING(1, "北京市"),
    TIANJIN(2, "天津市"),
    HEBEI(3, "河北省"),
    SHANXI(4, "山西省"),
    INNER_MONGOLIA_AUTONOMOUS_REGION(5, "内蒙古自治区"),
    LIAONING(6, "辽宁省"),
    JILIN(7, "吉林省"),
    HEILONGJIANG(8, "黑龙江省"),
    SHANGHAI(9, "上海市"),
    JIANGSU(10, "江苏省"),
    ZHEJIANG(11, "浙江省"),
    ANHUI(12, "安徽省"),
    FUJIAN(13, "福建省"),
    JIANGXI(14, "江西省"),
    SHANDONG(15, "山东省"),
    HENAN(16, "河南省"),
    HUBEI(17, "湖北省"),
    HUNAN(18, "湖南省"),
    GUANGDONG(19, "广东省"),
    GUANGXI_ZHUANG_AUTONOMOUS_REGION(20, "广西壮族自治区"),
    HAINAN(21, "海南省"),
    CHONGQING(22, "重庆市"),
    SICHUAN(23, "四川省"),
    GUIZHOU(24, "贵州省"),
    YUNNAN(25, "云南省"),
    TIBET_AUTONOMOUS_REGION(26, "西藏自治区"),
    SHAANXI(27, "陕西省"),
    GANSU(28, "甘肃省"),
    QINGHAI(29, "青海省"),
    NINGXIA_HUI_AUTONOMOUS_REGION(30, "宁夏回族自治区"),
    XINJIANG_UYGUR_AUTONOMOUS_REGION(31, "新疆维吾尔自治区"),
    ;

    private final Integer key;
    private final String value;

    @Override
    public List<String> getEnumValue() {
        List<String> list = new ArrayList<>();
        for (AttributionEnum attributionEnum : values()) {
            list.add(attributionEnum.getValue());
        }
        return list;
    }
}
