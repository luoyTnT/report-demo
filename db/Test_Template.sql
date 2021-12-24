DROP TABLE IF EXISTS xmxx_lending_agency;
CREATE TABLE xmxx_lending_agency(
    lending_code VARCHAR(40) NOT NULL   COMMENT '机构ID;该ID需要在系统中唯一' ,
    lenders_code VARCHAR(255) NOT NULL   COMMENT '机构类型;枚举型：见批注或代码' ,
    lending_name VARCHAR(255) NOT NULL   COMMENT '机构名称;不超过30个汉字' ,
    second_ag_name VARCHAR(255) NOT NULL   COMMENT '二级机构名称;不超过30个汉字' ,
    risk_rate DECIMAL(20,2) NOT NULL   COMMENT '风险分担比例;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为%，不能为“0”' ,
    create_time DATETIME NOT NULL  DEFAULT now() COMMENT '创建时间' ,
    update_time DATETIME NOT NULL  DEFAULT now() COMMENT '更新时间' ,
    PRIMARY KEY (lending_code)
)  COMMENT = '风险分担机构信息';

DROP TABLE IF EXISTS xmxx_customer_base_info;
CREATE TABLE xmxx_customer_base_info(
    cust_code VARCHAR(40) NOT NULL   COMMENT '客户ID;该ID需要在系统中唯一' ,
    customer_code VARCHAR(255) NOT NULL   COMMENT '客户类型;枚举型：
企业客户 
个人客户' ,
    cust_name VARCHAR(255) NOT NULL   COMMENT '客户名称;不超过20个汉字' ,
    identity_code VARCHAR(255) NOT NULL   COMMENT '证件类型;枚举型：
身份证 
统一社会信用代码' ,
    identity_number VARCHAR(255) NOT NULL   COMMENT '证件号码' ,
    is_agriculture VARCHAR(255) NOT NULL   COMMENT '是否为农业经营主体;个人客户为空 
企业客户为枚举型：
是 
否
' ,
    scale_code VARCHAR(255) NOT NULL   COMMENT '客户类型/企业规模;个人客户枚举型：
农户
住户
其他
企业客户枚举型：
大型企业
中型企业
小型企业
微型企业
' ,
    cust_region_code VARCHAR(255) NOT NULL   COMMENT '归属地;枚举型：见批注或代码' ,
    create_time DATETIME NOT NULL  DEFAULT now() COMMENT '创建时间' ,
    update_time DATETIME NOT NULL  DEFAULT now() COMMENT '更新时间' ,
    PRIMARY KEY (cust_code)
)  COMMENT = '客户信息';

DROP TABLE IF EXISTS xmxx_rz_contract_base_info;
CREATE TABLE xmxx_rz_contract_base_info(
    contract_no VARCHAR(40) NOT NULL   COMMENT '项目编号;该ID需要在系统中唯一' ,
    contcust_code VARCHAR(40) NOT NULL   COMMENT '客户ID;系统中已存在的客户ID' ,
    contcust_name VARCHAR(255) NOT NULL   COMMENT '客户名称;不超过20个汉字' ,
    contract_name VARCHAR(255) NOT NULL   COMMENT '项目名称;不超过30个汉字' ,
    project_code VARCHAR(255) NOT NULL   COMMENT '担保项目类型;枚举型：
融资担保项目录入
再担保融资担保项目录入' ,
    apply_date DATETIME NOT NULL   COMMENT '申请日期;格式为YYYY-MM-DD，例如：2013-01-01' ,
    cont_state_code VARCHAR(255) NOT NULL   COMMENT '项目状态;枚举型：
待放款
项目在保
结束
删除' ,
    industry_code VARCHAR(255) NOT NULL   COMMENT '担保行业分类;枚举型：见批注或代码' ,
    is_credit VARCHAR(255) NOT NULL   COMMENT '是否绿色信贷;枚举型： 是 否' ,
    is_first VARCHAR(255) NOT NULL   COMMENT '是否首贷;枚举型： 是 否' ,
    is_relevance VARCHAR(255) NOT NULL   COMMENT '是否为关联方担保/是否为比例风险型;枚举型： 是 否' ,
    is_suecode VARCHAR(255) NOT NULL   COMMENT '发放方式;枚举型：
直接发放
转入
其他发放方式' ,
    cont_lending_code VARCHAR(255) NOT NULL   COMMENT '交易对手类型;枚举型：见批注或代码' ,
    policy_code VARCHAR(255) NOT NULL   COMMENT '政策类型;枚举型：“双创双服”主体担保农户及新型农业经营主体担保小微企业战略性新兴产业担保其他政策性担保非政策性担保业务' ,
    cont_region_code VARCHAR(255) NOT NULL   COMMENT '客户归属地;枚举型：见批注或代码' ,
    warrant_code VARCHAR(255) NOT NULL   COMMENT '担保业务类型;枚举型：见批注或代码' ,
    fixed_term INT NOT NULL   COMMENT '担保期限;阿拉伯数字，不允许有小数，单位为月' ,
    contract_amount DECIMAL(20,2) NOT NULL   COMMENT '合同金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，必须大于“0”' ,
    discount_amount DECIMAL(20,2) NOT NULL  DEFAULT 0 COMMENT '优惠金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，如没有可写“0”' ,
    guarantee_amount DECIMAL(20,2) NOT NULL  DEFAULT 0 COMMENT '担保费;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，如没有可写“0”' ,
    other_amount DECIMAL(20,2) NOT NULL  DEFAULT 0 COMMENT '其他费用;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，如没有可写“0”' ,
    lending_date DATETIME    COMMENT '放款日期;格式为YYYY-MM-DD，例如：2013-01-01' ,
    realend_date DATETIME    COMMENT '实际结束日期;格式为YYYY-MM-DD，例如：2013-01-01' ,
    create_time DATETIME NOT NULL  DEFAULT now() COMMENT '创建时间' ,
    update_time DATETIME NOT NULL  DEFAULT now() COMMENT '更新时间' ,
    PRIMARY KEY (contract_no)
)  COMMENT = '融资担保项目信息';

