-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm89e6v
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssm89e6v/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssm89e6v/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm89e6v/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diaokexinxi`
--

DROP TABLE IF EXISTS `diaokexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diaokexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `shenqingneirong` longtext COMMENT '申请内容',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831452836 DEFAULT CHARSET=utf8 COMMENT='调课信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diaokexinxi`
--

LOCK TABLES `diaokexinxi` WRITE;
/*!40000 ALTER TABLE `diaokexinxi` DISABLE KEYS */;
INSERT INTO `diaokexinxi` VALUES (51,'2021-01-05 07:15:29','名称1','账号1','调课','申请内容1','2021-01-05','工号1','教师姓名1','否',''),(52,'2021-01-05 07:15:29','名称2','账号2','调课','申请内容2','2021-01-05','工号2','教师姓名2','否',''),(53,'2021-01-05 07:15:29','名称3','账号3','调课','申请内容3','2021-01-05','工号3','教师姓名3','否',''),(54,'2021-01-05 07:15:29','名称4','账号4','调课','申请内容4','2021-01-05','工号4','教师姓名4','否',''),(55,'2021-01-05 07:15:29','名称5','账号5','调课','申请内容5','2021-01-05','工号5','教师姓名5','否',''),(56,'2021-01-05 07:15:29','名称6','账号6','调课','申请内容6','2021-01-05','工号6','教师姓名6','否',''),(1609831452835,'2021-01-05 07:24:12','物理课程','001','调课','由于今天有事，要调下课程，改为28号','2020-12-27','001','王老师','是','同意调课');
/*!40000 ALTER TABLE `diaokexinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831764316 DEFAULT CHARSET=utf8 COMMENT='论坛表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (171,'2021-01-05 07:15:30','帖子标题1','帖子内容1',1,1,'用户名1','开放'),(172,'2021-01-05 07:15:30','帖子标题2','帖子内容2',2,2,'用户名2','开放'),(173,'2021-01-05 07:15:30','帖子标题3','帖子内容3',3,3,'用户名3','开放'),(174,'2021-01-05 07:15:30','帖子标题4','帖子内容4',4,4,'用户名4','开放'),(175,'2021-01-05 07:15:30','帖子标题5','帖子内容5',5,5,'用户名5','开放'),(176,'2021-01-05 07:15:30','帖子标题6','帖子内容6',6,6,'用户名6','开放'),(1609831728997,'2021-01-05 07:28:48','XX题目','<p>这里可以发布疑问或者信息可以进行交流，管理员对所有信息都有权限操作，这里可以查看发布的信息，如果有不良言论那些就可以进行删除</p>',0,1609831139739,'1','开放'),(1609831764315,'2021-01-05 07:29:23',NULL,'你这个是这样这样子 的',1609831728997,21,'001',NULL);
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huankaoshenqing`
--

DROP TABLE IF EXISTS `huankaoshenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huankaoshenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengmingcheng` varchar(200) NOT NULL COMMENT '课程名称',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `neirong` longtext COMMENT '内容',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831700546 DEFAULT CHARSET=utf8 COMMENT='缓考申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huankaoshenqing`
--

LOCK TABLES `huankaoshenqing` WRITE;
/*!40000 ALTER TABLE `huankaoshenqing` DISABLE KEYS */;
INSERT INTO `huankaoshenqing` VALUES (141,'2021-01-05 07:15:29','课程名称1','请假','账号1','内容1','2021-01-05','学号1','姓名1','否',''),(142,'2021-01-05 07:15:29','课程名称2','请假','账号2','内容2','2021-01-05','学号2','姓名2','否',''),(143,'2021-01-05 07:15:29','课程名称3','请假','账号3','内容3','2021-01-05','学号3','姓名3','否',''),(144,'2021-01-05 07:15:29','课程名称4','请假','账号4','内容4','2021-01-05','学号4','姓名4','否',''),(145,'2021-01-05 07:15:29','课程名称5','请假','账号5','内容5','2021-01-05','学号5','姓名5','否',''),(146,'2021-01-05 07:15:29','课程名称6','请假','账号6','内容6','2021-01-05','学号6','姓名6','否',''),(1609831700545,'2021-01-05 07:28:20','物理课程考核','缓考','001','<p>今天考试不了，申请迟一点考试</p>','2020-12-27','1','刘倩','是','同意缓考');
/*!40000 ALTER TABLE `huankaoshenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huanxiuxinxi`
--

DROP TABLE IF EXISTS `huanxiuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huanxiuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `shenqingliyou` longtext COMMENT '申请理由',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831616103 DEFAULT CHARSET=utf8 COMMENT='缓修信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huanxiuxinxi`
--

LOCK TABLES `huanxiuxinxi` WRITE;
/*!40000 ALTER TABLE `huanxiuxinxi` DISABLE KEYS */;
INSERT INTO `huanxiuxinxi` VALUES (61,'2021-01-05 07:15:29','名称1','账号1','请假','申请理由1','2021-01-05','学号1','姓名1','否',''),(62,'2021-01-05 07:15:29','名称2','账号2','请假','申请理由2','2021-01-05','学号2','姓名2','否',''),(63,'2021-01-05 07:15:29','名称3','账号3','请假','申请理由3','2021-01-05','学号3','姓名3','否',''),(64,'2021-01-05 07:15:29','名称4','账号4','请假','申请理由4','2021-01-05','学号4','姓名4','否',''),(65,'2021-01-05 07:15:29','名称5','账号5','请假','申请理由5','2021-01-05','学号5','姓名5','否',''),(66,'2021-01-05 07:15:29','名称6','账号6','请假','申请理由6','2021-01-05','学号6','姓名6','否',''),(1609831616102,'2021-01-05 07:26:55','物理课程安排','001','请假','<p>由于今天有事，申请请假一天</p>','2020-12-27','1','刘倩','是','同意缓修');
/*!40000 ALTER TABLE `huanxiuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshi`
--

DROP TABLE IF EXISTS `jiaoshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) NOT NULL COMMENT '工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `kemu` varchar(200) DEFAULT NULL COMMENT '科目',
  `dianhua` varchar(200) DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gonghao` (`gonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='教师';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshi`
--

LOCK TABLES `jiaoshi` WRITE;
/*!40000 ALTER TABLE `jiaoshi` DISABLE KEYS */;
INSERT INTO `jiaoshi` VALUES (21,'2021-01-05 07:15:29','001','001','王老师','男','http://localhost:8080/ssm89e6v/upload/jiaoshi_touxiang1.jpg','上海大学','物理','13823888881'),(22,'2021-01-05 07:15:29','教师2','123456','教师姓名2','男','http://localhost:8080/ssm89e6v/upload/jiaoshi_touxiang2.jpg','学院2','科目2','13823888882'),(23,'2021-01-05 07:15:29','教师3','123456','教师姓名3','男','http://localhost:8080/ssm89e6v/upload/jiaoshi_touxiang3.jpg','学院3','科目3','13823888883'),(24,'2021-01-05 07:15:29','教师4','123456','教师姓名4','男','http://localhost:8080/ssm89e6v/upload/jiaoshi_touxiang4.jpg','学院4','科目4','13823888884'),(25,'2021-01-05 07:15:29','教师5','123456','教师姓名5','男','http://localhost:8080/ssm89e6v/upload/jiaoshi_touxiang5.jpg','学院5','科目5','13823888885'),(26,'2021-01-05 07:15:29','教师6','123456','教师姓名6','男','http://localhost:8080/ssm89e6v/upload/jiaoshi_touxiang6.jpg','学院6','科目6','13823888886');
/*!40000 ALTER TABLE `jiaoshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaowurenyuan`
--

DROP TABLE IF EXISTS `jiaowurenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaowurenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `dianhua` varchar(200) DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='教务人员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaowurenyuan`
--

LOCK TABLES `jiaowurenyuan` WRITE;
/*!40000 ALTER TABLE `jiaowurenyuan` DISABLE KEYS */;
INSERT INTO `jiaowurenyuan` VALUES (31,'2021-01-05 07:15:29','001','001','王飞','男','http://localhost:8080/ssm89e6v/upload/jiaowurenyuan_touxiang1.jpg','上海大学','13823888881'),(32,'2021-01-05 07:15:29','教务人员2','123456','姓名2','男','http://localhost:8080/ssm89e6v/upload/jiaowurenyuan_touxiang2.jpg','学院2','13823888882'),(33,'2021-01-05 07:15:29','教务人员3','123456','姓名3','男','http://localhost:8080/ssm89e6v/upload/jiaowurenyuan_touxiang3.jpg','学院3','13823888883'),(34,'2021-01-05 07:15:29','教务人员4','123456','姓名4','男','http://localhost:8080/ssm89e6v/upload/jiaowurenyuan_touxiang4.jpg','学院4','13823888884'),(35,'2021-01-05 07:15:29','教务人员5','123456','姓名5','男','http://localhost:8080/ssm89e6v/upload/jiaowurenyuan_touxiang5.jpg','学院5','13823888885'),(36,'2021-01-05 07:15:29','教务人员6','123456','姓名6','男','http://localhost:8080/ssm89e6v/upload/jiaowurenyuan_touxiang6.jpg','学院6','13823888886');
/*!40000 ALTER TABLE `jiaowurenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaohejilu`
--

DROP TABLE IF EXISTS `kaohejilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaohejilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengmingcheng` varchar(200) NOT NULL COMMENT '课程名称',
  `jiankongzhaopian` varchar(200) DEFAULT NULL COMMENT '监控照片',
  `shipin` varchar(200) DEFAULT NULL COMMENT '视频',
  `riqi` datetime DEFAULT NULL COMMENT '日期',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831956001 DEFAULT CHARSET=utf8 COMMENT='考核记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaohejilu`
--

LOCK TABLES `kaohejilu` WRITE;
/*!40000 ALTER TABLE `kaohejilu` DISABLE KEYS */;
INSERT INTO `kaohejilu` VALUES (121,'2021-01-05 07:15:29','课程名称1','http://localhost:8080/ssm89e6v/upload/kaohejilu_jiankongzhaopian1.jpg','','2021-01-05 15:15:29','工号1','教师姓名1'),(122,'2021-01-05 07:15:29','课程名称2','http://localhost:8080/ssm89e6v/upload/kaohejilu_jiankongzhaopian2.jpg','','2021-01-05 15:15:29','工号2','教师姓名2'),(123,'2021-01-05 07:15:29','课程名称3','http://localhost:8080/ssm89e6v/upload/kaohejilu_jiankongzhaopian3.jpg','','2021-01-05 15:15:29','工号3','教师姓名3'),(124,'2021-01-05 07:15:29','课程名称4','http://localhost:8080/ssm89e6v/upload/kaohejilu_jiankongzhaopian4.jpg','','2021-01-05 15:15:29','工号4','教师姓名4'),(125,'2021-01-05 07:15:29','课程名称5','http://localhost:8080/ssm89e6v/upload/kaohejilu_jiankongzhaopian5.jpg','','2021-01-05 15:15:29','工号5','教师姓名5'),(126,'2021-01-05 07:15:29','课程名称6','http://localhost:8080/ssm89e6v/upload/kaohejilu_jiankongzhaopian6.jpg','','2021-01-05 15:15:29','工号6','教师姓名6'),(1609831956000,'2021-01-05 07:32:35','物理考核记录','http://localhost:8080/ssm89e6v/upload/1609831938586.jpg','http://localhost:8080/ssm89e6v/upload/1609831953285.mp4','2020-12-27 00:00:00','001','王老师');
/*!40000 ALTER TABLE `kaohejilu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaoshitongji`
--

DROP TABLE IF EXISTS `kaoshitongji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaoshitongji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengmingcheng` varchar(200) NOT NULL COMMENT '课程名称',
  `zongrenshu` int(11) DEFAULT NULL COMMENT '总人数',
  `qingjiarenshu` int(11) DEFAULT NULL COMMENT '请假人数',
  `huankaorenshu` int(11) DEFAULT NULL COMMENT '缓考人数',
  `kuangkaorenshu` int(11) DEFAULT NULL COMMENT '旷考人数',
  `kaoshirenshu` int(11) DEFAULT NULL COMMENT '考试人数',
  `tongjiriqi` date DEFAULT NULL COMMENT '统计日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='考试统计';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaoshitongji`
--

LOCK TABLES `kaoshitongji` WRITE;
/*!40000 ALTER TABLE `kaoshitongji` DISABLE KEYS */;
INSERT INTO `kaoshitongji` VALUES (161,'2021-01-05 07:15:30','物理考试',50,1,1,1,47,'2020-12-27'),(162,'2021-01-05 07:15:30','课程名称2',2,2,2,2,2,'2021-01-05'),(163,'2021-01-05 07:15:30','课程名称3',3,3,3,3,3,'2021-01-05'),(164,'2021-01-05 07:15:30','课程名称4',4,4,4,4,4,'2021-01-05'),(165,'2021-01-05 07:15:30','课程名称5',5,5,5,5,5,'2021-01-05'),(166,'2021-01-05 07:15:30','课程名称6',6,6,6,6,6,'2021-01-05');
/*!40000 ALTER TABLE `kaoshitongji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kebiaoxinxi`
--

DROP TABLE IF EXISTS `kebiaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kebiaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `kebiaowenjian` varchar(200) DEFAULT NULL COMMENT '课表文件',
  `neirong` longtext COMMENT '内容',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831357092 DEFAULT CHARSET=utf8 COMMENT='课表信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kebiaoxinxi`
--

LOCK TABLES `kebiaoxinxi` WRITE;
/*!40000 ALTER TABLE `kebiaoxinxi` DISABLE KEYS */;
INSERT INTO `kebiaoxinxi` VALUES (41,'2021-01-05 07:15:29','名称1','http://localhost:8080/ssm89e6v/upload/kebiaoxinxi_tupian1.jpg','','内容1','2021-01-05','账号1','姓名1'),(42,'2021-01-05 07:15:29','名称2','http://localhost:8080/ssm89e6v/upload/kebiaoxinxi_tupian2.jpg','','内容2','2021-01-05','账号2','姓名2'),(43,'2021-01-05 07:15:29','名称3','http://localhost:8080/ssm89e6v/upload/kebiaoxinxi_tupian3.jpg','','内容3','2021-01-05','账号3','姓名3'),(44,'2021-01-05 07:15:29','名称4','http://localhost:8080/ssm89e6v/upload/kebiaoxinxi_tupian4.jpg','','内容4','2021-01-05','账号4','姓名4'),(45,'2021-01-05 07:15:29','名称5','http://localhost:8080/ssm89e6v/upload/kebiaoxinxi_tupian5.jpg','','内容5','2021-01-05','账号5','姓名5'),(46,'2021-01-05 07:15:29','名称6','http://localhost:8080/ssm89e6v/upload/kebiaoxinxi_tupian6.jpg','','内容6','2021-01-05','账号6','姓名6'),(1609831357091,'2021-01-05 07:22:36','物理课程安排','http://localhost:8080/ssm89e6v/upload/1609831312758.jpg','http://localhost:8080/ssm89e6v/upload/1609831324061.doc','课程内容安排已文件的形式发布给学生跟教师可以下载查看，内容是用于测试的，可以自行添加修改删除','2020-12-27','001','王飞');
/*!40000 ALTER TABLE `kebiaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kechengkaohe`
--

DROP TABLE IF EXISTS `kechengkaohe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kechengkaohe` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengmingcheng` varchar(200) NOT NULL COMMENT '课程名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `kaoheshijian` datetime DEFAULT NULL COMMENT '考核时间',
  `kaoheneirong` longtext COMMENT '考核内容',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831398707 DEFAULT CHARSET=utf8 COMMENT='课程考核';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kechengkaohe`
--

LOCK TABLES `kechengkaohe` WRITE;
/*!40000 ALTER TABLE `kechengkaohe` DISABLE KEYS */;
INSERT INTO `kechengkaohe` VALUES (131,'2021-01-05 07:15:29','课程名称1','http://localhost:8080/ssm89e6v/upload/kechengkaohe_tupian1.jpg','2021-01-05 15:15:29','考核内容1','账号1','姓名1'),(132,'2021-01-05 07:15:29','课程名称2','http://localhost:8080/ssm89e6v/upload/kechengkaohe_tupian2.jpg','2021-01-05 15:15:29','考核内容2','账号2','姓名2'),(133,'2021-01-05 07:15:29','课程名称3','http://localhost:8080/ssm89e6v/upload/kechengkaohe_tupian3.jpg','2021-01-05 15:15:29','考核内容3','账号3','姓名3'),(134,'2021-01-05 07:15:29','课程名称4','http://localhost:8080/ssm89e6v/upload/kechengkaohe_tupian4.jpg','2021-01-05 15:15:29','考核内容4','账号4','姓名4'),(135,'2021-01-05 07:15:29','课程名称5','http://localhost:8080/ssm89e6v/upload/kechengkaohe_tupian5.jpg','2021-01-05 15:15:29','考核内容5','账号5','姓名5'),(136,'2021-01-05 07:15:29','课程名称6','http://localhost:8080/ssm89e6v/upload/kechengkaohe_tupian6.jpg','2021-01-05 15:15:29','考核内容6','账号6','姓名6'),(1609831398706,'2021-01-05 07:23:18','物理课程考核','http://localhost:8080/ssm89e6v/upload/1609831383297.jpg','2020-12-27 03:00:00','物理考核，时间是27号','001','王飞');
/*!40000 ALTER TABLE `kechengkaohe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kechengtongji`
--

DROP TABLE IF EXISTS `kechengtongji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kechengtongji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kechengmingcheng` varchar(200) NOT NULL COMMENT '课程名称',
  `zongrenshu` int(11) DEFAULT NULL COMMENT '总人数',
  `qingjiarenshu` int(11) DEFAULT NULL COMMENT '请假人数',
  `kuangkerenshu` int(11) DEFAULT NULL COMMENT '旷课人数',
  `huanxiurenshu` int(11) DEFAULT NULL COMMENT '缓修人数',
  `shangkerenshu` int(11) DEFAULT NULL COMMENT '上课人数',
  `tongjiriqi` date DEFAULT NULL COMMENT '统计日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='课程统计';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kechengtongji`
--

LOCK TABLES `kechengtongji` WRITE;
/*!40000 ALTER TABLE `kechengtongji` DISABLE KEYS */;
INSERT INTO `kechengtongji` VALUES (151,'2021-01-05 07:15:30','物理课程',50,2,0,0,48,'2020-12-27'),(152,'2021-01-05 07:15:30','课程名称2',2,2,2,2,2,'2021-01-05'),(153,'2021-01-05 07:15:30','课程名称3',3,3,3,3,3,'2021-01-05'),(154,'2021-01-05 07:15:30','课程名称4',4,4,4,4,4,'2021-01-05'),(155,'2021-01-05 07:15:30','课程名称5',5,5,5,5,5,'2021-01-05'),(156,'2021-01-05 07:15:30','课程名称6',6,6,6,6,6,'2021-01-05');
/*!40000 ALTER TABLE `kechengtongji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ketangjilu`
--

DROP TABLE IF EXISTS `ketangjilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ketangjilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kemumingcheng` varchar(200) NOT NULL COMMENT '科目名称',
  `xueshengrenshu` varchar(200) DEFAULT NULL COMMENT '学生人数',
  `quekeyuanyin` longtext COMMENT '缺课原因',
  `zuoyebuzhi` longtext COMMENT '作业布置',
  `shiyinpinlianjie` varchar(200) DEFAULT NULL COMMENT '视音频链接',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831909145 DEFAULT CHARSET=utf8 COMMENT='课堂记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ketangjilu`
--

LOCK TABLES `ketangjilu` WRITE;
/*!40000 ALTER TABLE `ketangjilu` DISABLE KEYS */;
INSERT INTO `ketangjilu` VALUES (91,'2021-01-05 07:15:29','科目名称1','学生人数1','缺课原因1','作业布置1','视音频链接1','2021-01-05','工号1','教师姓名1'),(92,'2021-01-05 07:15:29','科目名称2','学生人数2','缺课原因2','作业布置2','视音频链接2','2021-01-05','工号2','教师姓名2'),(93,'2021-01-05 07:15:29','科目名称3','学生人数3','缺课原因3','作业布置3','视音频链接3','2021-01-05','工号3','教师姓名3'),(94,'2021-01-05 07:15:29','科目名称4','学生人数4','缺课原因4','作业布置4','视音频链接4','2021-01-05','工号4','教师姓名4'),(95,'2021-01-05 07:15:29','科目名称5','学生人数5','缺课原因5','作业布置5','视音频链接5','2021-01-05','工号5','教师姓名5'),(96,'2021-01-05 07:15:29','科目名称6','学生人数6','缺课原因6','作业布置6','视音频链接6','2021-01-05','工号6','教师姓名6'),(1609831909144,'2021-01-05 07:31:48','物理课堂','48','今天又两位学生请假了','已经安排物理作业','www.baidu.com','2020-12-27','001','王老师');
/*!40000 ALTER TABLE `ketangjilu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ketangqiandao`
--

DROP TABLE IF EXISTS `ketangqiandao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ketangqiandao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kemumingcheng` varchar(200) DEFAULT NULL COMMENT '科目名称',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `qiandaoshijian` datetime DEFAULT NULL COMMENT '签到时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831637719 DEFAULT CHARSET=utf8 COMMENT='课堂签到';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ketangqiandao`
--

LOCK TABLES `ketangqiandao` WRITE;
/*!40000 ALTER TABLE `ketangqiandao` DISABLE KEYS */;
INSERT INTO `ketangqiandao` VALUES (81,'2021-01-05 07:15:29','科目名称1','工号1','2021-01-05 15:15:29','学号1','姓名1'),(82,'2021-01-05 07:15:29','科目名称2','工号2','2021-01-05 15:15:29','学号2','姓名2'),(83,'2021-01-05 07:15:29','科目名称3','工号3','2021-01-05 15:15:29','学号3','姓名3'),(84,'2021-01-05 07:15:29','科目名称4','工号4','2021-01-05 15:15:29','学号4','姓名4'),(85,'2021-01-05 07:15:29','科目名称5','工号5','2021-01-05 15:15:29','学号5','姓名5'),(86,'2021-01-05 07:15:29','科目名称6','工号6','2021-01-05 15:15:29','学号6','姓名6'),(1609831637718,'2021-01-05 07:27:17','物理讲课','001','2020-12-27 07:00:00','1','刘倩');
/*!40000 ALTER TABLE `ketangqiandao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ketangxinxi`
--

DROP TABLE IF EXISTS `ketangxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ketangxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kemumingcheng` varchar(200) NOT NULL COMMENT '科目名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `shizhang` varchar(200) DEFAULT NULL COMMENT '时长',
  `renshu` int(11) DEFAULT NULL COMMENT '人数',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `shangkeshijian` varchar(200) DEFAULT NULL COMMENT '上课时间',
  `shipinlianjie` varchar(200) DEFAULT NULL COMMENT '视频连接',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831496767 DEFAULT CHARSET=utf8 COMMENT='课堂信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ketangxinxi`
--

LOCK TABLES `ketangxinxi` WRITE;
/*!40000 ALTER TABLE `ketangxinxi` DISABLE KEYS */;
INSERT INTO `ketangxinxi` VALUES (71,'2021-01-05 07:15:29','科目名称1','http://localhost:8080/ssm89e6v/upload/ketangxinxi_tupian1.jpg','时长1',1,'2021-01-05','上课时间1','视频连接1','工号1','教师姓名1'),(72,'2021-01-05 07:15:29','科目名称2','http://localhost:8080/ssm89e6v/upload/ketangxinxi_tupian2.jpg','时长2',2,'2021-01-05','上课时间2','视频连接2','工号2','教师姓名2'),(73,'2021-01-05 07:15:29','科目名称3','http://localhost:8080/ssm89e6v/upload/ketangxinxi_tupian3.jpg','时长3',3,'2021-01-05','上课时间3','视频连接3','工号3','教师姓名3'),(74,'2021-01-05 07:15:29','科目名称4','http://localhost:8080/ssm89e6v/upload/ketangxinxi_tupian4.jpg','时长4',4,'2021-01-05','上课时间4','视频连接4','工号4','教师姓名4'),(75,'2021-01-05 07:15:29','科目名称5','http://localhost:8080/ssm89e6v/upload/ketangxinxi_tupian5.jpg','时长5',5,'2021-01-05','上课时间5','视频连接5','工号5','教师姓名5'),(76,'2021-01-05 07:15:29','科目名称6','http://localhost:8080/ssm89e6v/upload/ketangxinxi_tupian6.jpg','时长6',6,'2021-01-05','上课时间6','视频连接6','工号6','教师姓名6'),(1609831496766,'2021-01-05 07:24:55','物理讲课','http://localhost:8080/ssm89e6v/upload/1609831471073.jpg','45分钟',50,'2020-12-27','8点开始','www.baidu,com','001','王老师');
/*!40000 ALTER TABLE `ketangxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','yla1av1kgc1idzr0u6tqzwp2fregakpc','2021-01-05 07:18:04','2021-01-05 08:34:26'),(2,11,'001','xuesheng','学生','etb9eo7u8zz7pwawbnqkt6ue6mcqssst','2021-01-05 07:18:21','2021-01-05 08:19:38'),(3,31,'001','jiaowurenyuan','教务人员','54ykd00wl49srwzqfd2b7b7jx33i3lwf','2021-01-05 07:21:03','2021-01-05 08:32:49'),(4,21,'001','jiaoshi','教师','v6ehc0lw89tont5jchten6dy10uvjrhy','2021-01-05 07:23:26','2021-01-05 08:31:09'),(5,1609831139739,'1','xuesheng','学生','99z5kzz42b4ewei3ovy946jfssc7sjpi','2021-01-05 07:25:59','2021-01-05 08:34:11');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-01-05 07:15:30');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `yuanxi` varchar(200) DEFAULT NULL COMMENT '院系',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831139740 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (11,'2021-01-05 07:15:29','001','001','姓名1','男','http://localhost:8080/ssm89e6v/upload/xuesheng_touxiang1.jpg','院系1','班级1','13823888881'),(12,'2021-01-05 07:15:29','学生2','123456','姓名2','男','http://localhost:8080/ssm89e6v/upload/xuesheng_touxiang2.jpg','院系2','班级2','13823888882'),(13,'2021-01-05 07:15:29','学生3','123456','姓名3','男','http://localhost:8080/ssm89e6v/upload/xuesheng_touxiang3.jpg','院系3','班级3','13823888883'),(14,'2021-01-05 07:15:29','学生4','123456','姓名4','男','http://localhost:8080/ssm89e6v/upload/xuesheng_touxiang4.jpg','院系4','班级4','13823888884'),(15,'2021-01-05 07:15:29','学生5','123456','姓名5','男','http://localhost:8080/ssm89e6v/upload/xuesheng_touxiang5.jpg','院系5','班级5','13823888885'),(16,'2021-01-05 07:15:29','学生6','123456','姓名6','男','http://localhost:8080/ssm89e6v/upload/xuesheng_touxiang6.jpg','院系6','班级6','13823888886'),(1609831139739,'2021-01-05 07:18:59','1','1','刘倩','女','http://localhost:8080/ssm89e6v/upload/1609831570037.png','上海大学','201','15214121412');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zuoyetijiao`
--

DROP TABLE IF EXISTS `zuoyetijiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zuoyetijiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kemumingcheng` varchar(200) NOT NULL COMMENT '科目名称',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `zuoyefujian` varchar(200) DEFAULT NULL COMMENT '作业附件',
  `tijiaoriqi` date DEFAULT NULL COMMENT '提交日期',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831673703 DEFAULT CHARSET=utf8 COMMENT='作业提交';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zuoyetijiao`
--

LOCK TABLES `zuoyetijiao` WRITE;
/*!40000 ALTER TABLE `zuoyetijiao` DISABLE KEYS */;
INSERT INTO `zuoyetijiao` VALUES (111,'2021-01-05 07:15:29','科目名称1','工号1','','2021-01-05','学号1','姓名1'),(112,'2021-01-05 07:15:29','科目名称2','工号2','','2021-01-05','学号2','姓名2'),(113,'2021-01-05 07:15:29','科目名称3','工号3','','2021-01-05','学号3','姓名3'),(114,'2021-01-05 07:15:29','科目名称4','工号4','','2021-01-05','学号4','姓名4'),(115,'2021-01-05 07:15:29','科目名称5','工号5','','2021-01-05','学号5','姓名5'),(116,'2021-01-05 07:15:29','科目名称6','工号6','','2021-01-05','学号6','姓名6'),(1609831673702,'2021-01-05 07:27:53','物理作业','001','http://localhost:8080/ssm89e6v/upload/1609831659643.doc','2020-12-27','1','刘倩');
/*!40000 ALTER TABLE `zuoyetijiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zuoyexinxi`
--

DROP TABLE IF EXISTS `zuoyexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zuoyexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kemumingcheng` varchar(200) NOT NULL COMMENT '科目名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `zuoyewenjian` varchar(200) DEFAULT NULL COMMENT '作业文件',
  `jianshu` longtext COMMENT '简述',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609831545640 DEFAULT CHARSET=utf8 COMMENT='作业信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zuoyexinxi`
--

LOCK TABLES `zuoyexinxi` WRITE;
/*!40000 ALTER TABLE `zuoyexinxi` DISABLE KEYS */;
INSERT INTO `zuoyexinxi` VALUES (101,'2021-01-05 07:15:29','科目名称1','http://localhost:8080/ssm89e6v/upload/zuoyexinxi_tupian1.jpg','','简述1','2021-01-05','工号1','教师姓名1'),(102,'2021-01-05 07:15:29','科目名称2','http://localhost:8080/ssm89e6v/upload/zuoyexinxi_tupian2.jpg','','简述2','2021-01-05','工号2','教师姓名2'),(103,'2021-01-05 07:15:29','科目名称3','http://localhost:8080/ssm89e6v/upload/zuoyexinxi_tupian3.jpg','','简述3','2021-01-05','工号3','教师姓名3'),(104,'2021-01-05 07:15:29','科目名称4','http://localhost:8080/ssm89e6v/upload/zuoyexinxi_tupian4.jpg','','简述4','2021-01-05','工号4','教师姓名4'),(105,'2021-01-05 07:15:29','科目名称5','http://localhost:8080/ssm89e6v/upload/zuoyexinxi_tupian5.jpg','','简述5','2021-01-05','工号5','教师姓名5'),(106,'2021-01-05 07:15:29','科目名称6','http://localhost:8080/ssm89e6v/upload/zuoyexinxi_tupian6.jpg','','简述6','2021-01-05','工号6','教师姓名6'),(1609831545639,'2021-01-05 07:25:45','物理作业','http://localhost:8080/ssm89e6v/upload/1609831512900.jpg','http://localhost:8080/ssm89e6v/upload/1609831519040.doc','这里是物理作业同学下载之后进行操作然后提交给我','2020-12-28','001','王老师');
/*!40000 ALTER TABLE `zuoyexinxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-07 11:35:05
