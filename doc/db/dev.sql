
-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
                        `id` int(11) NOT NULL AUTO_INCREMENT,
                        `username` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                        `password` varchar(255) DEFAULT NULL,
                        `email` varchar(255) DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=110 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'admin1',   '123456', 'a1@adc.com');
INSERT INTO `tb_user` VALUES ('2', 'manager1', '123456', 'm1@abc.com');
INSERT INTO `tb_user` VALUES ('3', 'manager2', '123456', 'm2@abc.com');
INSERT INTO `tb_user` VALUES ('4', 'editor1',  '123456', 'e1@adc.com');
INSERT INTO `tb_user` VALUES ('5', 'editor2',  '123456', 'e2@abc.com');
INSERT INTO `tb_user` VALUES ('6', 'client1',  '123456', 'c1@abc.com');
INSERT INTO `tb_user` VALUES ('7', 'client2',  '123456', 'c2@adc.com');
INSERT INTO `tb_user` VALUES ('8', 'client3',  '123456', 'c3@abc.com');
INSERT INTO `tb_user` VALUES ('9', 'client4',  '123456', 'c4@abc.com');
