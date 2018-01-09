-- MySQL dump 10.16  Distrib 10.1.28-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: raptorplan
-- ------------------------------------------------------
-- Server version	10.1.28-MariaDB

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
INSERT INTO `h_api_course_attribute` VALUES (17,9),(18,9),(19,9),(20,9),(21,9),(22,9),(22,2),(23,2),(23,9),(24,3),(26,3),(27,1),(29,1),(30,10),(31,10),(32,4),(33,4),(38,4),(40,4),(41,4),(42,4),(43,4),(44,4),(45,4),(46,4),(47,4),(48,4),(49,4),(50,4),(51,4),(52,4),(53,4),(54,4),(55,4),(57,4),(58,6),(60,6),(61,4),(62,4),(63,4),(64,6),(65,4),(78,6),(85,6),(100,4),(102,6),(103,4),(113,4),(115,4),(116,4),(117,4),(118,4),(119,4),(150,5),(165,5),(178,5),(201,5),(216,6),(220,6),(221,5),(222,6),(223,5),(224,6),(225,6),(226,5),(227,6),(228,5),(229,6),(230,6),(232,5),(235,5),(236,5),(237,5),(238,5),(239,5),(240,5),(241,5),(242,5),(243,5),(244,5),(245,5),(247,5),(248,5),(249,5),(250,5),(251,6),(252,5),(254,6),(255,6),(256,6),(257,5),(258,6),(259,5),(260,6),(261,5),(262,6),(263,6),(264,6),(265,6),(266,5),(268,5),(269,5),(271,5),(272,5),(273,5),(275,6),(276,6),(278,6),(279,6),(280,6),(281,6),(282,7),(283,6),(284,6),(285,6),(286,7),(287,6),(288,6),(299,7),(300,6),(301,6),(302,7),(303,6),(304,7),(305,7),(306,6),(307,7),(308,6),(309,7),(310,6),(311,6),(312,7),(313,6),(315,6),(316,7),(317,6),(318,6),(319,7),(320,7),(321,7),(322,7),(324,7),(325,7),(326,7),(327,6),(328,6),(329,7),(330,7),(331,7),(332,7),(335,6),(336,6),(338,6),(339,6),(340,6),(341,8),(342,6),(343,6),(344,6),(345,6),(365,6),(366,6),(367,6),(370,6),(371,6),(387,8),(388,8),(407,8),(408,8),(409,8),(410,8),(411,6),(412,6),(413,6),(414,6),(415,6),(419,6),(421,6),(422,6),(423,6),(424,6),(425,6),(440,10),(451,6),(452,6),(454,6),(455,6),(456,10),(459,10),(461,10),(463,10),(465,10),(467,10),(469,10),(471,10),(473,10),(475,10),(477,10),(479,10),(481,10),(483,10),(485,10),(487,10),(489,10),(491,10),(493,10),(495,10),(497,10),(499,10);
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
-- Table structure for table `h_course_info`
--

DROP TABLE IF EXISTS `h_course_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_course_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `credit` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `attribute_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsylql84bbaxaya7cgs0quja6p` (`attribute_id`),
  CONSTRAINT `FKsylql84bbaxaya7cgs0quja6p` FOREIGN KEY (`attribute_id`) REFERENCES `h_attributes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_course_info`
--

LOCK TABLES `h_course_info` WRITE;
/*!40000 ALTER TABLE `h_course_info` DISABLE KEYS */;
INSERT INTO `h_course_info` VALUES (1,3,'Art Distribution',4),(2,6,'Behavioral Distribution',5),(3,3,'English Foundation',1),(4,6,'Electives',10),(5,3,'Humanities Distribution',6),(6,22,'Major Requirement',9),(7,4,'Math Foundation',2),(8,3,'Science Distribution',8),(9,4,'Science Distribution with Lab',7),(10,3,'Speech Foundation',3);
/*!40000 ALTER TABLE `h_course_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_course_info_courses`
--

DROP TABLE IF EXISTS `h_course_info_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_course_info_courses` (
  `course_info_mc_template_id` bigint(20) NOT NULL,
  `courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_8ar3fyy55mrnm2ybus3ye0ejv` (`courses_id`),
  KEY `FKm3kwugpeiqd5diutunnpcqk3n` (`course_info_mc_template_id`),
  CONSTRAINT `FKk2h6e91x9bikkgq3frei1vk6p` FOREIGN KEY (`courses_id`) REFERENCES `h_courses` (`id`),
  CONSTRAINT `FKm3kwugpeiqd5diutunnpcqk3n` FOREIGN KEY (`course_info_mc_template_id`) REFERENCES `h_course_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_course_info_courses`
--

LOCK TABLES `h_course_info_courses` WRITE;
/*!40000 ALTER TABLE `h_course_info_courses` DISABLE KEYS */;
INSERT INTO `h_course_info_courses` VALUES (3,27),(3,29),(4,30),(4,31),(4,440),(4,456),(4,459),(4,461),(4,463),(4,465),(4,467),(4,469),(4,471),(4,473),(4,475),(4,477),(4,479),(4,481),(4,483),(4,485),(4,487),(4,489),(4,491),(4,493),(4,495),(4,497),(4,499),(6,17),(6,18),(6,19),(6,20),(6,21),(6,22),(7,23),(10,24),(10,26);
/*!40000 ALTER TABLE `h_course_info_courses` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=500 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_courses`
--

