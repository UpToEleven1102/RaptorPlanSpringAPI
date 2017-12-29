-- MySQL dump 10.16  Distrib 10.1.28-MariaDB, for Win32 (AMD64)
--
-- Host: sql3.freesqldatabase.com    Database: sql3212024
-- ------------------------------------------------------
-- Server version	5.5.54-0ubuntu0.12.04.1

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
-- Table structure for table `h_api_course_attribute`
--

DROP TABLE IF EXISTS `h_api_course_attribute`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_api_course_attribute` (
  `course_id` bigint(20) NOT NULL,
  `attribute_id` bigint(20) NOT NULL,
  KEY `FKqcqygw1f2g8qvkgybno0c9dy9` (`attribute_id`),
  KEY `FK7dy8co8xmf8u27xwv0khqgs6y` (`course_id`),
  CONSTRAINT `FK7dy8co8xmf8u27xwv0khqgs6y` FOREIGN KEY (`course_id`) REFERENCES `h_courses` (`id`),
  CONSTRAINT `FKqcqygw1f2g8qvkgybno0c9dy9` FOREIGN KEY (`attribute_id`) REFERENCES `h_attributes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_api_course_attribute`
--

LOCK TABLES `h_api_course_attribute` WRITE;
/*!40000 ALTER TABLE `h_api_course_attribute` DISABLE KEYS */;
INSERT INTO `h_api_course_attribute` VALUES (17,9),(18,9);
/*!40000 ALTER TABLE `h_api_course_attribute` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_attributes`
--

DROP TABLE IF EXISTS `h_attributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_attributes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_tf2qhm819mo3ev8onesbltcvk` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_attributes`
--

LOCK TABLES `h_attributes` WRITE;
/*!40000 ALTER TABLE `h_attributes` DISABLE KEYS */;
INSERT INTO `h_attributes` VALUES (1,'english_foundation','English Foundation'),(2,'math_foundation','Math Foundation'),(3,'speech_foundation','Speech Foundation'),(4,'art_distribution','Art Distribution'),(5,'behavioral_distribution','Behavioral Distribution'),(6,'humanities_distribution','Humanities Distribution'),(7,'natural_science_lab_distribution','Natural Science with Lab Distribution'),(8,'natural_science_distribution','Natural Science Distribution'),(9,'major','Major Requirement'),(10,'electives','Electives');
/*!40000 ALTER TABLE `h_attributes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_courses`
--

DROP TABLE IF EXISTS `h_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_courses` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `credit` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `discipline_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_q5o4dfrn331hndbyt7mnmv70l` (`code`),
  UNIQUE KEY `UK_e9avha43885a76huh9d0wbmwb` (`title`),
  KEY `FKadhc30agyfj7eagew1lmsv17g` (`discipline_id`),
  CONSTRAINT `FKadhc30agyfj7eagew1lmsv17g` FOREIGN KEY (`discipline_id`) REFERENCES `h_disciplines` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_courses`
--

