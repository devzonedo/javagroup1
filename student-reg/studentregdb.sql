/*
SQLyog Ultimate v8.55 
MySQL - 5.5.5-10.5.8-MariaDB : Database - studentregdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`studentregdb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `studentregdb`;

/*Table structure for table `tbl_student` */

DROP TABLE IF EXISTS `tbl_student`;

CREATE TABLE `tbl_student` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `fname` varchar(20) DEFAULT NULL,
  `lname` varchar(20) DEFAULT NULL,
  `gender` varchar(5) DEFAULT NULL,
  `tp` varchar(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `nic` varchar(12) DEFAULT NULL,
  `subject_id` int(5) DEFAULT NULL,
  `created_user` int(5) DEFAULT NULL,
  `created_datetime` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_user` int(5) DEFAULT NULL,
  `updated_datetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_student` */

insert  into `tbl_student`(`id`,`fname`,`lname`,`gender`,`tp`,`address`,`city`,`nic`,`subject_id`,`created_user`,`created_datetime`,`updated_user`,`updated_datetime`) values (2,'Geetha','Kumara','F','8885566','Colombo','Nygegoda','77888555',1,NULL,'2021-10-18 19:59:05',NULL,'0000-00-00 00:00:00'),(3,'Samanthi','Guruge','F','085555','Seeee','Negombo','555888',2,NULL,'2021-10-25 19:31:17',NULL,'0000-00-00 00:00:00'),(4,'Shanaka','Fernan','M','5555444','Sdsdsdsd','asdasdsadasd','886665',3,NULL,'2021-10-25 19:33:38',NULL,'0000-00-00 00:00:00');

/*Table structure for table `tbl_subject` */

DROP TABLE IF EXISTS `tbl_subject`;

CREATE TABLE `tbl_subject` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `subject_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_subject` */

insert  into `tbl_subject`(`id`,`subject_name`) values (1,'Maths'),(2,'Sinhala'),(4,'English');

/*Table structure for table `tbl_user` */

DROP TABLE IF EXISTS `tbl_user`;

CREATE TABLE `tbl_user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `nic` varchar(12) DEFAULT NULL,
  `pword` text DEFAULT NULL,
  `user_role` varchar(10) DEFAULT NULL,
  `student_id` int(5) DEFAULT NULL,
  `created_user` int(5) DEFAULT NULL,
  `created_datetime` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_user` int(5) DEFAULT NULL,
  `updated_datetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_user` */

insert  into `tbl_user`(`id`,`nic`,`pword`,`user_role`,`student_id`,`created_user`,`created_datetime`,`updated_user`,`updated_datetime`) values (1,'8899','*77A6A45E872F380DBAAA2F2DEBFC6BFF42669AA0','ADMIN',0,NULL,'2021-10-25 19:31:17',NULL,'0000-00-00 00:00:00'),(2,'886665','*265C6716FE1C47A0789B8CD23405011C85E4F260','STUDENT',4,NULL,'2021-10-25 19:33:38',NULL,'0000-00-00 00:00:00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
