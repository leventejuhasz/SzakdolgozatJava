-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1:3307
-- Létrehozás ideje: 2022. Feb 27. 20:23
-- Kiszolgáló verziója: 10.4.22-MariaDB
-- PHP verzió: 8.1.2

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
-- Tábla szerkezet ehhez a táblához `registration_info`
--

CREATE TABLE `registration_info` (
  `CustomerId` int(11) NOT NULL,
  `FirstName` varchar(60) NOT NULL,
  `LastName` varchar(60) NOT NULL,
  `Address` varchar(60) NOT NULL,
  `zipCode` int(8) NOT NULL,
  `City` varchar(12) NOT NULL,
  `Country` varchar(12) NOT NULL,
  `phoneNumber` varchar(120) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Email` varchar(69) NOT NULL,
  `CustomerPassword` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- A tábla adatainak kiíratása `registration_info`
--

INSERT INTO `registration_info` (`CustomerId`, `FirstName`, `LastName`, `Address`, `zipCode`, `City`, `Country`, `phoneNumber`, `Gender`, `Email`, `CustomerPassword`) VALUES
(1, 'Juhasz', 'Levente', 'Kecskéd óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '0620 238 6025', 'Man', 'leventejuhasz2002@gmail.com', ''),
(2, 'Juhasz', 'Levente', 'Kecskéd óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '0620 238 6025', 'Woman', 'leventejuhasz2002@gmail.com', ''),
(3, 'Juhasz', 'Levente', 'Kecskéd óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '0620 238 6025', 'Woman', 'leventejuhasz2002@gmail.com', 'Luna0'),
(4, 'Juhasz', 'Levente', 'Kecskéd óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '0620 238 6025', 'Woman', 'leventejuhasz2002@gmail.com', '98E89BBBB4878EC0CC7833F0F91276C2'),
(5, 'Juhász', 'Levente', 'Kecskéd óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '0620 238 6025', 'Man', 'ciga@ciga.hu', 'B9ABDD7E4F97F9CD3C43C72F0D45E10E'),
(10, 'Juhasz', 'Levente', 'Kecskéd óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '0620 238 6025', 'Woman', 'k@h.hu', '4B42D1F541216E6336799F1D9E95EE1B'),
(11, 'Juhasz', 'Levente', 'Kecskéd óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '0620 238 6025', 'Man', 'laca@gmail.hu', '0775B8E55054F7A664796DFDF6373C16'),
(33, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '0620 238 6025jbijhgbiub', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(34, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '0620 238 6025', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(35, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '202386025', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(36, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20238602', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(37, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20238602', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(38, 'Juhasz', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20238602', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(39, 'Juhasz', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20238602', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(40, 'Juhasz', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20238602', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(41, 'Juhasz', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '2023860', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(42, 'Juhasz', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '2023860', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(43, 'Juhasz', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '2023860', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(44, 'Juhasz', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '2023860', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(45, 'Juhasz', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '2023860231', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(46, 'Juhasz', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '2023860231', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(47, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(48, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20 238 6025 2321 3123123123123 ', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(49, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '+36 20 238 6025 ', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(50, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '+36 20 238 6025 ', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(51, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '+36 20 238 6025 ', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(52, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '+36 20 238 6025 ', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(53, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '202386025', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(54, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '+36 20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(55, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '++36 20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(56, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '+4 20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(57, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', ''),
(58, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', 'EAC93FC0E5BFBE34E7EC3AB68738F26E'),
(59, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', 'EAC93FC0E5BFBE34E7EC3AB68738F26E'),
(60, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', 'EAC93FC0E5BFBE34E7EC3AB68738F26E'),
(61, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(62, 'Juhász', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(63, 'Juhasz', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33'),
(64, 'Juhasz', 'Levente', ' óvoda utca 23.', 1232, 'Kecskéd', 'Hungary', '20 238 6025', 'Man', 'leventejuhasz2002@gmail.com', '7C13CCA5BE06513317E5310CD3F67A33');

--
-- Indexek a kiírt táblákhoz
--

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
  MODIFY `CustomerId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