DROP TABLE IF EXISTS xmxx_frz_contract_base_info;
CREATE TABLE xmxx_frz_contract_base_info(
    contract_no VARCHAR(40) NOT NULL   COMMENT '项目编号;该ID需要在系统中唯一' ,
    contcust_code VARCHAR(40) NOT NULL   COMMENT '客户ID;系统中已存在的客户ID' ,
    contcust_name VARCHAR(255) NOT NULL   COMMENT '客户名称;不超过20个汉字' ,
    contract_name VARCHAR(255) NOT NULL   COMMENT '项目名称;不超过30个汉字' ,
    project_code VARCHAR(255) NOT NULL   COMMENT '担保项目类型;枚举型：
融资担保项目录入
再担保融资担保项目录入' ,
    apply_date DATETIME NOT NULL   COMMENT '申请日期;格式为YYYY-MM-DD，例如：2013-01-01' ,
    cont_state_code VARCHAR(255) NOT NULL   COMMENT '项目状态;枚举型：
待放款
项目在保
结束
删除' ,
    industry_code VARCHAR(255) NOT NULL   COMMENT '担保行业分类;枚举型：见批注或代码' ,
    is_first VARCHAR(255) NOT NULL   COMMENT '是否首贷;枚举型： 是 否' ,
    policy_code VARCHAR(255) NOT NULL   COMMENT '政策类型;枚举型：“双创双服”主体担保农户及新型农业经营主体担保小微企业战略性新兴产业担保其他政策性担保非政策性担保业务' ,
    cont_region_code VARCHAR(255) NOT NULL   COMMENT '客户归属地;枚举型：见批注或代码' ,
    warrant_code VARCHAR(255) NOT NULL   COMMENT '担保业务类型;枚举型：见批注或代码' ,
    fixed_term INT NOT NULL   COMMENT '担保期限;阿拉伯数字，不允许有小数，单位为月' ,
    contract_amount DECIMAL(20,2) NOT NULL   COMMENT '合同金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，必须大于“0”' ,
    discount_amount DECIMAL(20,2) NOT NULL  DEFAULT 0 COMMENT '优惠金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，如没有可写“0”' ,
    guarantee_amount DECIMAL(20,2) NOT NULL  DEFAULT 0 COMMENT '担保费;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，如没有可写“0”' ,
    other_amount DECIMAL(20,2) NOT NULL  DEFAULT 0 COMMENT '其他费用;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元，如没有可写“0”' ,
    lending_date DATETIME    COMMENT '放款日期;格式为YYYY-MM-DD，例如：2013-01-01' ,
    realend_date DATETIME    COMMENT '实际结束日期;格式为YYYY-MM-DD，例如：2013-01-01' ,
    create_time DATETIME NOT NULL  DEFAULT now() COMMENT '创建时间' ,
    update_time DATETIME NOT NULL  DEFAULT now() COMMENT '更新时间' ,
    PRIMARY KEY (contract_no)
)  COMMENT = '非融资担保项目信息';

