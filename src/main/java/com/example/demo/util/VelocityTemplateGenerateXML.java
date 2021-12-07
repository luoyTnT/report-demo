package com.example.demo.util;

import com.example.demo.entity.Account;
import com.example.demo.entity.UserInfo;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.text.MessageFormat;

public class VelocityTemplateGenerateXML {

    public static UserInfo setUserInfo() {
        Account account = new Account();
        account.setId("1");
        account.setMoney("100");

        UserInfo userInfo = new UserInfo();
        userInfo.setId("1");
        userInfo.setAge("20");
        userInfo.setName("张三");
        userInfo.setSex("男");
        userInfo.setAccount(account);
        return userInfo;
    }

    public static void main(String[] args) {
        UserInfo userInfo = setUserInfo();

        try {
//            WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
//            String templateUrl = wac.getServletContext().getRealPath("/");

//            String sysTemplateUrl = templateUrl + "WEB-INF/userInfo.vm";

//            Properties properties = new Properties();
//            properties.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

//            ve.setProperty("resource.loader", "class");
//            ve.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
//            ve.init();
//            Template template = ve.getTemplate("./userInfo.vm", "UTF-8");

//            Properties properties = new Properties();
//            properties.put("file.resource.loader.class", "D:\\idea-java-save\\mytest\\report-demo\\src\\main\\java\\com\\example\\demo\\util");
//            properties.put("file.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");


            VelocityEngine ve = new VelocityEngine();
//            ve.setProperty("file.resource.loader.class", ClasspathResourceLoader.class.getName());
//            ve.setProperty("resource.loader", "/");
//            ve.setProperty("velocimacro.library", "classpath:userInfo.vm");
//            ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
//            ve.setProperty("webapp.resource.loader.path", "/");
//            ve.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, "D:/idea-java-save/mytest/report-demo/");

//            ve.init();
            VelocityContext context = new VelocityContext();
            context.put("request", userInfo);

            Template template = ve.getTemplate("userInfo.vm");

            StringWriter fileWriter = new StringWriter();
            template.merge(context, fileWriter);

            System.out.println(fileWriter.toString());

            fileWriter.flush();
            fileWriter.close();
        } catch (
                Exception ex) {
            ex.printStackTrace();
        }
    }

    public static FileWriter getFileWriter(String path) throws IOException {
        String fullPath = MessageFormat.format("{1}{0}{2}",
                File.separator,
                "d://",
                path);
        System.out.println("fileName = " + fullPath);
        File outputFile = new File(fullPath);
        return new FileWriter(outputFile);
    }

}
