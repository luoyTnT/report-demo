package com.example.demo.util;

import com.example.demo.entity.template.CustomerBaseInfo;
import com.example.demo.entity.template.LendingAgency;
import com.example.demo.entity.template.Templates;
import com.example.demo.entity.template.enums.AttributionEnum;
import com.example.demo.entity.template.enums.LendingAgencyEnum;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;

import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VmGenerateXmlDemo {

    @Test
    public void VmGenerateXmlDemo1() {
        Templates templates = this.setTemplateParam();

        Map<String, Object> map = new HashMap<>();
        map.put("templates", templates);

        VelocityEngine velocityEngine = new VelocityEngine();
        VelocityContext context = new VelocityContext();

        for (Map.Entry<String, Object> next : map.entrySet()) {
            context.put(next.getKey(), next.getValue());
        }

        Template template = velocityEngine.getTemplate("src\\main\\resources\\templates\\reportInfo.vm", "UTF-8");

        try {
            FileWriter writer = VelocityTemplateGenerateXML.getFileWriter("Test_Template.xml");
            template.merge(context, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Templates setTemplateParam() {
        Templates templates = new Templates();

        this.setLeadingAgency(templates);

        this.setCustomerBaseInfo(templates);

        return templates;
    }

    private void setLeadingAgency(Templates templates) {
        List<LendingAgency> lendingAgencies = new ArrayList<>();

        for (int i = 1; i < 3; i++) {
            LendingAgency lendingAgency = new LendingAgency();
            lendingAgency.setLendingCode("100" + i);
            lendingAgency.setLeadersCode(LendingAgencyEnum.FOUR_MAJOR_STATE_OWNED_COMMERCIAL_BANK.getValue());
            lendingAgency.setLendingName("中国农业银行重庆" + i + "分行");
            lendingAgency.setSecondAgName("中国农业银行长沙芙蓉区" + i + "支行");
            lendingAgency.setRiskRate(new BigDecimal("30.1" + i));
            lendingAgencies.add(lendingAgency);
        }

        templates.setLendingAgencies(lendingAgencies);
    }

    private void setCustomerBaseInfo(Templates templates) {
        List<CustomerBaseInfo> customerBaseInfos = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            CustomerBaseInfo customerBaseInfo = new CustomerBaseInfo();
            customerBaseInfo.setCustCode("200" + i);
            customerBaseInfo.setCustName("张" + i);
            customerBaseInfo.setCustomerCode("企业客户");
            customerBaseInfo.setCustRegionCode(AttributionEnum.CHONGQING.getValue());
            customerBaseInfo.setIdentityCode("身份证");
            customerBaseInfo.setIdentityNumber("11111111111111111" + i);
            customerBaseInfo.setIsAgriculture("否");
            customerBaseInfo.setScaleCode("住户");
            customerBaseInfos.add(customerBaseInfo);
        }

        templates.setCustomerBaseInfos(customerBaseInfos);
    }

}
