-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: bcg1edb7amoxyfzcxuif-mysql.services.clever-cloud.com    Database: bcg1edb7amoxyfzcxuif
-- ------------------------------------------------------
-- Server version	8.0.22-13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--


--
-- Table structure for table `about_me`
--

DROP TABLE IF EXISTS `about_me`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `about_me` (
  `id_about` int NOT NULL AUTO_INCREMENT,
  `about_text` varchar(2500) NOT NULL,
  `img_perfil` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_about`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `about_me`
--

LOCK TABLES `about_me` WRITE;
/*!40000 ALTER TABLE `about_me` DISABLE KEYS */;
INSERT INTO `about_me` VALUES (1,'Hola, yo soy Pedro, un programador junior con experiencia en el desarrollo de aplicaciones web. Soy apasionado de la tecnología y estoy siempre buscando aprender y mejorar mis habilidades. Tengo experiencia en lenguajes de programación como Java, Python y JavaScript, y he trabajado efectivamente en equipo para resolver problemas. He participado en diversos proyectos, lo que me ha permitido desarrollar habilidades en el diseño y desarrollo de interfaces de usuario, así como en la implementación de algoritmos y estructuras de datos. Soy una persona proactiva, creativa y comprometida, siempre dispuesto a enfrentar nuevos desafíos y aprender de ellos. Me encanta desarrollar productos que sean intuitivos y estéticamente atractivos, y me siento motivado por encontrar soluciones creativas y efectivas. Estoy emocionado por continuar aprendiendo y creciendo como programador, y estoy comprometido a seguir mejorando mis habilidades y aportando valor a mi equipo.\n\nEn el futuro, planeo enfocarme en el desarrollo web Full Stack, utilizando las habilidades que he adquirido y mi personalidad orientada a la solución para crear soluciones innovadoras y efectivas. Me apasiona crear productos que sean intuitivos y estéticamente atractivos, y estoy emocionado por la oportunidad de seguir aprendiendo y creciendo como programador junior. Siempre estoy en busca de nuevos desafíos que me permitan mejorar mis habilidades y contribuir al éxito de cualquier proyecto en el que participe, manteniendo un enfoque en soluciones creativas/experiencias accesible para todos.\n\nAdemás de mi trabajo como desarrollador, me encanta explorar intereses fuera de la tecnología, como escuchar música, jugar videojuegos y leer sobre el espacio y las últimas tendencias en tecnología. También disfruto del cine y me encanta pasar tiempo con mi familia y amigos.\n\nEstas son algunas herramientas y tecnologías con las que estoy familiarizado y con las que también he estado trabajando.\n','https://firebasestorage.googleapis.com/v0/b/pfportafoliofronteed.appspot.com/o/imagen%2Fimg-perfil_1?alt=media&token=e9212b4d-fb3a-4919-9e55-39815de8ac5c | img-perfil_1');
/*!40000 ALTER TABLE `about_me` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contacto` (
  `id_cont` int NOT NULL AUTO_INCREMENT,
  `des_cont` varchar(150) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_cont`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
INSERT INTO `contacto` VALUES (1,'Si crees que somos una buena combinación, envíame un correo electrónico para explorar oportunidades de trabajo juntos.','bonninpedro1@gmail.com','3447-53####');
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experience`
--

DROP TABLE IF EXISTS `experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `experience` (
  `id_exp` int NOT NULL AUTO_INCREMENT,
  `contacto` varchar(80) NOT NULL,
  `empresa` varchar(80) NOT NULL,
  `puesto` varchar(80) NOT NULL,
  `tiempo` varchar(80) NOT NULL,
  PRIMARY KEY (`id_exp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experience`
--

LOCK TABLES `experience` WRITE;
/*!40000 ALTER TABLE `experience` DISABLE KEYS */;
/*!40000 ALTER TABLE `experience` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `id` int NOT NULL AUTO_INCREMENT,
  `apellido` varchar(50) NOT NULL,
  `cv` varchar(255) DEFAULT NULL,
  `descripcion` varchar(150) NOT NULL,
  `imglogo` varchar(255) DEFAULT NULL,
  `nombre` varchar(50) NOT NULL,
  `profesion` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'Bonnin','https://drive.google.com/file/d/1ss3XC3x0B64J4VMQYTGUfWSugJX_JJId/view?usp=share_link','Como desarrollador, construyo soluciones web personalizadas con atención al detalle y pasión por la excelencia, y a veces diseño también.','https://firebasestorage.googleapis.com/v0/b/pfportafoliofronteed.appspot.com/o/imagen%2Flogo_1?alt=media&token=461d289b-0350-43bc-bbba-3eb8849bb3d1 | logo_1','Pedro','Developer');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyect`
--

DROP TABLE IF EXISTS `proyect`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyect` (
  `id_proy` int NOT NULL AUTO_INCREMENT,
  `details_proy` varchar(300) NOT NULL,
  `img_url_proy` varchar(500) DEFAULT NULL,
  `name_proy` varchar(80) NOT NULL,
  `repo_url_proy` varchar(300) DEFAULT NULL,
  `site_url_proy` varchar(300) DEFAULT NULL,
  `tools_proy` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_proy`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyect`
--

LOCK TABLES `proyect` WRITE;
/*!40000 ALTER TABLE `proyect` DISABLE KEYS */;
INSERT INTO `proyect` VALUES (1,'El proyecto es una aplicación web que consume la API de TMDB para mostrar un catálogo de películas. La aplicación cuenta con una interfaz de usuario intuitiva y fácil de usar, que permite a los usuarios buscar películas por título, y ver información detallada sobre cada película, junto a su tráiler.','https://firebasestorage.googleapis.com/v0/b/pfportafoliofronteed.appspot.com/o/imagen%2FimgProy_1?alt=media&token=97c5b562-bddb-4995-9758-5449f4d94c7b | imgProy_1','CinemaNow','https://github.com/Pedrobonnin/Pedrobonnin.github.io','https://pedrobonnin.github.io/','HTML, CSS, JS'),(2,'Un sistema en Python que consume la API de openweathermap.org para mostrar el clima actual y pronóstico en una ubicación específica. Los usuarios pueden ingresar la ciudad o código postal y ver gráficos y tablas de datos históricos del clima.',NULL,'walter api clima','https://github.com/Pedrobonnin/tp_walter_api_clima',NULL,'Python, openweathermap'),(4,'Es un sistema - aplicaciones de escritorio en enfocada a la Gestión de Elemento de cocina.\n✔️ Conexión a la base de datos SQLite.\n✔️ Gestión de Elemento de cocina, préstamos y devoluciones.\n✔️ Registros de movimiento.\n✔️ Tablas de consulta','https://firebasestorage.googleapis.com/v0/b/pfportafoliofronteed.appspot.com/o/imagen%2FimgProy_4?alt=media&token=1198887f-de9f-40a8-9c47-0911df284555 | imgProy_4','Gestor de Inventario','https://github.com/Pedrobonnin/Proyecto_Psupervisadas',NULL,'Java, SQLite');
/*!40000 ALTER TABLE `proyect` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `redes`
--

DROP TABLE IF EXISTS `redes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `redes` (
  `id_red` int NOT NULL AUTO_INCREMENT,
  `url_red` varchar(500) NOT NULL,
  `url_red_img` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id_red`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `redes`
--

LOCK TABLES `redes` WRITE;
/*!40000 ALTER TABLE `redes` DISABLE KEYS */;
INSERT INTO `redes` VALUES (3,'LINK','https://firebasestorage.googleapis.com/v0/b/pfportafoliofronteed.appspot.com/o/imagen%2FimgLogoRed_3?alt=media&token=8532aa17-8abb-4fa9-88d3-ca986a10e792 | imgLogoRed_3'),(4,'https://github.com/Pedrobonnin','https://firebasestorage.googleapis.com/v0/b/pfportafoliofronteed.appspot.com/o/imagen%2FimgLogoRed_4?alt=media&token=1d62db16-46d0-49bb-bb49-fc0053229d14 | imgLogoRed_4'),(5,'link','https://firebasestorage.googleapis.com/v0/b/pfportafoliofronteed.appspot.com/o/imagen%2FimgLogoRed_5?alt=media&token=6f2da61f-7b5a-4685-a300-bd9ad9886dab | imgLogoRed_5'),(6,'link','https://firebasestorage.googleapis.com/v0/b/pfportafoliofronteed.appspot.com/o/imagen%2FimgLogoRed_6?alt=media&token=910f88b1-8ae6-4cf3-9dba-e6226bebcb90 | imgLogoRed_6');
/*!40000 ALTER TABLE `redes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rol` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rol_nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_USER');
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `skills`
--

DROP TABLE IF EXISTS `skills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `skills` (
  `id_skill` int NOT NULL AUTO_INCREMENT,
  `outer_stroke_color` varchar(255) DEFAULT NULL,
  `porcentaje` int NOT NULL,
  `una_skill` varchar(50) NOT NULL,
  PRIMARY KEY (`id_skill`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skills`
--

LOCK TABLES `skills` WRITE;
/*!40000 ALTER TABLE `skills` DISABLE KEYS */;
INSERT INTO `skills` VALUES (1,'#e44c25',100,'HTML5 '),(2,'#006eba',73,'CSS'),(3,'#9d8e1e',35,'JS'),(4,'#740000',100,'Angular');
/*!40000 ALTER TABLE `skills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `study`
--

DROP TABLE IF EXISTS `study`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `study` (
  `id_study` int NOT NULL AUTO_INCREMENT,
  `escuela` varchar(80) NOT NULL,
  `localidad` varchar(20) NOT NULL,
  `nivel` varchar(20) NOT NULL,
  `tiempo` varchar(80) NOT NULL,
  `titulo` varchar(80) NOT NULL,
  PRIMARY KEY (`id_study`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `study`
--

LOCK TABLES `study` WRITE;
/*!40000 ALTER TABLE `study` DISABLE KEYS */;
INSERT INTO `study` VALUES (1,'UTN ','C del Uruguay ','2 años','Final','Técnico ');
/*!40000 ALTER TABLE `study` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tool`
--

DROP TABLE IF EXISTS `tool`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tool` (
  `id_tool` int NOT NULL AUTO_INCREMENT,
  `tool` varchar(50) NOT NULL,
  PRIMARY KEY (`id_tool`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tool`
--

LOCK TABLES `tool` WRITE;
/*!40000 ALTER TABLE `tool` DISABLE KEYS */;
INSERT INTO `tool` VALUES (1,'HTML'),(2,'CSS'),(3,'JS'),(4,'Angular'),(6,'Mysql');
/*!40000 ALTER TABLE `tool` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `nombre_usuario` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_puhr3k3l7bj71hb7hk7ktpxn0` (`nombre_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'bonninpedro1@gmail.com','pedro','pedro','$2a$10$KbVVy6tf48XUN1m5wXgmNuuNFnbJHHAZQLArAIXez5RMzINWGOkYW');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_rol`
--

DROP TABLE IF EXISTS `usuario_rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario_rol` (
  `usuario_id` int NOT NULL,
  `rol_id` int NOT NULL,
  PRIMARY KEY (`usuario_id`,`rol_id`),
  KEY `FK610kvhkwcqk2pxeewur4l7bd1` (`rol_id`),
  CONSTRAINT `FK610kvhkwcqk2pxeewur4l7bd1` FOREIGN KEY (`rol_id`) REFERENCES `rol` (`id`),
  CONSTRAINT `FKbyfgloj439r9wr9smrms9u33r` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_rol`
--

LOCK TABLES `usuario_rol` WRITE;
/*!40000 ALTER TABLE `usuario_rol` DISABLE KEYS */;
INSERT INTO `usuario_rol` VALUES (1,1),(1,2);
/*!40000 ALTER TABLE `usuario_rol` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-24 15:44:48