LOCK TABLES `h_courses` WRITE;
/*!40000 ALTER TABLE `h_courses` DISABLE KEYS */;
INSERT INTO `h_courses` VALUES (17,'CMSC203',4,'Computer Science I',23),(18,'CMSC204',4,'Computer Science II',23),(19,'CMSC140',3,'Introduction to Programming',23),(20,'CMSC207',4,'Introduction to Discrete Structures',23),(21,'ENGL101',3,'Introduction to College Writing',38),(22,'MATH182',4,'Calculus II',70),(23,'MATH181',4,'Calculus I',70),(24,'COMM108',3,'Introduction to Human Communication',25),(26,'COMM112',3,'Business and Professional Speech Communication',25),(27,'ENGL102',3,'Critical Reading, Writing, and Research',38),(29,'ENGL103',3,'Critical Reading, Writing, and Research in the Work Place',38),(30,'MATH282',3,'Differential Equations',70),(31,'MATH284',4,'Linear Algebra',70),(32,'ART100',3,'Intro to Drawing',9),(33,'ARTT102',3,'Design Studio: 2D',9),(38,'ARTT105',3,'Color Theory & Application',9),(40,'ARTT112',3,'Digital Photography/Fine Arts I',9),(41,'ARTT/GDES116',4,'Digital Tools for Visual Arts',9),(42,'ARTT120',3,'Ceramics',9),(43,'ARTT123',3,'Crafts',9),(44,'ARTT127',3,'Art Appreciation',9),(45,'ARTT152',3,'Photographic Expression I',9),(46,'ARTT225',3,'World Woodcut Traditions',9),(47,'ARTT 200,201',3,'Art History I,II',9),(48,'ARTT 247 ',3,'Weaving & Textiles',9),(49,'ARTT 265,266',3,'Architectural History I,II',9),(50,'ARTT270',3,'Survey of African Art',9),(51,'ARTT272',3,'Survey of Asian Art',9),(52,'ARTT 275',3,'Italian Renaissance Art',9),(53,'ARTT278',3,'American Art',9),(54,'ARTT279',3,'American Art Since 1945',9),(55,'ARTT280',3,'Modern Art: Origins & Dev.',9),(57,'ENGL235',3,'Film & Literature',38),(58,'ARAB101',5,'Elementary Arabic 1',6),(60,'ARAB102',5,'Elementary Arabic 2',6),(61,'DANC100',3,'Intro to Dance',30),(62,'ENGL264',3,'Intro/Creative Writing/Fiction',38),(63,'ENGL272',3,'Intro/Creative Writing/Poetry',38),(64,'ASLP100',3,'American Sign Language 1',10),(65,'FILM110',3,'Introduction to Film',40),(78,'ASLP110 ',3,'American Sign Language 2',10),(85,'CHIN101',5,'Chinese 1',19),(100,'IDES211',3,'Historic Interiors I',59),(102,'CHIN102',5,'Chinese 2',19),(103,'ISTD173',3,'Integrated Arts',60),(113,'MUSC110',3,'Listening to Music',71),(115,'MUSC117',3,'World Music',71),(116,'MUSC125',3,'History of Jazz',71),(117,'MUSC131',3,'American Popular Music',71),(118,'PHOT150',3,'Photography I',77),(119,'PHOT161',3,'Intro/Digital Photography',77),(150,'CCJS110',3,'Administration of Justice',17),(165,'ANTH201',3,'Intro to Sociocultural Anthropology',4),(178,'ANTH256',3,'World Cultures',4),(201,'ASLP121',3,'Intro to the Deaf Culture',10),(216,'ENGL122',3,'Intro to World Mythology',38),(220,'ENGL190',3,'Intro to Literature',38),(221,'ECON105',3,'Basic Economics',33),(222,'ENGL201',3,'Intro to World Literature 1',38),(223,'ECON103',3,'Evolution/Economics Societies',33),(224,'ENGL202',3,'Intro to World Literature 2',38),(225,'ENGL205',3,'Masterpiece of Asian Literature',38),(226,'ECON201',3,'Principles of Economics-Macro',33),(227,'ENGL208',3,'Women in Literature',38),(228,'ECON202',3,'Principles of Economics-Micro',33),(229,'ENGL211',3,'American Literature 1',38),(230,'ENGL212',3,'America Literature 2',38),(232,'GEOG105',3,'Cultural Geography',45),(235,'GEOG130',3,'Global Geography',45),(236,'GEOG113',3,'Economic Geography',45),(237,'HLTH131',3,'Drugs & Lifestyle. Wellness(GEIR)',55),(238,'HLTH160',3,'Science & Theory of Health(GEIR)',55),(239,'HLTH170',3,'Introduction to Aging(GEIR)',55),(240,'HLTH212',3,'Controlling Stress and Tension(GEIR)',55),(241,'HLTH225',3,'Intro. Health Behaviors(GEIR)',55),(242,'POLI101',3,'American Government',79),(243,'POLI105',3,'Intro to Political Science',79),(244,'POLI203',3,'International Relations',79),(245,'POLI206',3,'Political Ideologies',79),(247,'POLI211',3,'Comparative Politics & Governments',79),(248,'POLI221',3,'Western Political Thought',79),(249,'POLI242',3,'State and Local Government',79),(250,'POLI252',3,'Race & Ethnicity in US Politics',79),(251,'ENGL213',3,'British Literature 1',38),(252,'POLI256',3,'Politics of the Developing World',79),(254,'ENGL214',3,'British Literature 2',38),(255,'ENGL220',3,'The American Novel',38),(256,'ENGL226',3,'African American Literature',38),(257,'PYSC102',3,'General Psychology',81),(258,'ENGL227',3,'African American Literature 2',38),(259,'SOCY100',3,'Introduction to Sociology',83),(260,'ENGL230',3,'Intro to Modern Drama',38),(261,'SOCY105',3,'Social Problems & Issues',83),(262,'ENGL231',3,'Intro to Modern Poetry',38),(263,'ENGL233',3,'The Short Story',38),(264,'ENGL241',3,'American Lit Nature and Environment',38),(265,'FREN101',3,'Elem French',39),(266,'SOCY208',3,'Sociology of Gender',83),(268,'SOCY214',3,'Sociology of the Family',83),(269,'SOCY233',3,'Race and Ethnic Relations',83),(271,'SOCY240',3,'Sociology of Age and Aging',83),(272,'SOCY243',3,'Sociology of Sport',83),(273,'SOCY250',3,'Globalization Issues',83),(275,'GERM101',3,'Elementary German 1',47),(276,'GERM102',3,'Elemantary German 2',47),(278,'GHUM101',3,'Intro to Global Humanities',48),(279,'HIND101',5,'Elementary Hindi 1',52),(280,'HIND102',5,'Elementary Hindi 2',52),(281,'HIST122',3,'Women in World History',54),(282,'ASTR101',4,'Intro to Astronomy',11),(283,'HIST114',3,'The World in the 20th Century',54),(284,'HIST116',3,'World History 1',54),(285,'HIST148',3,'History of Europe 2',54),(286,'ASTR202',4,'Intro to Modern Astronomy',11),(287,'HIST117',3,'World History 2',54),(288,'HIST146',3,'History of the Ancient World',54),(299,'BIOL101',4,'General Bialogy',13),(300,'HIST200',3,'History of the United States 1',54),(301,'HIST201',3,'History of United States 2 ',54),(302,'BIOL105',3,'Enviromental Biology & BIOL 106 Lab',13),(303,'HIST205',3,'Tech Culture amd Western World',54),(304,'BIOL130',3,' The Human Body & BIOL 131 Lab',13),(305,'BIOL150',4,'Principles of Biology I for Science Majors',13),(306,'HIST211',3,'History of Latinos in US',54),(307,'BIOL212',4,'Human Anatomy & PhysiologyI',13),(308,'HIST228',3,'Women in the Western World',54),(309,'BIOL213',4,'Human Anatomy & Physiology II',13),(310,'HIST235',3,'History of African Americans I',54),(311,'HIST236',3,'History of African Americans 2',54),(312,'BIOL217',4,'Ecology',13),(313,'HIST240',3,'Civil Rights in America',54),(315,'HIST247',3,'East Asian Civilization',54),(316,'CHEM131',4,'Principles of Chemistry I',18),(317,'HIST250',3,'Modern Asia',54),(318,'HIST252',3,'US and 20 Cent. World Affairs',54),(319,'CHEM109',3,'Chemistry & Society & CHEM109L (Lab)',18),(320,'CHEM115',4,'Organic & Biological Chemistry',18),(321,'CHEM132',4,'Principles of Chemistry II',18),(322,'CHEM150',4,'Essentials of Organic & Biochemistry',18),(324,'GEOL101',4,'Physical Geology',46),(325,'GEOL102',4,'Historical Geology',46),(326,'PHYS110',4,'Sound & Lights in the Arts',78),(327,'HIST262',3,'History of England 1',54),(328,'HIST263',3,'History of England 2',54),(329,'PHYS203',4,'General Physics I',78),(330,'PHYS204',4,'General Physics II',78),(331,'PHYS262',4,'General Physics II:Electricity',78),(332,'PHYS263',4,'Gen. Physics III;Waves',78),(335,'HIST265',3,'African History 1',54),(336,'HIST266',3,'African History 2',54),(338,'ITAL101',3,'Elementary Italian 1',54),(339,'ITAL102',3,'Elementary Italian 2',61),(340,'KORA101',3,'Elementary Korean 1',64),(341,'ANTH215',3,'Human Evolution & Archaeology',4),(342,'KORA102',3,'Elementary Korean 2',64),(343,'LATN101',3,'Elementary Latin 1',66),(344,'LATN102',3,'Elementary Latin 2',66),(345,'LING200',3,'Introduction to Linguistics ',69),(365,'PHIL101',3,'Introduction to Philosophy',76),(366,'PHIL140',3,'Intro to the Study of Ethics ',76),(367,'PHIL143',3,'Intro to Study of Religion',76),(370,'PHIL190',3,'Elem. Logic and Sematics ',76),(371,'PHIL201',3,'Morality and Contempt Law',76),(387,'BIOL108',3,'Marine Environmental Science',13),(388,'BIOL111',3,'Natural Science of the Chesapeake Bay',13),(407,'ENES100',3,'Introduction to Engineering Design',37),(408,'NUTR101',3,'Intro. to Nutrition',73),(409,'PHYS105',3,'Conceptual Physics',78),(410,'PHYS161',3,'General Physics I (Engineering)',78),(411,'WMST101',3,'Intro to Women\'s Studies',88),(412,'SPAN216',3,'Adv. Readings/Latin Amer. Literature',84),(413,'SPAN215',3,'Adv. Span Convers & Composition',84),(414,'SAPN203',4,'Intensive Intermediate Spanish',84),(415,'SPAN106',4,'Spanish for Heritage Speakers',84),(419,'SPAN103',4,'Intensive Elementary Spanish',84),(421,'PHIL205',3,'Philosophy in Literature',76),(422,'PHIL212',3,'Women in Philosophy 1',76),(423,'PHIL218',3,'Women in Philosophy 2',76),(424,'PORT 101',3,'Elem Portuguese 1',80),(425,'PORT102',3,'Elem Portuguese 2',80),(440,'CMSC269',1,'Computer Science Internship',22),(451,'SPAN101',3,'Elementary Spanish I',84),(452,'SPAN102',3,'Elementary Spanish II',84),(454,'SPAN201',3,'Intermediate Spanish I ',84),(455,'SPAN202',3,'Intermediate Spanish II',84),(456,'CMSC100',2,'Fundamentals of Computer Programming',23),(459,'CMSC110',3,'Computer Concepts',23),(461,'CMSC201',3,'Java Programming Language',23),(463,'CMSC214',3,'Advanced Java Programming',23),(465,'CMSC220',3,'Client-Server Programming with Java',23),(467,'CMSC222',3,'Visual Programming',23),(469,'CMSC224',3,'Developing Web Applications Using C# and ASP.NET',23),(471,'CMSC226',3,'Introduction to Object-Oriented Programming with C++',23),(473,'CMSC230',3,'Advanced Object-Oriented Programming with C++',23),(475,'CMSC234',3,'Mobile Game and Application Programming',23),(477,'CMSC237',3,'Introduction to iPhone Programming Using Objective C',23),(479,'CMSC240',3,'Advanced Mobile App and Game Development',23),(481,'CMSC243',3,'Systems Analysis and Design',23),(483,'CMSC246',3,'Introduction to SQL Using Oracle',23),(485,'CMSC250',3,'UNIX/LINUX Operating System',23),(487,'CMSC253',3,'UNIX/LINUX System Administration',23),(489,'CMSC260',3,'Computer Security',23),(491,'CMSC299',3,'Special Topics in Computer Science and Technologies',23),(493,'CMSC141',1,'Intermediate Programming',23),(495,'CMSC266',3,'Programming for Digital Forensics',23),(497,'CMSC295X',3,'Research Topics in Information Security',23),(499,'CMSC135',3,'Introduction to Scripting',23);
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
  CONSTRAINT `FK1gvtemo8wcyoa7u6of2ykwdri` FOREIGN KEY (`courses_id`) REFERENCES `h_courses` (`id`),
  CONSTRAINT `FKotisucfmdfx78vyocgjdqfkes` FOREIGN KEY (`discipline_entity_id`) REFERENCES `h_disciplines` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_disciplines_courses`
--

LOCK TABLES `h_disciplines_courses` WRITE;
/*!40000 ALTER TABLE `h_disciplines_courses` DISABLE KEYS */;
INSERT INTO `h_disciplines_courses` VALUES (4,165),(4,178),(4,341),(6,58),(6,60),(9,32),(9,33),(9,38),(9,40),(9,41),(9,42),(9,43),(9,44),(9,45),(9,46),(9,47),(9,48),(9,49),(9,50),(9,51),(9,52),(9,53),(9,54),(9,55),(10,64),(10,78),(10,201),(11,282),(11,286),(13,299),(13,302),(13,304),(13,305),(13,307),(13,309),(13,312),(13,387),(13,388),(17,150),(18,316),(18,319),(18,320),(18,321),(18,322),(19,85),(19,102),(22,440),(23,17),(23,18),(23,19),(23,20),(23,456),(23,459),(23,461),(23,463),(23,465),(23,467),(23,469),(23,471),(23,473),(23,475),(23,477),(23,479),(23,481),(23,483),(23,485),(23,487),(23,489),(23,491),(23,493),(23,495),(23,497),(23,499),(25,24),(25,26),(30,61),(33,221),(33,223),(33,226),(33,228),(37,407),(38,21),(38,27),(38,29),(38,57),(38,62),(38,63),(38,216),(38,220),(38,222),(38,224),(38,225),(38,227),(38,229),(38,230),(38,251),(38,254),(38,255),(38,256),(38,258),(38,260),(38,262),(38,263),(38,264),(39,265),(40,65),(45,232),(45,235),(45,236),(46,324),(46,325),(47,275),(47,276),(48,278),(52,279),(52,280),(54,281),(54,283),(54,284),(54,285),(54,287),(54,288),(54,300),(54,301),(54,303),(54,306),(54,308),(54,310),(54,311),(54,313),(54,315),(54,317),(54,318),(54,327),(54,328),(54,335),(54,336),(54,338),(55,237),(55,238),(55,239),(55,240),(55,241),(59,100),(60,103),(61,339),(64,340),(64,342),(66,343),(66,344),(69,345),(70,22),(70,23),(70,30),(70,31),(71,113),(71,115),(71,116),(71,117),(73,408),(76,365),(76,366),(76,367),(76,370),(76,371),(76,421),(76,422),(76,423),(77,118),(77,119),(78,326),(78,329),(78,330),(78,331),(78,332),(78,409),(78,410),(79,242),(79,243),(79,244),(79,245),(79,247),(79,248),(79,249),(79,250),(79,252),(80,424),(80,425),(81,257),(83,259),(83,261),(83,266),(83,268),(83,269),(83,271),(83,272),(83,273),(84,412),(84,413),(84,414),(84,415),(84,419),(84,451),(84,452),(84,454),(84,455),(88,411);
/*!40000 ALTER TABLE `h_disciplines_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_major`
--

DROP TABLE IF EXISTS `h_major`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_major` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_sn7avrqf6walq2sfb5eunq8e9` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_major`
--

