-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 24, 2017 at 04:08 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `p3_java`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_cuaca`
--

CREATE TABLE `t_cuaca` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `nama_kota` varchar(50) NOT NULL,
  `suhu` double NOT NULL,
  `suhu_maks` double NOT NULL,
  `suhu_min` double NOT NULL,
  `kecepatan_angin` double NOT NULL,
  `kelembapan` double NOT NULL,
  `tekanan_udara` double NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_cuaca`
--

INSERT INTO `t_cuaca` (`id`, `date`, `nama_kota`, `suhu`, `suhu_maks`, `suhu_min`, `kecepatan_angin`, `kelembapan`, `tekanan_udara`, `status`) VALUES
(1, '2017-08-09', 'Bandung', 30, 34, 20, 123, 21, 12, 'cerah'),
(2, '2017-08-24', 'Jakarta', 40, 50, 30, 120, 11, 22, 'hujan'),
(7, '2017-08-20', 'Surabaya', 30, 40, 27, 200, 100, 12, 'cerah'),
(8, '2017-08-23', 'Bali', 34, 40, 20, 90, 33, 44, 'mendung'),
(9, '2017-08-23', 'Bandung', 33, 40, 27, 80, 33, 19, 'berawan'),
(10, '2017-08-22', 'Surabaya', 22, 33, 11, 50, 27, 72, 'berawan'),
(11, '2017-08-01', 'Semarang', 20, 10, 30, 90, 43, 56, 'cerah'),
(13, '2017-08-23', 'Jayapura', 30, 33, 26, 44, 12, 11, 'mendung');

-- --------------------------------------------------------

--
-- Table structure for table `t_user`
--

CREATE TABLE `t_user` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `level` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_user`
--

INSERT INTO `t_user` (`id_user`, `nama`, `username`, `password`, `level`) VALUES
(1, 'Admin Sistem', 'admin', 'admin', 'admin'),
(2, 'Regy Mahmud Azis', 'regy', 'regy', 'user'),
(11, 'Bpk Hanhan', 'dosen', 'dosen', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_cuaca`
--
ALTER TABLE `t_cuaca`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `t_user`
--
ALTER TABLE `t_user`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t_cuaca`
--
ALTER TABLE `t_cuaca`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `t_user`
--
ALTER TABLE `t_user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
