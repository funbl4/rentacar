INSERT INTO `fuel_types` (`id_fuel_type`, `name_fuel_type`) VALUES (1, 'Petrol');
INSERT INTO `fuel_types` (`id_fuel_type`, `name_fuel_type`) VALUES (2, 'Diesel');
INSERT INTO `fuel_types` (`id_fuel_type`, `name_fuel_type`) VALUES (3, 'Autogas');
INSERT INTO `fuel_types` (`id_fuel_type`, `name_fuel_type`) VALUES (4, 'Hybrid');

INSERT INTO `body_styles` (`id_body_style`, `name_body_style`) VALUES (1, 'Convertible');
INSERT INTO `body_styles` (`id_body_style`, `name_body_style`) VALUES (2, 'Coupe');
INSERT INTO `body_styles` (`id_body_style`, `name_body_style`) VALUES (3, 'Crossover');
INSERT INTO `body_styles` (`id_body_style`, `name_body_style`) VALUES (4, 'Hatchback');
INSERT INTO `body_styles` (`id_body_style`, `name_body_style`) VALUES (5, 'Minivan');
INSERT INTO `body_styles` (`id_body_style`, `name_body_style`) VALUES (6, 'Sedan');
INSERT INTO `body_styles` (`id_body_style`, `name_body_style`) VALUES (7, 'Wagon');

INSERT INTO `users` (`id_user`, `email`, `first_name`, `last_name`, `passport`, `password`, `phone_number`, `role`) VALUES
	(1, 'a@a.a', 'Admin', 'A-Admin', 'passport', '123', 'phone', 'ADMIN'),
	(3, 'us@us.us', 'User', 'U-User', 'passport', '123', 'phone', 'USER'),
	(4, 'us2@us.us', 'first', 'last', 'passport', '123', 'phone', 'USER');
	
INSERT INTO `cars` (`id_car`, `brand`, `color`, `description`, `model`, `photo`, `price`, `year`, `id_body_style`, `id_fuel_type`) VALUES
	(1, 'AUDI', 'Black', 'The best car', 'S8', 'IMAGE1', 10000, '2015', 1, 2),
	(2, 'BMW', 'Silver', 'MonsterCar', '318', 'IMAGE2', 7500, '2014', 3, 1),
	(3, 'Lada', 'Blue', 'Bad car', '2106', 'image3.jpg', 1000, '1995', 2, 3),
	(4, 'Джили', 'Серый', 'Бел авто', 'СЦ7', 'В гугле', 1000, '2014', 4, 2),
	(6, 'Ford', 'Black', 'Paleh4e', 'Mustang', 'image4.jpg', 9999, '2015', 5, 4),
	(7, 'Nissan', 'Biege', 'Normal', 'Almera', 'image6.jpg', 5000, '2005', 4, 2),
	(8, 'BMW', 'Black', 'Wow auto', '318', 'picture', 2000, '2003', 1, 1),
	(9, 'Москвич', 'Бежевый', 'Просто красавец', '216', 'Нет', 230, '1988', 5, 1);
	
INSERT INTO `orders` (`id_order`, `order_date`, `order_status`, `id_car`, `id_user`) VALUES
	(1, '25-01-2001', 'WAITING', 2, 4),
	(2, '19-02-2001', 'CONFIRMED', 6, 1),
	(3, '05-07-2001', 'CANCELED', 4, 4),
	(4, '29-03-2001', 'WAITING', 2, 1),
	(5, '13-12-2001', 'CONFIRMED', 9, 3);