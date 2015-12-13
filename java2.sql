-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2015 at 03:23 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `java2`
--

-- --------------------------------------------------------

--
-- Table structure for table `databarang`
--

CREATE TABLE IF NOT EXISTS `databarang` (
  `tanggalmasuk` varchar(50) NOT NULL,
  `kodebarang` varchar(12) NOT NULL DEFAULT '',
  `nama_barang` varchar(50) NOT NULL,
  `hargabeli` int(30) NOT NULL,
  `hargajual` int(30) NOT NULL,
  `qty` varchar(12) NOT NULL,
  PRIMARY KEY (`kodebarang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `databarang`
--

INSERT INTO `databarang` (`tanggalmasuk`, `kodebarang`, `nama_barang`, `hargabeli`, `hargajual`, `qty`) VALUES
('Sun Dec 13 20:02:06 ICT 2015', '1123102', 'roti kering', 5000, 5500, '80'),
('Sun Dec 13 15:35:42 ICT 2015', '12201', 'karet', 2000, 9000, '860'),
('Sun Dec 13 15:35:42 ICT 2015', '1220133', 'saus abc', 4000, 4500, '50'),
('Sun Dec 13 20:02:06 ICT 2015', '129001', 'santan kara', 5000, 5500, '80'),
('Mon Dec 14 00:00:00 ICT 2015', '129039', 'sambal terasi ABC ', 6700, 7000, '843');

-- --------------------------------------------------------

--
-- Table structure for table `datapelanggan`
--

CREATE TABLE IF NOT EXISTS `datapelanggan` (
  `kode` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tlpn` varchar(15) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datapelanggan`
--

INSERT INTO `datapelanggan` (`kode`, `nama`, `alamat`, `tlpn`) VALUES
('1', 'della', 'indramayu', '0899765644'),
('2', 'puspita', 'indramayu', '089465331'),
('3', 'sasa ramania', 'cilengkrang', '0897765655'),
('4', 'putra', 'cipadung', '0897767556');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE IF NOT EXISTS `karyawan` (
  `NIK` varchar(10) NOT NULL,
  `namalngkp` varchar(35) NOT NULL,
  `almt` varchar(50) NOT NULL,
  `jenis` varchar(10) NOT NULL,
  PRIMARY KEY (`NIK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`NIK`, `namalngkp`, `almt`, `jenis`) VALUES
('1232', 'qoriah', 'cipadung', 'Perempuan'),
('1233', 'asep supritatna', 'cibiru', 'Laki-laki'),
('1234', 'Rara', 'cibiru', 'Perempuan'),
('1235', 'fatmah fadillah', 'soreang', 'Perempuan');

-- --------------------------------------------------------

--
-- Table structure for table `struk`
--

CREATE TABLE IF NOT EXISTS `struk` (
  `no_struk` int(10) NOT NULL AUTO_INCREMENT,
  `kode` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `NIK` varchar(10) NOT NULL,
  `namalngkp` varchar(35) NOT NULL,
  `bayar` int(25) NOT NULL,
  `kembalian` int(25) NOT NULL,
  PRIMARY KEY (`no_struk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `kodebarang` varchar(12) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `hargajual` int(30) NOT NULL,
  `qty` varchar(15) NOT NULL,
  `jumlah` int(15) NOT NULL,
  PRIMARY KEY (`kodebarang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi2`
--

CREATE TABLE IF NOT EXISTS `transaksi2` (
  `kodebarang` varchar(12) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `hargajual` int(30) NOT NULL,
  `qty` varchar(15) NOT NULL,
  `jumlah` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi2`
--

INSERT INTO `transaksi2` (`kodebarang`, `nama_barang`, `hargajual`, `qty`, `jumlah`) VALUES
('1123102', 'roti kering', 5500, '5', 27500),
('1123102', 'roti kering', 5500, '5', 27500),
('12201', 'karet', 9000, '2', 18000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
