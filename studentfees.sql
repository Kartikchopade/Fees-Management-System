-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 05, 2021 at 04:32 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentfees`
--

-- --------------------------------------------------------

--
-- Stand-in structure for view `fees`
-- (See below for the actual view)
--
CREATE TABLE `fees` (
`Student_Id` int(20)
,`Full_Name` varchar(62)
,`Mobile_No` varchar(13)
,`Course` varchar(20)
,`Batch` varchar(20)
,`Date` date
,`Total_Fees` int(30)
,`First_Installment` int(30)
,`Second_Installment` int(30)
,`Third_Installment` int(30)
,`Balance` int(30)
);

-- --------------------------------------------------------

--
-- Table structure for table `feestructure`
--

CREATE TABLE `feestructure` (
  `Student_Id` int(20) NOT NULL,
  `First_Name` varchar(20) NOT NULL,
  `Middle_Name` varchar(20) NOT NULL,
  `Last_Name` varchar(20) NOT NULL,
  `Mobile_No` varchar(13) NOT NULL,
  `Course` varchar(20) NOT NULL,
  `Batch` varchar(20) NOT NULL,
  `Date` date NOT NULL,
  `Total_Fees` int(30) NOT NULL,
  `First_Installment` int(30) NOT NULL,
  `Second_Installment` int(30) NOT NULL,
  `Third_Installment` int(30) NOT NULL,
  `Balance` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feestructure`
--

