package com.example.demo.util;

import com.example.demo.entity.UserInfo;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.FileWriter;
import java.util.*;

public class VelocityTemplateGenerateXML2 {

//    private static final Logger logger = LoggerFactory.getLogger(VelocityTemplateGenerateXML2.class);

    public static void main(String[] args) {
        UserInfo userInfo = VelocityTemplateGenerateXML.setUserInfo();
        List<UserInfo> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(userInfo);
        }

        Map<String, Object> map = new HashMap<>();
        map.put("loops", list);

        VelocityEngine velocityEngine = new VelocityEngine();

        VelocityContext context = new VelocityContext();

        for (Map.Entry<String, Object> next : map.entrySet()) {
            context.put(next.getKey(), next.getValue());
        }

        Template template = velocityEngine.getTemplate("src\\main\\resources\\templates\\userInfo.vm", "UTF-8");

        try {
            FileWriter writer = VelocityTemplateGenerateXML.getFileWriter("userInfo_vm.xml");
            template.merge(context, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