LOCK TABLES `h_courses` WRITE;
/*!40000 ALTER TABLE `h_courses` DISABLE KEYS */;
INSERT INTO `h_courses` VALUES (17,'CMSC203',4,'Computer Science I',23),(18,'CMSC204',4,'Computer Science II',23);
/*!40000 ALTER TABLE `h_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_disciplines`
--

DROP TABLE IF EXISTS `h_disciplines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_disciplines` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_11fqtnf3x68bscrycjnj1wqk` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=90 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_disciplines`
--

LOCK TABLES `h_disciplines` WRITE;
/*!40000 ALTER TABLE `h_disciplines` DISABLE KEYS */;
INSERT INTO `h_disciplines` VALUES (1,'ACCT','Accounting'),(2,'ADS','School of Art & Design'),(3,'AHT','Allied Health'),(4,'ANTH','Anthropology'),(5,'AOSC','Meteorology'),(6,'Arabic','ARAB'),(7,'ARCH','Architectural Technology'),(8,'ART','Art/nc'),(9,'ARTT','Art'),(10,'ASLP','American Sign Language'),(11,'ASTR','Astronomy'),(12,'AUTO','Automotive Technology'),(13,'BIOL','Biological Sciences'),(14,'BIOT','Biotechnology'),(15,'BLDG','Building Trade Technology'),(16,'BSAD','Business Administration'),(17,'CCJS','Criminal Justice'),(18,'CHEM','Chemistry'),(19,'CHIN','Chinese'),(20,'CMAP','Computer Applications'),(21,'CMGT','Construction Technology'),(22,'CMP','Computers'),(23,'CMSC','Computer Science & Technology'),(24,'COED','Cooperative Education'),(25,'COMM','Communication Studies'),(26,'COS','Cosmotology/nc'),(27,'CPR','Cardio Pulmonary Resus'),(28,'CRP','Career Planning'),(29,'CYB','CyberAdvantage'),(30,'DANC','Dance'),(31,'DATA','Data Science'),(32,'ECH','Early Childhood'),(33,'ECON','Economics'),(34,'ECS','Early Childhood/Spanish'),(35,'EDUC','Education'),(36,'ENEE','Electrical Engineering'),(37,'ENES','Engineering Science'),(38,'ENGL','English'),(39,'ESL','English as Second Lang'),(40,'FILM','Film'),(41,'FIRE','Fire Science'),(42,'FLM','Film and Music'),(43,'FREN','French'),(44,'GDES','Graphic Design'),(45,'GEOG','Applied Geography'),(46,'GEOL','Geology'),(47,'GERM','German'),(48,'GHUM','Global Humanities'),(49,'GNDS','Gender Studies'),(50,'HBI','Hispanic Business'),(51,'HHS','Health and Human Service'),(52,'HIND','Hindi'),(53,'HINM','Health Information Management'),(54,'HIST','History'),(55,'HLTH','Health'),(56,'HMGT','Hospitality Management'),(57,'HOS','Hospitality'),(58,'HSCI','Health Sciences'),(59,'IDES','Interior Design'),(60,'ISTD','Interdisciplinary Studies'),(61,'ITAL','Italian'),(62,'ITI','Computers'),(63,'JAPN','Japan'),(64,'KORA','Korean'),(65,'LAN','Languages'),(66,'LATN','Latin'),(67,'LGST','Paralegal Studies'),(68,'LIBR','Library'),(69,'LING','Linguistics'),(70,'MATH','Mathematics'),(71,'MUSC','Music'),(72,'NURS','Nursing'),(73,'NUTR','Nutrition and Food'),(74,'NWIT','Network & Wireless Technology'),(75,'PHED','Physical Education'),(76,'PHIL','Philosophy'),(77,'PHOT','Photography'),(78,'PHYS','Physics'),(79,'POLI','Political Science'),(80,'PORT','Portugese'),(81,'PSYC','Psychology'),(82,'READ','Reading'),(83,'SOCY','Sociology'),(84,'SPAN','Spanish'),(85,'STBR','Study Abroad'),(86,'STSU','Student Development'),(87,'TED','Teacher Education'),(88,'WMST','Women\'s Studies'),(89,'WRT','Writing');
/*!40000 ALTER TABLE `h_disciplines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_disciplines_courses`
--

DROP TABLE IF EXISTS `h_disciplines_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_disciplines_courses` (
  `discipline_entity_id` bigint(20) NOT NULL,
  `courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_dj6ngn12cmyx1uv8isvh63ttp` (`courses_id`),
  KEY `FKotisucfmdfx78vyocgjdqfkes` (`discipline_entity_id`),
  CONSTRAINT `FKotisucfmdfx78vyocgjdqfkes` FOREIGN KEY (`discipline_entity_id`) REFERENCES `h_disciplines` (`id`),
  CONSTRAINT `FK1gvtemo8wcyoa7u6of2ykwdri` FOREIGN KEY (`courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_disciplines_courses`
--

LOCK TABLES `h_disciplines_courses` WRITE;
/*!40000 ALTER TABLE `h_disciplines_courses` DISABLE KEYS */;
INSERT INTO `h_disciplines_courses` VALUES (23,17),(23,18);
/*!40000 ALTER TABLE `h_disciplines_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates`
--

DROP TABLE IF EXISTS `h_templates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `art_credit` int(11) DEFAULT NULL,
  `behave_credit` int(11) DEFAULT NULL,
  `electives_credit` int(11) DEFAULT NULL,
  `engl_credit` int(11) DEFAULT NULL,
  `human_credit` int(11) DEFAULT NULL,
  `institutional_credit` int(11) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  `math_credit` int(11) DEFAULT NULL,
  `program_credit` int(11) DEFAULT NULL,
  `science_credit` int(11) DEFAULT NULL,
  `science_lab_credit` int(11) DEFAULT NULL,
  `speech_credit` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_w9lyud63evxmxajke4qcdp97` (`major`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates`
--

LOCK TABLES `h_templates` WRITE;
/*!40000 ALTER TABLE `h_templates` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates_art_courses`
--

DROP TABLE IF EXISTS `h_templates_art_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates_art_courses` (
  `template_entity_id` bigint(20) NOT NULL,
  `art_courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_6c520hk876venlax7mkvy9499` (`art_courses_id`),
  KEY `FK1btn36wlc6qp62bn8wdmho2q8` (`template_entity_id`),
  CONSTRAINT `FK1btn36wlc6qp62bn8wdmho2q8` FOREIGN KEY (`template_entity_id`) REFERENCES `h_templates` (`id`),
  CONSTRAINT `FKpqqde2l95ubom74otxiiuhqg3` FOREIGN KEY (`art_courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates_art_courses`
--

LOCK TABLES `h_templates_art_courses` WRITE;
/*!40000 ALTER TABLE `h_templates_art_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates_art_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates_behave_courses`
--

DROP TABLE IF EXISTS `h_templates_behave_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates_behave_courses` (
  `template_entity_id` bigint(20) NOT NULL,
  `behave_courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_7qqjs5mbjw5uooj650ydnnvy3` (`behave_courses_id`),
  KEY `FKh3m6wkj9w6gnmeu2iwv0y8hpb` (`template_entity_id`),
  CONSTRAINT `FKh3m6wkj9w6gnmeu2iwv0y8hpb` FOREIGN KEY (`template_entity_id`) REFERENCES `h_templates` (`id`),
  CONSTRAINT `FK1bvck6mfpg5m4b54iamhf0hou` FOREIGN KEY (`behave_courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates_behave_courses`
--

LOCK TABLES `h_templates_behave_courses` WRITE;
/*!40000 ALTER TABLE `h_templates_behave_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates_behave_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates_elective_courses`
--

DROP TABLE IF EXISTS `h_templates_elective_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates_elective_courses` (
  `template_entity_id` bigint(20) NOT NULL,
  `elective_courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_aw3rbq8enfdcnewmrt880gu3i` (`elective_courses_id`),
  KEY `FKq9gwsnhqwp4cjcwyoelaos6fh` (`template_entity_id`),
  CONSTRAINT `FKq9gwsnhqwp4cjcwyoelaos6fh` FOREIGN KEY (`template_entity_id`) REFERENCES `h_templates` (`id`),
  CONSTRAINT `FKqs0h6mdy8hock7qu0rd5xw7aw` FOREIGN KEY (`elective_courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates_elective_courses`
--

LOCK TABLES `h_templates_elective_courses` WRITE;
/*!40000 ALTER TABLE `h_templates_elective_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates_elective_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates_engl_courses`
--

DROP TABLE IF EXISTS `h_templates_engl_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates_engl_courses` (
  `template_entity_id` bigint(20) NOT NULL,
  `engl_courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_hu3j696q987an7at8wkn9r7fq` (`engl_courses_id`),
  KEY `FKofgx53y5lnpjwa4xrkn90k8hs` (`template_entity_id`),
  CONSTRAINT `FKofgx53y5lnpjwa4xrkn90k8hs` FOREIGN KEY (`template_entity_id`) REFERENCES `h_templates` (`id`),
  CONSTRAINT `FKs7av8w6g39wr11vt80ydco6ok` FOREIGN KEY (`engl_courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates_engl_courses`
--

LOCK TABLES `h_templates_engl_courses` WRITE;
/*!40000 ALTER TABLE `h_templates_engl_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates_engl_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates_human_courses`
--

DROP TABLE IF EXISTS `h_templates_human_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates_human_courses` (
  `template_entity_id` bigint(20) NOT NULL,
  `human_courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_i4y89inxa39kq417d5yxtirvo` (`human_courses_id`),
  KEY `FK48vhvuob252g53e37a8f5wnxw` (`template_entity_id`),
  CONSTRAINT `FK48vhvuob252g53e37a8f5wnxw` FOREIGN KEY (`template_entity_id`) REFERENCES `h_templates` (`id`),
  CONSTRAINT `FKih16ycgmh0i1n5o4urpa8nkhs` FOREIGN KEY (`human_courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates_human_courses`
--

LOCK TABLES `h_templates_human_courses` WRITE;
/*!40000 ALTER TABLE `h_templates_human_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates_human_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates_inst_attributes`
--

DROP TABLE IF EXISTS `h_templates_inst_attributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates_inst_attributes` (
  `template_entity_id` bigint(20) NOT NULL,
  `inst_attributes_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_n9am3eby9nup4rsyfcvsx5u6o` (`inst_attributes_id`),
  KEY `FKcfjmpk75jv2henq1h22hm4g47` (`template_entity_id`),
  CONSTRAINT `FKcfjmpk75jv2henq1h22hm4g47` FOREIGN KEY (`template_entity_id`) REFERENCES `h_templates` (`id`),
  CONSTRAINT `FKk5mvuy3lbgx4enmmww0bsaby7` FOREIGN KEY (`inst_attributes_id`) REFERENCES `h_attributes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates_inst_attributes`
--

LOCK TABLES `h_templates_inst_attributes` WRITE;
/*!40000 ALTER TABLE `h_templates_inst_attributes` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates_inst_attributes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates_lab_courses`
--

DROP TABLE IF EXISTS `h_templates_lab_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates_lab_courses` (
  `template_entity_id` bigint(20) NOT NULL,
  `lab_courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_absilonuycfc037is9fx00vre` (`lab_courses_id`),
  KEY `FKgeaeggnudumwysi3gakrnipx7` (`template_entity_id`),
  CONSTRAINT `FKgeaeggnudumwysi3gakrnipx7` FOREIGN KEY (`template_entity_id`) REFERENCES `h_templates` (`id`),
  CONSTRAINT `FKit90wnt44kxpiakge537uy8eb` FOREIGN KEY (`lab_courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates_lab_courses`
--

LOCK TABLES `h_templates_lab_courses` WRITE;
/*!40000 ALTER TABLE `h_templates_lab_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates_lab_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates_major_courses`
--

DROP TABLE IF EXISTS `h_templates_major_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates_major_courses` (
  `template_entity_id` bigint(20) NOT NULL,
  `major_courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_9g7325lumd6t3dljdq45jvsef` (`major_courses_id`),
  KEY `FKbsd5tcvicwaa0mekb0rdfnocb` (`template_entity_id`),
  CONSTRAINT `FKbsd5tcvicwaa0mekb0rdfnocb` FOREIGN KEY (`template_entity_id`) REFERENCES `h_templates` (`id`),
  CONSTRAINT `FKggc0qoso1b52ftdllii31q8wf` FOREIGN KEY (`major_courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates_major_courses`
--

LOCK TABLES `h_templates_major_courses` WRITE;
/*!40000 ALTER TABLE `h_templates_major_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates_major_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates_math_courses`
--

DROP TABLE IF EXISTS `h_templates_math_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates_math_courses` (
  `template_entity_id` bigint(20) NOT NULL,
  `math_courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_qpwob5mqt5buhf2j97blvkv2h` (`math_courses_id`),
  KEY `FK7lm1h00b21biglqd69jf2s65l` (`template_entity_id`),
  CONSTRAINT `FK7lm1h00b21biglqd69jf2s65l` FOREIGN KEY (`template_entity_id`) REFERENCES `h_templates` (`id`),
  CONSTRAINT `FKqwml9g6ntppfdhi7io2iabntd` FOREIGN KEY (`math_courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates_math_courses`
--

LOCK TABLES `h_templates_math_courses` WRITE;
/*!40000 ALTER TABLE `h_templates_math_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates_math_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates_science_courses`
--

DROP TABLE IF EXISTS `h_templates_science_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates_science_courses` (
  `template_entity_id` bigint(20) NOT NULL,
  `science_courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_lfqy37xca1pkpto1euuhqcntd` (`science_courses_id`),
  KEY `FKtjpvjy4snlse1sm04v805yow4` (`template_entity_id`),
  CONSTRAINT `FKtjpvjy4snlse1sm04v805yow4` FOREIGN KEY (`template_entity_id`) REFERENCES `h_templates` (`id`),
  CONSTRAINT `FKn3tilyj2bp3gmnc3ktdpwa4ea` FOREIGN KEY (`science_courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates_science_courses`
--

LOCK TABLES `h_templates_science_courses` WRITE;
/*!40000 ALTER TABLE `h_templates_science_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates_science_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_templates_speech_courses`
--

DROP TABLE IF EXISTS `h_templates_speech_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_templates_speech_courses` (
  `template_entity_id` bigint(20) NOT NULL,
  `speech_courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_igar2tkx0s98nivutxbnxita` (`speech_courses_id`),
  KEY `FK51d6ynnc64o5svqj8kai2380i` (`template_entity_id`),
  CONSTRAINT `FK51d6ynnc64o5svqj8kai2380i` FOREIGN KEY (`template_entity_id`) REFERENCES `h_templates` (`id`),
  CONSTRAINT `FK7mwnvpi6brhbreqy4cu04wj38` FOREIGN KEY (`speech_courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_templates_speech_courses`
--

LOCK TABLES `h_templates_speech_courses` WRITE;
/*!40000 ALTER TABLE `h_templates_speech_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_templates_speech_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `migrations`
--

DROP TABLE IF EXISTS `migrations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `migrations` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `migration` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `migrations`
--

LOCK TABLES `migrations` WRITE;
/*!40000 ALTER TABLE `migrations` DISABLE KEYS */;
INSERT INTO `migrations` VALUES (1,'2014_10_12_000000_create_users_table',1),(2,'2014_10_12_100000_create_password_resets_table',1);
/*!40000 ALTER TABLE `migrations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `password_resets`
--

DROP TABLE IF EXISTS `password_resets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `password_resets` (
  `email` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  KEY `password_resets_email_index` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `password_resets`
--

LOCK TABLES `password_resets` WRITE;
/*!40000 ALTER TABLE `password_resets` DISABLE KEYS */;
/*!40000 ALTER TABLE `password_resets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `last_name` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `major` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `remember_token` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `users_email_unique` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Huyen','Vu','abc@abc.com','$2y$10$paNq2pPTHnXhbfFtp2xQMuQC9UvmcT3hCjjsEzE7dg9LX9LtBFag.','Preferred major ...',NULL,'2017-12-21 18:55:52','2017-12-21 18:55:52');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-29  7:07:53
