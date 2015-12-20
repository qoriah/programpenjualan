-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2015 at 07:59 AM
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
  `satuan` varchar(10) NOT NULL,
  PRIMARY KEY (`kodebarang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `databarang`
--

INSERT INTO `databarang` (`tanggalmasuk`, `kodebarang`, `nama_barang`, `hargabeli`, `hargajual`, `qty`, `satuan`) VALUES
('Tue Dec 15 00:00:00 ICT 2015', '1211121', 'sasa mecin', 4000, 4500, '36', 'Biji'),
('Thu Dec 17 00:00:00 ICT 2015', '122323', 'pentene', 450, 500, '34', 'Sachet'),
('Mon Dec 14 00:00:00 ICT 2015', '12322', 'kecap ABC', 5000, 5500, '20', 'Biji'),
('Thu Dec 17 00:00:00 ICT 2015', '123220', 'tipe-x', 2500, 3000, '1', 'Biji'),
('Tue Dec 15 00:00:00 ICT 2015', '1232231', 'krupuk udang', 7000, 7500, '153', 'Biji'),
('Wed Dec 16 00:00:00 ICT 2015', '1232232', 'pulpen', 1200, 1500, '20', 'Biji'),
('Mon Dec 14 00:00:00 ICT 2015', '12332', 'masako', 3000, 3500, '10', 'Pcs'),
('Thu Dec 17 00:00:00 ICT 2015', '123342', 'bimoli', 230000, 250000, '5', 'Box'),
('Thu Dec 17 00:00:00 ICT 2015', '134220', 'sandal swallow', 10000, 11000, '20', 'Biji'),
('Mon Dec 14 00:00:00 ICT 2015', '2312767', 'bagelen roti kering', 5500, 6000, '50', 'Biji'),
('Tue Dec 15 00:00:00 ICT 2015', '232230', 'taro ciki', 950, 1000, '50', 'Biji'),
('Mon Dec 14 00:00:00 ICT 2015', '232232', 'kecap ABC', 450, 500, '30', 'Sachet'),
('Tue Dec 15 00:00:00 ICT 2015', '2332321', 'taro ciki', 40000, 401000, '5', 'Box'),
('Thu Dec 17 00:00:00 ICT 2015', '23342212', 'pantene shampo', 4500, 5000, '10', 'Biji'),
('Thu Dec 17 00:00:00 ICT 2015', '5433421', 'bimoli minyak', 14000, 14500, '30', 'Biji'),
('Thu Dec 17 00:00:00 ICT 2015', '7666545', 'kripik sukun', 6500, 7000, '40', 'Biji');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `struk`
--

INSERT INTO `struk` (`no_struk`, `kode`, `nama`, `NIK`, `namalngkp`, `bayar`, `kembalian`) VALUES
(2, '2', 'puspita', '1233', 'asep supritatna', 43000, 500);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `tanggal` varchar(30) NOT NULL,
  `kodebarang` varchar(12) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `hargajual` int(30) NOT NULL,
  `qty` varchar(15) NOT NULL,
  `satuan` varchar(10) NOT NULL,
  `jumlah` int(15) NOT NULL,
  PRIMARY KEY (`kodebarang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`tanggal`, `kodebarang`, `nama_barang`, `hargajual`, `qty`, `satuan`, `jumlah`) VALUES
('Tue Dec 15 13:52:12 ICT 2015', '12322', 'kecap ABC', 5500, '5', 'Biji', 27500),
('Tue Dec 15 13:52:12 ICT 2015', '1232232', 'pulpen', 1500, '10', 'Biji', 15000);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi2`
--

CREATE TABLE IF NOT EXISTS `transaksi2` (
  `tanggal` varchar(30) NOT NULL,
  `kodebarang` varchar(12) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `hargajual` int(30) NOT NULL,
  `qty` varchar(15) NOT NULL,
  `satuan` varchar(10) NOT NULL,
  `jumlah` int(15) NOT NULL,
  PRIMARY KEY (`kodebarang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi2`
--

INSERT INTO `transaksi2` (`tanggal`, `kodebarang`, `nama_barang`, `hargajual`, `qty`, `satuan`, `jumlah`) VALUES
('Tue Dec 15 13:02:18 ICT 2015', '1211121', 'sasa mecin', 4500, '4', 'Biji', 18000),
('Tue Dec 15 13:49:00 ICT 2015', '122323', 'pentene', 500, '6', 'Sachet', 3000),
('Tue Dec 15 13:11:54 ICT 2015', '1232231', 'krupuk udang', 7500, '7', 'Biji', 52500);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
