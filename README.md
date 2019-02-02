# testcloud JUST FOR FUN

1、springcloudeureka模块使用eureka作为服务注册中心

2、springcustomer1模块为zipkin模块，为请求追踪服务（这个为啥只能最终一个服务，有问题啊）

3、springcustomer3模块为消费者模块提供feign负载均衡服务

4、springmybatis 模块为生产者模块（mybatis）mysql数据库配置自己修改

5、springmybatis2 模块为生产者模块（mybatis）mysql数据库配置自己修改

6、springprovider1模块为生产者模块主要目的是为了测试用（可DIY）

6、springprovider2模块为生产者模块主要目的是为了测试用（可DIY）



启动顺序：
	springcloudeureka模块 -》 springcustomer1模块 -》其他模块


数据库中所需表创建SQL:
-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(64) DEFAULT NULL,
  `username` varchar(64) DEFAULT NULL,
  `password_hash` varchar(128) DEFAULT NULL,
  `confirmed` tinyint(1) DEFAULT NULL,
  `nackname` varchar(64) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `chathead` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `ix_users_email` (`email`) USING BTREE,
  UNIQUE KEY `ix_users_username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'charlay_yu@163.com', 'yxy', 'pbkdf2:sha256:50000$7Qvd8X5c$503583dd0bb0e4e7a4cad2172a431639bb32da49c5aec0dfa966d7aaec023b22', '1', null, '1988-12-05 00:00:00', '/static/upload/201806111649229967.png');
INSERT INTO `users` VALUES ('6', '1037041223@qq.com', 'zwy', 'pbkdf2:sha256:50000$bSKiCWmF$4eda1a22fa1171e7e88d5b33a68215d716c655f7fd3576f1c38ff1a0c035bd36', '1', null, '2000-01-01 00:00:00', '/static/upload/201810262009485886.jpg');
INSERT INTO `users` VALUES ('7', '1357200562@qq.com', 'bob', 'pbkdf2:sha256:50000$bB95HkZ7$7013ba5de821bc557b74fb5dce15b581ff8d35ded042cd5e030465230bcc300f', '1', null, '1991-02-02 00:00:00', '/static/upload/201810311124501084.png');


CREATE TABLE `refuse_queue` (
  `ORG_CDE` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '机构代码',
  `PRD_ID` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '产品代码',
  `APPL_CDE` varchar(25) COLLATE utf8_bin NOT NULL COMMENT '申请书编号',
  `ID_TYP` varchar(2) COLLATE utf8_bin NOT NULL COMMENT '00、员工代码 20、身份证 22、护照 23、军官证 25、港澳居民来往内地通行证 26、台湾居民来往大陆通行证 2X、其他证件 30、组织机构代码证 31、营业执照',
  `ID_NO` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '角色身份证号码',
  `CUST_NAME` varchar(60) COLLATE utf8_bin NOT NULL COMMENT '姓名',
  `APPL_DT` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '申请日期',
  `REFUSE_DT` varchar(10) COLLATE utf8_bin NOT NULL COMMENT '拒绝日期',
  PRIMARY KEY (`ORG_CDE`,`PRD_ID`,`APPL_CDE`,`ID_TYP`,`ID_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


