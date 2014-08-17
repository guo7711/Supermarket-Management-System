# MySQL-Front 5.1  (Build 2.7)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: localhost    Database: ssms
# ------------------------------------------------------
# Server version 5.4.3-beta-community

DROP DATABASE IF EXISTS `ssms`;
CREATE DATABASE `ssms` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ssms`;

#
# Source for table buyer
#

DROP TABLE IF EXISTS `buyer`;
CREATE TABLE `buyer` (
  `GoodsId` varchar(20) NOT NULL DEFAULT '',
  `Count` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`GoodsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table buyer
#
LOCK TABLES `buyer` WRITE;
/*!40000 ALTER TABLE `buyer` DISABLE KEYS */;

INSERT INTO `buyer` VALUES ('1',42);
INSERT INTO `buyer` VALUES ('2',88);
/*!40000 ALTER TABLE `buyer` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table goodsinfo
#

DROP TABLE IF EXISTS `goodsinfo`;
CREATE TABLE `goodsinfo` (
  `GoodsId` varchar(20) NOT NULL DEFAULT '',
  `Name` varchar(20) DEFAULT NULL,
  `Type` varchar(20) DEFAULT NULL,
  `StockPrice` varchar(20) DEFAULT NULL,
  `SellPrice` varchar(20) DEFAULT NULL,
  `Sponsor` varchar(20) DEFAULT NULL,
  `Count` int(11) DEFAULT NULL,
  PRIMARY KEY (`GoodsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table goodsinfo
#
LOCK TABLES `goodsinfo` WRITE;
/*!40000 ALTER TABLE `goodsinfo` DISABLE KEYS */;

INSERT INTO `goodsinfo` VALUES ('1','apple','水果','1','2','a',44);
INSERT INTO `goodsinfo` VALUES ('2','pear','水果','1','2','郑佳玉',88);
/*!40000 ALTER TABLE `goodsinfo` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table sellinfo
#

DROP TABLE IF EXISTS `sellinfo`;
CREATE TABLE `sellinfo` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `GoodsID` varchar(20) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Count` int(11) DEFAULT NULL,
  `UserId` varchar(20) DEFAULT NULL,
  `SellPrice` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table sellinfo
#
LOCK TABLES `sellinfo` WRITE;
/*!40000 ALTER TABLE `sellinfo` DISABLE KEYS */;

/*!40000 ALTER TABLE `sellinfo` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table userinfo
#

DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `UserId` varchar(20) NOT NULL DEFAULT '',
  `UserName` varchar(20) DEFAULT NULL,
  `Privilege` int(11) DEFAULT NULL,
  `PassWord` varchar(20) DEFAULT NULL,
  `TelNumber` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table userinfo
#
LOCK TABLES `userinfo` WRITE;
/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;

INSERT INTO `userinfo` VALUES ('1','1',1,'1','1');
INSERT INTO `userinfo` VALUES ('2','2',2,'2','2');
INSERT INTO `userinfo` VALUES ('3','3',3,'3','3');
INSERT INTO `userinfo` VALUES ('4','4',4,'4','4');
/*!40000 ALTER TABLE `userinfo` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