LOCK TABLES `h_major` WRITE;
/*!40000 ALTER TABLE `h_major` DISABLE KEYS */;
INSERT INTO `h_major` VALUES (1,'CMSC','Computer Science'),(2,'ENEE','Electrical Engineering');
/*!40000 ALTER TABLE `h_major` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_mc_templates`
--

DROP TABLE IF EXISTS `h_mc_templates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_mc_templates` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `inst_credit` int(11) DEFAULT NULL,
  `major_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6wie3cgwmdq4s62jq0ie6vx85` (`major_id`),
  CONSTRAINT `FK6wie3cgwmdq4s62jq0ie6vx85` FOREIGN KEY (`major_id`) REFERENCES `h_major` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_mc_templates`
--

LOCK TABLES `h_mc_templates` WRITE;
/*!40000 ALTER TABLE `h_mc_templates` DISABLE KEYS */;
INSERT INTO `h_mc_templates` VALUES (1,3,1);
/*!40000 ALTER TABLE `h_mc_templates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_mc_templates_course_info`
--

DROP TABLE IF EXISTS `h_mc_templates_course_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_mc_templates_course_info` (
  `mc_template_entity_id` bigint(20) NOT NULL,
  `course_info_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_geg735euy2eg9l4nc4c0ph2bl` (`course_info_id`),
  KEY `FKar9hwy9nc5rj6cg6noiklt5w8` (`mc_template_entity_id`),
  CONSTRAINT `FKar9hwy9nc5rj6cg6noiklt5w8` FOREIGN KEY (`mc_template_entity_id`) REFERENCES `h_mc_templates` (`id`),
  CONSTRAINT `FKrammydsu4b6u5oe6r3390tx45` FOREIGN KEY (`course_info_id`) REFERENCES `h_course_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_mc_templates_course_info`
--

LOCK TABLES `h_mc_templates_course_info` WRITE;
/*!40000 ALTER TABLE `h_mc_templates_course_info` DISABLE KEYS */;
INSERT INTO `h_mc_templates_course_info` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9),(1,10);
/*!40000 ALTER TABLE `h_mc_templates_course_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_mc_templates_inst_attributes`
--

DROP TABLE IF EXISTS `h_mc_templates_inst_attributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_mc_templates_inst_attributes` (
  `mc_template_entity_id` bigint(20) NOT NULL,
  `inst_attributes_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_9h7sb8wqf0mek52et0ciffnh5` (`inst_attributes_id`),
  KEY `FK6kmclvkipm0r8ymkeyw0noql1` (`mc_template_entity_id`),
  CONSTRAINT `FK32g36xbw8r0pk6erg2prs0shk` FOREIGN KEY (`inst_attributes_id`) REFERENCES `h_attributes` (`id`),
  CONSTRAINT `FK6kmclvkipm0r8ymkeyw0noql1` FOREIGN KEY (`mc_template_entity_id`) REFERENCES `h_mc_templates` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_mc_templates_inst_attributes`
--

LOCK TABLES `h_mc_templates_inst_attributes` WRITE;
/*!40000 ALTER TABLE `h_mc_templates_inst_attributes` DISABLE KEYS */;
INSERT INTO `h_mc_templates_inst_attributes` VALUES (1,4),(1,6);
/*!40000 ALTER TABLE `h_mc_templates_inst_attributes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_semester`
--

DROP TABLE IF EXISTS `h_semester`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_semester` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_semester`
--

LOCK TABLES `h_semester` WRITE;
/*!40000 ALTER TABLE `h_semester` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_semester` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_semester_attributes`
--

DROP TABLE IF EXISTS `h_semester_attributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_semester_attributes` (
  `semester_template_id` bigint(20) NOT NULL,
  `attributes_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_84vs1raxv6m77evv57x0y8a92` (`attributes_id`),
  KEY `FKd2jxt7udodmhrpxbpk07bg83w` (`semester_template_id`),
  CONSTRAINT `FK9kbnu6boa8jgng6f87vvv8t1g` FOREIGN KEY (`attributes_id`) REFERENCES `h_attributes` (`id`),
  CONSTRAINT `FKd2jxt7udodmhrpxbpk07bg83w` FOREIGN KEY (`semester_template_id`) REFERENCES `h_semester` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_semester_attributes`
--

LOCK TABLES `h_semester_attributes` WRITE;
/*!40000 ALTER TABLE `h_semester_attributes` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_semester_attributes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_semester_courses`
--

DROP TABLE IF EXISTS `h_semester_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_semester_courses` (
  `semester_template_id` bigint(20) NOT NULL,
  `courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_9dnpe76jf3nnpw3q6hf73s9n6` (`courses_id`),
  KEY `FK4pkbeojq5504q3m9hgs1j04ad` (`semester_template_id`),
  CONSTRAINT `FK4pkbeojq5504q3m9hgs1j04ad` FOREIGN KEY (`semester_template_id`) REFERENCES `h_semester` (`id`),
  CONSTRAINT `FKerlas1db8te2im19bk7f70wnu` FOREIGN KEY (`courses_id`) REFERENCES `h_courses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_semester_courses`
--

LOCK TABLES `h_semester_courses` WRITE;
/*!40000 ALTER TABLE `h_semester_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_semester_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_tran_template`
--

DROP TABLE IF EXISTS `h_tran_template`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_tran_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `major_id` bigint(20) DEFAULT NULL,
  `university_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfkmtabal8djjswcrtio0j2hut` (`major_id`),
  KEY `FKmhaj4xxd7w1vcfgtgq2enf6ll` (`university_id`),
  CONSTRAINT `FKfkmtabal8djjswcrtio0j2hut` FOREIGN KEY (`major_id`) REFERENCES `h_major` (`id`),
  CONSTRAINT `FKmhaj4xxd7w1vcfgtgq2enf6ll` FOREIGN KEY (`university_id`) REFERENCES `h_universities` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_tran_template`
--

LOCK TABLES `h_tran_template` WRITE;
/*!40000 ALTER TABLE `h_tran_template` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_tran_template` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_tran_template_semesters`
--

DROP TABLE IF EXISTS `h_tran_template_semesters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_tran_template_semesters` (
  `transfer_template_entity_id` bigint(20) NOT NULL,
  `semesters_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_k8bvog3oubn5fbnk5x8aish7v` (`semesters_id`),
  KEY `FK1rreoxomooas4ki2s88nbjw60` (`transfer_template_entity_id`),
  CONSTRAINT `FK1rreoxomooas4ki2s88nbjw60` FOREIGN KEY (`transfer_template_entity_id`) REFERENCES `h_tran_template` (`id`),
  CONSTRAINT `FKk3dubspcbrkvm998yufjanxs7` FOREIGN KEY (`semesters_id`) REFERENCES `h_semester` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_tran_template_semesters`
--

LOCK TABLES `h_tran_template_semesters` WRITE;
/*!40000 ALTER TABLE `h_tran_template_semesters` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_tran_template_semesters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_universities`
--

DROP TABLE IF EXISTS `h_universities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_universities` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_4cuwfrjob3s9i0pbvydaoc4x9` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_universities`
--

LOCK TABLES `h_universities` WRITE;
/*!40000 ALTER TABLE `h_universities` DISABLE KEYS */;
INSERT INTO `h_universities` VALUES (1,'UMBC','University of Maryland, Baltimore County'),(2,'UMD','University of Maryland, College Park');
/*!40000 ALTER TABLE `h_universities` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-08 21:49:00
