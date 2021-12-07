package com.example.demo.util;

import com.example.demo.entity.UserInfo;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.FileWriter;

public class VelocityTemplateGenerateXML2 {

//    private static final Logger logger = LoggerFactory.getLogger(VelocityTemplateGenerateXML2.class);

    public static void main(String[] args) {
        UserInfo userInfo = VelocityTemplateGenerateXML.setUserInfo();

        VelocityEngine velocityEngine = new VelocityEngine();

        VelocityContext context = new VelocityContext();
        context.put("request", userInfo);

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