INSERT INTO `feestructure` (`Student_Id`, `First_Name`, `Middle_Name`, `Last_Name`, `Mobile_No`, `Course`, `Batch`, `Date`, `Total_Fees`, `First_Installment`, `Second_Installment`, `Third_Installment`, `Balance`) VALUES
(1, 'harshal', 'parag', 'naphade', '9067145519', 'Advance Java', '10:00 Am To 11:00 Am', '2020-06-05', 15000, 5000, 3000, 7000, 0),
(2, 'harsha', 'ashok', 'chopade', '7350721353', 'Python', '1:00 Pm To 2:00 Pm', '2019-12-10', 20000, 10000, 5000, 5000, 0),
(3, 'tejas', 'ashok', 'karande', '9881702030', 'Advance Java', '5:30 Pm To 6:30 Pm', '2020-12-30', 15000, 4000, 7000, 0, 4000),
(4, 'bhawesh', 'ajay', 'ranbhore', '9822203432', 'Advance Java', '11:00 Am To 12:00 Pm', '2020-02-20', 15000, 5000, 5000, 5000, 0),
(5, 'nishant', 'ashok', 'chopade', '9067145519', 'Advance Java', '9:00 Am To 10:00 Am', '2020-05-26', 20000, 10000, 5000, 0, 5000),
(6, 'nikhil', 'nivrutti', 'wane', '9158611071', 'HTML', '8:30 Pm To 9:30 Pm', '2021-02-18', 10000, 4000, 0, 0, 6000),
(7, 'prajwal', 'bhanudas', 'kinge', '7448284489', '.NET', '8:00 Am To 9:00 Am', '2018-05-01', 10000, 2000, 5000, 0, 3000),
(8, 'manish', 'parag', 'naphade', '1234567890', 'Core Java', '1:00 Pm To 2:00 Pm', '2021-06-07', 12000, 2000, 5000, 5000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Stand-in structure for view `stud`
-- (See below for the actual view)
--
CREATE TABLE `stud` (
`Student_Id` int(11)
,`Full_Name` varchar(62)
,`DOB` date
,`Address` varchar(100)
,`Mobile_No` varchar(20)
,`Course` varchar(20)
,`Batch` varchar(20)
);

-- --------------------------------------------------------

--
-- Table structure for table `studentinfo`
--

CREATE TABLE `studentinfo` (
  `Student_Id` int(11) NOT NULL,
  `First_Name` char(20) NOT NULL,
  `Middle_Name` char(20) NOT NULL,
  `Last_Name` char(20) NOT NULL,
  `DOB` date NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Mobile_No` varchar(20) NOT NULL,
  `Course` varchar(20) NOT NULL,
  `Batch` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentinfo`
--

INSERT INTO `studentinfo` (`Student_Id`, `First_Name`, `Middle_Name`, `Last_Name`, `DOB`, `Address`, `Mobile_No`, `Course`, `Batch`) VALUES
(1, 'harshal', 'parag', 'naphade', '1997-09-17', '105,Mayapuri Apt, shirgon\nbadlapur east', '9067145519', 'Advance Java', '10:00 Am To 11:00 Am'),
(2, 'harsha', 'ashok', 'chopade', '1999-04-10', '101,seva dham,yadav nager,\nbadlapur east', '7350721353', 'Python', '1:00 Pm To 2:00 Pm'),
(3, 'tejas', 'ashok', 'karande', '1998-08-04', '105,thanekar hillcrast,mauli chowk,\nadlapur east', '9881702030', 'Advance Java', '5:30 Pm To 6:30 Pm'),
(4, 'bhawesh', 'ajay', 'ranbhore', '1998-07-23', '102,mayapuri,apt,yadav,nager,\nbadlapur east', '9822203432', 'Advance Java', '11:00 Am To 12:00 Pm'),
(5, 'nishant', 'ashok', 'chopade', '1999-05-12', 'kharabadi Ta: Motala\nDist: Buldhana', '9067145519', 'Advance Java', '9:00 Am To 10:00 Am'),
(6, 'nikhil', 'nivrutti', 'wane', '1997-09-01', 'kharabadi', '9158611071', 'HTML', '8:30 Pm To 9:30 Pm'),
(7, 'prajwal', 'bhanudas', 'kinge', '2014-09-02', 'kharbadi', '7448284489', '.NET', '8:00 Am To 9:00 Am'),
(8, 'manish', 'parag', 'naphade', '2005-03-04', 'kharbadi', '1234567890', 'Core Java', '1:00 Pm To 2:00 Pm');

-- --------------------------------------------------------

--
-- Structure for view `fees`
--
DROP TABLE IF EXISTS `fees`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `fees`  AS  select `feestructure`.`Student_Id` AS `Student_Id`,concat(`feestructure`.`First_Name`,' ',`feestructure`.`Middle_Name`,' ',`feestructure`.`Last_Name`) AS `Full_Name`,`feestructure`.`Mobile_No` AS `Mobile_No`,`feestructure`.`Course` AS `Course`,`feestructure`.`Batch` AS `Batch`,`feestructure`.`Date` AS `Date`,`feestructure`.`Total_Fees` AS `Total_Fees`,`feestructure`.`First_Installment` AS `First_Installment`,`feestructure`.`Second_Installment` AS `Second_Installment`,`feestructure`.`Third_Installment` AS `Third_Installment`,`feestructure`.`Balance` AS `Balance` from `feestructure` ;

-- --------------------------------------------------------

--
-- Structure for view `stud`
--
DROP TABLE IF EXISTS `stud`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `stud`  AS  select `studentinfo`.`Student_Id` AS `Student_Id`,concat(`studentinfo`.`First_Name`,' ',`studentinfo`.`Middle_Name`,' ',`studentinfo`.`Last_Name`) AS `Full_Name`,`studentinfo`.`DOB` AS `DOB`,`studentinfo`.`Address` AS `Address`,`studentinfo`.`Mobile_No` AS `Mobile_No`,`studentinfo`.`Course` AS `Course`,`studentinfo`.`Batch` AS `Batch` from `studentinfo` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `feestructure`
--
ALTER TABLE `feestructure`
  ADD PRIMARY KEY (`Student_Id`);

--
-- Indexes for table `studentinfo`
--
ALTER TABLE `studentinfo`
  ADD PRIMARY KEY (`Student_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `studentinfo`
--
ALTER TABLE `studentinfo`
  MODIFY `Student_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
