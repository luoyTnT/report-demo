package com.example.demo;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;

/**
 * @author jiajixu
 * @date 2020/10/23 15:47
 */
public class CommonMysqlGenerator extends MysqlGenerator {


    @Override
    protected String authorName() {
        return "tanhaowen";
    }

    @Override
    protected String parentPackage() {
        return "com.example.demo";
    }

    @Override
    protected DataSourceConfig getDataSourceConfig() {
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/hunanreport?useUnicode=true&characterEncoding=UTF-8&useSSL=false&autoReconnect=true&failOverReadOnly=false&serverTimezone=GMT%2B8&allowMultiQueries=true&allowPublicKeyRetrieval=true");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        return dsc;
    }

    @Override
    protected String tablePrefix() {
//        return "sec_";
        return "xmxx_";
    }

    @Override
    protected String moduleName() {
        return "";
    }


    public static void main(String[] args) {
        new CommonMysqlGenerator().runs(
                "xmxx_contract_clearing",
                "xmxx_contract_compen",
                "xmxx_contract_recovery",
                "xmxx_contract_share",
                "xmxx_customer_base_info",
                "xmxx_frz_contract_base_info",
                "xmxx_lending_agency",
                "xmxx_rz_contract_base_info"
        );
    }
}
