-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Gép: localhost
-- Létrehozás ideje: 2022. Feb 05. 16:02
-- Kiszolgáló verziója: 10.3.29-MariaDB-0+deb10u1
-- PHP verzió: 7.4.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `c31g202121`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `Airport_info`
--

CREATE TABLE `Airport_info` (
  `Country_Id` varchar(14) NOT NULL,
  `Airport_Name` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `Flight_cancellation`
--

CREATE TABLE `Flight_cancellation` (
  `Customer_id` varchar(8) NOT NULL,
  `Flight_num` varchar(12) NOT NULL,
  `Origin` varchar(16) NOT NULL,
  `Destination` varchar(16) NOT NULL,
  `Flight_name` varchar(12) NOT NULL,
  `Departure_time` time NOT NULL,
  `Arrival_time` time NOT NULL,
  `Seat_num` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `Flight_info`
--

CREATE TABLE `Flight_info` (
  `Flight_num` varchar(12) NOT NULL,
  `Flight_name` varchar(12) NOT NULL,
  `Departure_time` time NOT NULL,
  `Arrival_time` time NOT NULL,
  `Origin_place` varchar(16) NOT NULL,
  `Destination_place` varchar(16) NOT NULL,
  `Num_of_seats` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `Price_info`
--

CREATE TABLE `Price_info` (
  `Class` varchar(12) NOT NULL,
  `Customer_name` varchar(14) NOT NULL,
  `Seat_num` int(4) NOT NULL,
  `Price` int(4) NOT NULL,
  `Flight_num` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `Registration_info`
--

CREATE TABLE `Registration_info` (
  `First Name` varchar(12) NOT NULL,
  `LastName` varchar(12) NOT NULL,
  `Adress` varchar(16) NOT NULL,
  `ContactNo` int(12) NOT NULL,
  `City` varchar(12) NOT NULL,
  `Country` varchar(12) NOT NULL,
  `Gender` varchar(2) NOT NULL,
  `Email_Id` varchar(12) NOT NULL,
  `Customer_id` varchar(8) NOT NULL,
  `Customer_Password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `Airport_info`
--
ALTER TABLE `Airport_info`
  ADD PRIMARY KEY (`Airport_Name`);

--
-- A tábla indexei `Flight_cancellation`
--
ALTER TABLE `Flight_cancellation`
  ADD KEY `Customer_id` (`Customer_id`);

--
-- A tábla indexei `Flight_info`
--
ALTER TABLE `Flight_info`
  ADD PRIMARY KEY (`Flight_num`),
  ADD KEY `Destination_place` (`Destination_place`),
  ADD KEY `Origin_place` (`Origin_place`);

--
-- A tábla indexei `Price_info`
--
ALTER TABLE `Price_info`
  ADD KEY `Flight_num` (`Flight_num`);

--
-- A tábla indexei `Registration_info`
--
ALTER TABLE `Registration_info`
  ADD PRIMARY KEY (`Customer_id`),
  ADD UNIQUE KEY `Customer_id` (`Customer_id`),
  ADD KEY `Customer_Password` (`Customer_Password`);

--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `Flight_cancellation`
--
ALTER TABLE `Flight_cancellation`
  ADD CONSTRAINT `Flight_cancellation_ibfk_1` FOREIGN KEY (`Customer_id`) REFERENCES `Registration_info` (`Customer_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Megkötések a táblához `Flight_info`
--
ALTER TABLE `Flight_info`
  ADD CONSTRAINT `Flight_info_ibfk_1` FOREIGN KEY (`Origin_place`) REFERENCES `Airport_info` (`Airport_Name`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Flight_info_ibfk_2` FOREIGN KEY (`Flight_num`) REFERENCES `Price_info` (`Flight_num`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `flight_airport` FOREIGN KEY (`Destination_place`) REFERENCES `Airport_info` (`Airport_Name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
