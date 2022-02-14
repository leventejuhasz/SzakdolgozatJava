-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1:3307
-- Létrehozás ideje: 2022. Feb 14. 09:27
-- Kiszolgáló verziója: 10.4.22-MariaDB
-- PHP verzió: 7.4.27

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
-- Tábla szerkezet ehhez a táblához `airport_info`
--

CREATE TABLE `airport_info` (
  `Country_Id` varchar(14) NOT NULL,
  `Airport_Name` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `flight_cancellation`
--

CREATE TABLE `flight_cancellation` (
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
-- Tábla szerkezet ehhez a táblához `flight_info`
--

CREATE TABLE `flight_info` (
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
-- Tábla szerkezet ehhez a táblához `price_info`
--

CREATE TABLE `price_info` (
  `Class` varchar(12) NOT NULL,
  `Customer_name` varchar(14) NOT NULL,
  `Seat_num` int(4) NOT NULL,
  `Price` int(4) NOT NULL,
  `Flight_num` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `registration_info`
--

CREATE TABLE `registration_info` (
  `CustomerId` int(11) NOT NULL,
  `FirstName` varchar(60) NOT NULL,
  `LastName` varchar(60) NOT NULL,
  `Address` varchar(60) NOT NULL,
  `ContactNo` int(12) NOT NULL,
  `City` varchar(12) NOT NULL,
  `Country` varchar(12) NOT NULL,
  `phoneNumber` varchar(120) NOT NULL,
  `Gender` varchar(3) NOT NULL,
  `Email` varchar(69) NOT NULL,
  `CustomerPassword` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- A tábla adatainak kiíratása `registration_info`
--

INSERT INTO `registration_info` (`CustomerId`, `FirstName`, `LastName`, `Address`, `ContactNo`, `City`, `Country`, `phoneNumber`, `Gender`, `Email`, `CustomerPassword`) VALUES
(1, 'Juhasz', 'Levente', 'Kecskéd óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '0620 238 6025', 'Man', 'leventejuhasz2002@gmail.com', '');

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `airport_info`
--
ALTER TABLE `airport_info`
  ADD PRIMARY KEY (`Airport_Name`);

--
-- A tábla indexei `flight_info`
--
ALTER TABLE `flight_info`
  ADD PRIMARY KEY (`Flight_num`),
  ADD KEY `Destination_place` (`Destination_place`),
  ADD KEY `Origin_place` (`Origin_place`);

--
-- A tábla indexei `price_info`
--
ALTER TABLE `price_info`
  ADD KEY `Flight_num` (`Flight_num`);

--
-- A tábla indexei `registration_info`
--
ALTER TABLE `registration_info`
  ADD PRIMARY KEY (`CustomerId`),
  ADD KEY `Customer_Password` (`CustomerPassword`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `registration_info`
--
ALTER TABLE `registration_info`
  MODIFY `CustomerId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `flight_info`
--
ALTER TABLE `flight_info`
  ADD CONSTRAINT `Flight_info_ibfk_1` FOREIGN KEY (`Origin_place`) REFERENCES `airport_info` (`Airport_Name`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Flight_info_ibfk_2` FOREIGN KEY (`Flight_num`) REFERENCES `price_info` (`Flight_num`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `flight_airport` FOREIGN KEY (`Destination_place`) REFERENCES `airport_info` (`Airport_Name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
