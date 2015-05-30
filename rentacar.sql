-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.6.21-log - MySQL Community Server (GPL)
-- ОС Сервера:                   Win64
-- HeidiSQL Версия:              8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Дамп структуры базы данных rentacar
CREATE DATABASE IF NOT EXISTS `rentacar` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `rentacar`;


-- Дамп структуры для таблица rentacar.body_styles
CREATE TABLE IF NOT EXISTS `body_styles` (
  `id_body_style` int(11) NOT NULL AUTO_INCREMENT,
  `name_body_style` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_body_style`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы rentacar.body_styles: ~7 rows (приблизительно)
/*!40000 ALTER TABLE `body_styles` DISABLE KEYS */;
INSERT INTO `body_styles` (`id_body_style`, `name_body_style`) VALUES
	(1, 'Convertible'),
	(2, 'Coupe'),
	(3, 'Crossover'),
	(4, 'Hatchback'),
	(5, 'Minivan'),
	(6, 'Sedan'),
	(7, 'Wagon');
/*!40000 ALTER TABLE `body_styles` ENABLE KEYS */;


-- Дамп структуры для таблица rentacar.cars
CREATE TABLE IF NOT EXISTS `cars` (
  `id_car` int(11) NOT NULL AUTO_INCREMENT,
  `brand` varchar(100) NOT NULL DEFAULT '0',
  `model` varchar(100) NOT NULL DEFAULT '0',
  `body_style` int(11) NOT NULL DEFAULT '0',
  `fuel_type` varchar(100) NOT NULL DEFAULT '0',
  `year` varchar(100) NOT NULL DEFAULT '0',
  `price` int(11) NOT NULL DEFAULT '0',
  `description` varchar(255) NOT NULL DEFAULT '0',
  `photo` varchar(255) NOT NULL DEFAULT '0',
  `color` varchar(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_car`),
  KEY `FK_cars_body_style` (`body_style`),
  CONSTRAINT `FK_cars_body_style` FOREIGN KEY (`body_style`) REFERENCES `body_styles` (`id_body_style`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы rentacar.cars: ~8 rows (приблизительно)
/*!40000 ALTER TABLE `cars` DISABLE KEYS */;
INSERT INTO `cars` (`id_car`, `brand`, `model`, `body_style`, `fuel_type`, `year`, `price`, `description`, `photo`, `color`) VALUES
	(1, 'AUDI', 'S8', 1, 'Sedan', '2015', 10000, 'The best car', 'IMAGE1', 'Black'),
	(2, 'BMW', '318', 3, 'Hatchback', '2014', 7500, 'MonsterCar', 'IMAGE2', 'Silver'),
	(3, 'Lada', '2106', 2, 'Gasoline', '1995', 1000, 'Bad car', 'image3.jpg', 'Blue'),
	(4, 'Джили', 'СЦ7', 4, 'Бензин', '2014', 1000, 'Бел авто', 'В гугле', 'Серый'),
	(6, 'Ford', 'Mustang', 5, 'Gasoline', '2015', 9999, 'Paleh4e', 'image4.jpg', 'Black'),
	(7, 'Nissan', 'Almera', 4, 'Gasoline', '2005', 5000, 'Normal', 'image6.jpg', 'Biege'),
	(8, 'BMW', '318', 1, 'Diesel', '2003', 2000, 'Wow auto', 'picture', 'Black'),
	(9, 'Москвич', '216', 5, 'бензин', '1988', 230, 'Просто красавец', 'Нет', 'Бежевый');
/*!40000 ALTER TABLE `cars` ENABLE KEYS */;


-- Дамп структуры для таблица rentacar.orders
CREATE TABLE IF NOT EXISTS `orders` (
  `id_order` int(11) NOT NULL AUTO_INCREMENT,
  `car` int(11) NOT NULL,
  `customer` int(11) NOT NULL,
  `date_order` varchar(50) NOT NULL,
  `order_status` varchar(50) NOT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`id_order`),
  KEY `FK_orders_cars` (`car`),
  KEY `FK_orders_users` (`customer`),
  CONSTRAINT `FK_orders_cars` FOREIGN KEY (`car`) REFERENCES `cars` (`id_car`),
  CONSTRAINT `FK_orders_users` FOREIGN KEY (`customer`) REFERENCES `users` (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы rentacar.orders: ~14 rows (приблизительно)
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` (`id_order`, `car`, `customer`, `date_order`, `order_status`, `price`) VALUES
	(1, 1, 1, '2015-05-19', 'WAITING', 10000),
	(2, 2, 1, '2015-09-18', 'CONFIRMED', 7500),
	(3, 3, 1, '2015-09-19', 'CANCELED', 7500),
	(4, 3, 2, '2015-09-19', 'CANCELED', 7500),
	(5, 1, 1, 'XXXX-XX-XX', 'WAITING', 10000),
	(14, 1, 2, 'XXXX-XX-XX', 'WAITING', 10000),
	(15, 4, 1, 'XXXX-XX-XX', 'WAITING', 1000),
	(17, 8, 1, 'XXXX-XX-XX', 'WAITING', 2000),
	(18, 2, 6, 'XXXX-XX-XX', 'WAITING', 7500),
	(19, 1, 6, 'XXXX-XX-XX', 'WAITING', 10000),
	(20, 1, 1, 'XXXX-XX-XX', 'WAITING', 10000),
	(21, 7, 1, 'XXXX-XX-XX', 'WAITING', 5000),
	(22, 7, 1, 'XXXX-XX-XX', 'WAITING', 5000),
	(23, 7, 1, 'XXXX-XX-XX', 'WAITING', 5000);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;


-- Дамп структуры для таблица rentacar.users
CREATE TABLE IF NOT EXISTS `users` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(100) NOT NULL DEFAULT '0',
  `password` varchar(100) NOT NULL DEFAULT '0',
  `user_role` varchar(100) NOT NULL DEFAULT '0',
  `first_name` varchar(100) NOT NULL DEFAULT '0',
  `last_name` varchar(100) NOT NULL DEFAULT '0',
  `passport` varchar(100) NOT NULL DEFAULT '0',
  `phone_number` varchar(100) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы rentacar.users: ~4 rows (приблизительно)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id_user`, `email`, `password`, `user_role`, `first_name`, `last_name`, `passport`, `phone_number`) VALUES
	(1, 'email@tut.by', '123', 'USER', 'Igor', 'Petrov', 'MP1112233', '+375291234567'),
	(2, 'prog@tut.by', '123', 'USER', 'Grisha', 'Semenov', 'HB9865712', '+375447895214'),
	(6, 'tut@gmail.com', '123', 'USER', 'Стругачёв', 'Валентин', 'MP9998872', '+375299998877'),
	(7, 'admin@a.a', '123', 'ADMIN', 'Markovich', 'Eugene', '0', '0');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
