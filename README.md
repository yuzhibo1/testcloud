# testcloud JUST FOR FUN

1��springcloudeurekaģ��ʹ��eureka��Ϊ����ע������

2��springcustomer1ģ��Ϊzipkinģ�飬Ϊ����׷�ٷ������Ϊɶֻ������һ�����������Ⱑ��

3��springcustomer3ģ��Ϊ������ģ���ṩfeign���ؾ������

4��springmybatis ģ��Ϊ������ģ�飨mybatis��mysql���ݿ������Լ��޸�

5��springmybatis2 ģ��Ϊ������ģ�飨mybatis��mysql���ݿ������Լ��޸�

6��springprovider1ģ��Ϊ������ģ����ҪĿ����Ϊ�˲����ã���DIY��

6��springprovider2ģ��Ϊ������ģ����ҪĿ����Ϊ�˲����ã���DIY��


���ݿ����������SQL:
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


