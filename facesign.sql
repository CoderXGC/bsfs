/*
 Navicat Premium Data Transfer

 Source Server         : 150.158.31.224
 Source Server Type    : MySQL
 Source Server Version : 50650
 Source Host           : 150.158.31.224:3306
 Source Schema         : facesign

 Target Server Type    : MySQL
 Target Server Version : 50650
 File Encoding         : 65001

 Date: 15/05/2022 14:58:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '8:00',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `signintime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '8T00',
  `signoutime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '5:00',
  `did` int(11) NULL DEFAULT NULL,
  `telnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('10001', 'E1ADC3949BA59ABBE56E057F2F883E', '谭蕾', '8:00', '5:00', 0, NULL, NULL, '0');
INSERT INTO `admin` VALUES ('10002', 'E1ADC3949BA59ABBE56E057F2F883E', '徐广超', '8:00', '5:00', 0, NULL, NULL, '0');

-- ----------------------------
-- Table structure for audit
-- ----------------------------
DROP TABLE IF EXISTS `audit`;
CREATE TABLE `audit`  (
  `applyid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `message` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `applytime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `starttime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `endtime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`applyid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of audit
-- ----------------------------
INSERT INTO `audit` VALUES ('100032021-05-02|16:23:00', '请假', '2021-05-02|16:23:00', '2021-05-07 00:00:00', '2021-05-08 00:00:00', '1', '10003', '事假', '18');

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company`  (
  `id` int(11) NOT NULL,
  `cname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES (0, 'TL科技有限公司');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (0, '技术部', 0);

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `message` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of log
-- ----------------------------
INSERT INTO `log` VALUES ('0', '2020登录');
INSERT INTO `log` VALUES ('1', '1234511161111');
INSERT INTO `log` VALUES ('2', '123456');
INSERT INTO `log` VALUES ('20', '123456');
INSERT INTO `log` VALUES ('2000', '123456');
INSERT INTO `log` VALUES ('222', '1234511161111');
INSERT INTO `log` VALUES ('2223', '1234511161111');
INSERT INTO `log` VALUES ('22234', '1234511161111');
INSERT INTO `log` VALUES ('222345', '1234511161111');
INSERT INTO `log` VALUES ('23331113', '12345');
INSERT INTO `log` VALUES ('23331114', '12345');
INSERT INTO `log` VALUES ('233311145', '12345');

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`  (
  `id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `message` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `did` int(20) NULL DEFAULT NULL,
  `issueid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of notice
-- ----------------------------

-- ----------------------------
-- Table structure for signlog
-- ----------------------------
DROP TABLE IF EXISTS `signlog`;
CREATE TABLE `signlog`  (
  `id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `signid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  `latetime` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  `signintime` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  `daytime` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `did` int(20) NULL DEFAULT NULL,
  `machine` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `signouttime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  PRIMARY KEY (`signid`) USING BTREE,
  INDEX `id`(`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of signlog
-- ----------------------------
INSERT INTO `signlog` VALUES ('0', '0', '1', '0', '0', 0, '0', NULL);
INSERT INTO `signlog` VALUES ('', '01', '0', '0', '', NULL, NULL, '0');
INSERT INTO `signlog` VALUES ('0', '02021-01-05', '1', '2021/1/5 16:55:47', '2021-01-05', NULL, NULL, NULL);
INSERT INTO `signlog` VALUES ('0', '02021-01-09', '1', '2021/1/9 13:24:04', '2021-01-09', NULL, NULL, NULL);
INSERT INTO `signlog` VALUES ('0', '02021-03-21', '1', '2021/3/21 12:31:11', '2021-03-21', NULL, NULL, NULL);
INSERT INTO `signlog` VALUES ('0', '02021-03-22', '1', '2021/3/22 19:53:24', '2021-03-22', NULL, NULL, NULL);
INSERT INTO `signlog` VALUES ('0', '02021-04-14', '1', '2021/4/14 10:42:11', '2021-04-14', NULL, NULL, NULL);
INSERT INTO `signlog` VALUES ('0', '02021-04-22', '1', '2021/4/22 9:21:39', '2021-04-22', NULL, NULL, NULL);
INSERT INTO `signlog` VALUES ('0', '02021-04-24', '', '2021-04-24 09:27:25', '2021-04-24', 0, NULL, '2021-04-24 20:48:58');
INSERT INTO `signlog` VALUES ('0', '02021-04-25', '', '2021-04-25 10:50:46', '2021-04-25', 0, NULL, '2021-04-25 21:23:02');
INSERT INTO `signlog` VALUES ('10003', '100032021-05-02', '4:5', '2021-05-02 12:15:28', '2021-05-02', 0, NULL, '0');
INSERT INTO `signlog` VALUES ('1', '12021-04-25', '', '2021-04-25 11:11:41', '2021-04-25', 0, NULL, '0');
INSERT INTO `signlog` VALUES ('0', '2', '1', NULL, '0', 0, '0', NULL);
INSERT INTO `signlog` VALUES ('0', '666', '1', NULL, '0', 0, '0', NULL);
INSERT INTO `signlog` VALUES ('0', '6667', '1', NULL, '0', 0, '0', NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `faceimg` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'E1ADC3949BA59ABBE56E057F2F883E',
  `did` int(11) NULL DEFAULT NULL,
  `signintime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '8:00',
  `signouttime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '17:00',
  `telnum` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('10003', '徐广超', 'https://www.ylesb.com/csimg/0QQ图片20191016194509.jpg', 'FCEA92F7412B5DA7BE0CF42B8C93759', 0, '8:00', '17:00', '15054959694', '466534434@qq.com', '1');
INSERT INTO `user` VALUES ('10004', '谭蕾', 'http://localhost:8080/faceImg/1111.jpg', 'E1ADC3949BA59ABBE56E057F2F883E', 0, '8:00', '17:00', '15054959694', '466534434@qq.com', '1');
INSERT INTO `user` VALUES ('10007', 'xgc', '0', 'E1ADC3949BA59ABBE56E057F2F883E', 0, '8:00', '17:00', '0', '0', '0');
INSERT INTO `user` VALUES ('10008', 'tl', '0', 'E1ADC3949BA59ABBE56E057F2F883E', 0, '8:00', '17:00', '0', '0', '0');

SET FOREIGN_KEY_CHECKS = 1;