DROP TABLE IF EXISTS xmxx_contract_share;
CREATE TABLE xmxx_contract_share(
    share_no VARCHAR(40) NOT NULL   COMMENT '风险分担编号;该ID需要在系统中唯一' ,
    share_contract_no VARCHAR(40) NOT NULL   COMMENT '项目编号;系统中已存在的项目编号' ,
    share_lending_code VARCHAR(40) NOT NULL   COMMENT '分担机构ID;系统中已存在的ID，当分担机构为本身时，填值lendingcode' ,
    share_lending_name VARCHAR(255) NOT NULL   COMMENT '分担机构名称;系统中已存在的ID，当分担机构为本身时，填自身公司名称' ,
    risk_code VARCHAR(255) NOT NULL   COMMENT '分担风险类型;枚举型：
直接风险
间接风险' ,
    bear_proportion DECIMAL(20,2) NOT NULL   COMMENT '承担比例;阿拉伯数字，允许有小数，有效位为小数点后2位，最大值100' ,
    bear_amount DECIMAL(20,2) NOT NULL   COMMENT '承担金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元' ,
    create_time DATETIME NOT NULL  DEFAULT now() COMMENT '创建时间' ,
    update_time DATETIME NOT NULL  DEFAULT now() COMMENT '更新时间' ,
    PRIMARY KEY (share_no)
)  COMMENT = '项目风险分担信息';

DROP TABLE IF EXISTS xmxx_contract_clearing;
CREATE TABLE xmxx_contract_clearing(
    clearing_no VARCHAR(40) NOT NULL   COMMENT '解保编号;该ID需要在系统中唯一' ,
    clearing_contract_no VARCHAR(40) NOT NULL   COMMENT '项目编号;系统中已存在的项目编号' ,
    clearing_code VARCHAR(40) NOT NULL   COMMENT '解保机构ID;项目中已存在的分担机构ID，当解保机构为本身时，填值lendingcode' ,
    clearing_amount DECIMAL(20,2) NOT NULL   COMMENT '解保金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元' ,
    clearing_other_amount DECIMAL(20,2) NOT NULL   COMMENT '其他费用;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元' ,
    clearing_date DATETIME NOT NULL   COMMENT '解保日期;格式为YYYY-MM-DD，例如：2013-01-01' ,
    clearing_take_back_code VARCHAR(255) NOT NULL   COMMENT '收回方式;枚举型：
直接收回
转出
发行abs
其他收回方式' ,
    create_time DATETIME NOT NULL  DEFAULT now() COMMENT '创建时间' ,
    update_time DATETIME NOT NULL  DEFAULT now() COMMENT '更新时间' ,
    PRIMARY KEY (clearing_no)
)  COMMENT = '项目解保信息';

DROP TABLE IF EXISTS xmxx_contract_compen;
CREATE TABLE xmxx_contract_compen(
    compen_no VARCHAR(40) NOT NULL   COMMENT '代偿编号;该ID需要在系统中唯一' ,
    compen_contract_no VARCHAR(40) NOT NULL   COMMENT '项目编号;系统中已存在的项目编号' ,
    compen_code VARCHAR(40) NOT NULL   COMMENT '代偿机构ID;项目中已存在的分担机构ID，当解保机构为本身时，填值compencode' ,
    compen_name VARCHAR(255) NOT NULL   COMMENT '代偿机构名称;项目中已存在的分担机构名称，当解保机构为本身时，填值本身公司名称' ,
    compen_amount DECIMAL(20,2) NOT NULL   COMMENT '代偿金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元' ,
    compen_other_amount DECIMAL(20,2) NOT NULL   COMMENT '其他费用;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元' ,
    compen_date DATETIME NOT NULL   COMMENT '代偿日期;格式为YYYY-MM-DD，例如：2013-01-01' ,
    create_time DATETIME NOT NULL  DEFAULT now() COMMENT '创建时间' ,
    update_time DATETIME NOT NULL  DEFAULT now() COMMENT '更新时间' ,
    PRIMARY KEY (compen_no)
)  COMMENT = '项目代偿信息';

DROP TABLE IF EXISTS xmxx_contract_recovery;
CREATE TABLE xmxx_contract_recovery(
    recovery_no VARCHAR(40) NOT NULL   COMMENT '追偿编号;该ID需要在系统中唯一' ,
    recovery_contract_no VARCHAR(40) NOT NULL   COMMENT '项目编号;系统中已存在的项目编号' ,
    recovery_amount DECIMAL(20,2) NOT NULL   COMMENT '追偿金额;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元' ,
    recovery_other_amount DECIMAL(20,2) NOT NULL   COMMENT '其他费用;阿拉伯数字，允许有小数，有效位为小数点后2位，单位为元' ,
    recovery_date DATETIME NOT NULL   COMMENT '追偿日期;格式为YYYY-MM-DD，例如：2013-01-01' ,
    recovery_take_back_code VARCHAR(255) NOT NULL   COMMENT '收回方式;枚举型：
核销（损失减少额）
转出
代偿
损失' ,
    create_time DATETIME NOT NULL  DEFAULT now() COMMENT '创建时间' ,
    update_time DATETIME NOT NULL  DEFAULT now() COMMENT '更新时间' ,
    PRIMARY KEY (recovery_no)
)  COMMENT = '项目追偿信息';