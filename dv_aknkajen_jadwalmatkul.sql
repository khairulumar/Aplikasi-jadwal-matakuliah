-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 27 Mar 2018 pada 11.33
-- Versi Server: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dv_aknkajen_jadwalmatkul`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akn_gedung`
--

CREATE TABLE `akn_gedung` (
  `kd_gedung` char(3) NOT NULL,
  `nama_gedung` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `akn_gedung`
--

INSERT INTO `akn_gedung` (`kd_gedung`, `nama_gedung`) VALUES
('G01', 'Kampus 1'),
('G02', 'Kampus 2');

-- --------------------------------------------------------

--
-- Struktur dari tabel `akn_jurusan`
--

CREATE TABLE `akn_jurusan` (
  `kd_jur` char(3) NOT NULL,
  `jurusan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `akn_jurusan`
--

INSERT INTO `akn_jurusan` (`kd_jur`, `jurusan`) VALUES
('J01', 'Teknik Komputer dan Informatika'),
('J02', 'Teknik Kimia Tekstil'),
('J03', 'Teknik Mesin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `akn_kelas`
--

CREATE TABLE `akn_kelas` (
  `kd_prodi` char(3) NOT NULL,
  `kelas` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `akn_kelas`
--

INSERT INTO `akn_kelas` (`kd_prodi`, `kelas`) VALUES
('153', '1A'),
('153', '1B'),
('153', '2A'),
('153', '2B');

-- --------------------------------------------------------

--
-- Struktur dari tabel `akn_prodi`
--

CREATE TABLE `akn_prodi` (
  `kd_prodi` char(3) NOT NULL,
  `kd_jur` char(3) NOT NULL,
  `prodi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `akn_prodi`
--

INSERT INTO `akn_prodi` (`kd_prodi`, `kd_jur`, `prodi`) VALUES
('125', 'J03', 'D2 Teknik Mesin'),
('144', 'J02', 'D2 Teknik Kimia'),
('153', 'J01', 'D2 Teknik Informatika');

-- --------------------------------------------------------

--
-- Struktur dari tabel `akn_ruang`
--

CREATE TABLE `akn_ruang` (
  `kd_gedung` char(3) NOT NULL,
  `kd_jur` char(3) NOT NULL,
  `kd_ruang` char(6) NOT NULL,
  `nama_ruang` varchar(25) NOT NULL,
  `warna_ruang` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `akn_ruang`
--

INSERT INTO `akn_ruang` (`kd_gedung`, `kd_jur`, `kd_ruang`, `nama_ruang`, `warna_ruang`) VALUES
('G01', 'J01', 'G01.01', 'Lab 1 RPL', ''),
('G01', 'J01', 'G01.02', 'Lab 2 RPL', ''),
('G01', 'J02', 'G01.03', 'Lab Kimia Tekstil', ''),
('G01', 'J02', 'G01.04', 'Lab Kimia Analitik', ''),
('G01', 'J02', 'G01.05', 'Lab Industri Tekstil', ''),
('G01', 'J02', 'G01.06', 'R. Teori 1 Teknik Kimia', ''),
('G01', 'J03', 'G01.07', 'Lab Teknologi Mekanik', ''),
('G01', 'J03', 'G01.08', 'Lab Listrik', ''),
('G01', 'J03', 'G01.09', 'Lab CAD', ''),
('G02', 'J01', 'G02.01', 'R. Teori 1 RPL', ''),
('G02', 'J02', 'G02.02', 'R. Teori 2 Teknik Kimia', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `akn_thajaran`
--

CREATE TABLE `akn_thajaran` (
  `id_th` int(4) NOT NULL,
  `tahun_ajaran` varchar(9) NOT NULL,
  `semester` enum('Gasal','Genap') NOT NULL,
  `sta_aktif` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `akn_thajaran`
--

INSERT INTO `akn_thajaran` (`id_th`, `tahun_ajaran`, `semester`, `sta_aktif`) VALUES
(1, '2014-2015', 'Gasal', 0),
(2, '2014-2015', 'Genap', 0),
(3, '2015-2016', 'Gasal', 0),
(4, '2015-2016', 'Genap', 0),
(5, '2016-2017', 'Gasal', 0),
(6, '2016-2017', 'Genap', 0),
(7, '2017-2018', 'Gasal', 0),
(8, '2017-2018', 'Genap', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `akn_user`
--

CREATE TABLE `akn_user` (
  `id_user` char(9) NOT NULL,
  `nama_user` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `lev_user` varchar(20) NOT NULL,
  `foto` mediumblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `akn_user`
--

INSERT INTO `akn_user` (`id_user`, `nama_user`, `pass`, `lev_user`, `foto`) VALUES
('ID001', 'TU AKN Kajen 1', '21232f297a57a5a743894a0e4a801fc3', 'Tata Usaha', ''),
('ID002', 'Atik Rusmiati', '202cb962ac59075b964b07152d234b70', 'Tata Usaha', ''),
('ID003', 'Anom Sejogati', 'd923721a4cdc11c435f7609dcecb864c', 'Dosen', 0x6434316438636439386630306232303465393830303939386563663834323765);

-- --------------------------------------------------------

--
-- Struktur dari tabel `mk_jadwalmk`
--

CREATE TABLE `mk_jadwalmk` (
  `id_th` int(4) NOT NULL,
  `semester` int(2) NOT NULL,
  `kd_prodi` char(3) NOT NULL,
  `kelas` varchar(5) NOT NULL,
  `id_user` char(9) NOT NULL,
  `hari` varchar(10) NOT NULL,
  `id_sj` int(11) NOT NULL,
  `kd_mk` char(9) NOT NULL,
  `nip` varchar(18) NOT NULL,
  `kd_ruang` char(6) NOT NULL,
  `walikelas` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `mk_kelompokmk`
--

CREATE TABLE `mk_kelompokmk` (
  `kd_kmk` char(4) NOT NULL,
  `kelompok_mk` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mk_kelompokmk`
--

INSERT INTO `mk_kelompokmk` (`kd_kmk`, `kelompok_mk`) VALUES
('MKI', 'MATA KULIAH INSTITUSI'),
('MKJ', 'MATA KULIAH JURUSAN'),
('MKN', 'MATA KULIAH NASIONAL'),
('MKP', 'MATA KULIAH PROGRAM STUDI');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mk_matakuliah`
--

CREATE TABLE `mk_matakuliah` (
  `kd_mk` char(9) NOT NULL,
  `kd_kmk` char(4) NOT NULL,
  `tahun_kur` int(4) NOT NULL,
  `kd_prodi` char(3) NOT NULL,
  `nama_mk` varchar(60) NOT NULL,
  `semester` int(2) NOT NULL,
  `sks_t` int(1) NOT NULL,
  `sks_p` int(1) NOT NULL,
  `jam_t` float NOT NULL,
  `jam_p` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mk_matakuliah`
--

INSERT INTO `mk_matakuliah` (`kd_mk`, `kd_kmk`, `tahun_kur`, `kd_prodi`, `nama_mk`, `semester`, `sks_t`, `sks_p`, `jam_t`, `jam_p`) VALUES
('16JKI1062', 'MKJ', 2016, '144', 'Matematika Terapan', 1, 1, 1, 1, 3),
('16JKI1073', 'MKJ', 2016, '144', 'Kimia Fisik', 1, 1, 2, 1, 4),
('16JTK133', 'MKJ', 2016, '153', 'Matematika 1', 1, 2, 1, 2, 2),
('16JTK222', 'MKJ', 2016, '153', 'Pengantar Akuntansi dan Keuangan', 2, 2, 0, 2, 0),
('16JTK233', 'MKJ', 2016, '153', 'Matematika 2', 2, 2, 1, 2, 2),
('16JTK353', 'MKJ', 2016, '153', 'Arsitektur Komputer dan Jaringan', 3, 1, 2, 1, 4),
('16JTM0122', 'MKJ', 2016, '125', 'Matematika', 1, 2, 0, 4, 0),
('16kI11032', 'MKI', 2016, '144', 'Bahasa Inggris', 2, 1, 1, 1, 3),
('16KI1123', 'MKI', 2016, '153', 'Bahasa Inggris', 1, 2, 1, 2, 2),
('16KI3372', 'MKI', 2016, '153', 'Kewirausahaan', 3, 2, 0, 2, 0),
('16KI34013', 'MKI', 2016, '144', 'Kewirausahaan', 4, 1, 2, 1, 4),
('16KU11012', 'MKN', 2016, '144', 'Pendidikan Agama', 1, 1, 1, 1, 3),
('16KU1212', 'MKN', 2016, '153', 'Pendidikan Agama', 2, 2, 0, 2, 0),
('16KU21022', 'MKN', 2016, '144', 'Pendidikan Pancasila', 1, 2, 0, 2, 0),
('16KU2312', 'MKN', 2016, '153', 'Pendidikan Pancasila', 3, 2, 0, 2, 0),
('16KU32012', 'MKN', 2016, '144', 'Pendidikan Kewarganegaraan(PKN)', 2, 2, 0, 2, 0),
('16KU4113', 'MKI', 2016, '153', 'Bahasa Indonesia', 1, 2, 1, 2, 2),
('16KU43012', 'MKN', 2016, '144', 'Bahasa Indonesia', 2, 1, 1, 1, 3),
('16RPL142', 'MKP', 2016, '153', 'Pengantar Manajemen Produksi', 1, 1, 1, 1, 2),
('16RPL152', 'MKP', 2016, '153', 'Pengantar Teknologi Tekstil', 1, 1, 1, 1, 2),
('16RPL164', 'MKP', 2016, '153', 'Pengantar Kerekayasaan Perangkat Lunak dan Ilmu Komputer', 1, 2, 2, 2, 4),
('16RPL173', 'MKP', 2016, '153', 'Proyek 1', 1, 0, 3, 0, 9),
('16RPL243', 'MKP', 2016, '153', 'Pemrograman 1', 2, 1, 2, 1, 4),
('16RPL253', 'MKP', 2016, '153', 'Perangkat Lunak Pengelolaan Sumber Daya Perusahaan 1', 2, 1, 2, 1, 4),
('16RPL263', 'MKP', 2016, '153', 'Pengantar Basis Data', 2, 1, 2, 1, 4),
('16RPL273', 'MKP', 2016, '153', 'Proyek 2', 2, 0, 3, 0, 9),
('16RPL322', 'MKP', 2016, '153', 'Rekayasa Perangkat Lunak 1', 3, 1, 1, 2, 2),
('16RPL333', 'MKP', 2016, '153', 'Pemrograman 2', 3, 1, 2, 1, 4),
('16RPL343', 'MKP', 2016, '153', 'Konsep Basis Data', 3, 1, 2, 1, 4),
('16RPL363', 'MKP', 2016, '153', 'Perangkat Lunak Pengelolaan Sumber Daya Perusahaan 2', 3, 1, 2, 1, 4),
('16RPL383', 'MKP', 2016, '153', 'Proyek 3', 3, 0, 3, 0, 9),
('16RPL484', 'MKP', 2016, '153', 'Proyek 4 (Proyek Akhir)', 4, 1, 3, 1, 9),
('16TKT1012', 'MKP', 2016, '144', 'Pengantar Teknologi Tekstil', 1, 1, 1, 1, 3),
('16TKT1022', 'MKP', 2016, '144', 'Pengantar Kimia Tekstil', 1, 1, 1, 1, 3),
('16TKT1033', 'MKP', 2016, '144', 'Kimia Umum', 1, 1, 2, 1, 3),
('16TKT1043', 'MKJ', 2016, '144', 'Kimia Analitik Dasar', 1, 1, 2, 1, 4),
('16TKT1052', 'MKI', 2016, '144', 'K3', 1, 1, 1, 1, 3),
('16TKT2013', 'MKP', 2016, '144', 'Kimia Zat Warna', 2, 1, 2, 1, 4),
('16TKT2022', 'MKP', 2016, '144', 'Zat Pembantu Tekstil', 2, 1, 1, 1, 3),
('16TKT2033', 'MKP', 2016, '144', 'Serat Tekstil', 2, 1, 2, 1, 4),
('16TKT2042', 'MKP', 2016, '144', 'Desain Tekstil', 2, 1, 1, 1, 3),
('16TKT2053', 'MKP', 2016, '144', 'Teknologi Penyempurnaan', 2, 1, 2, 1, 4),
('16TKT2062', 'MKP', 2016, '144', 'Komputer Terapan', 2, 0, 2, 0, 4),
('16TKT3013', 'MKP', 2016, '144', 'Teknologi Pencelupan', 3, 1, 2, 1, 4),
('16TKT3023', 'MKP', 2016, '144', 'Teknologi Pencapan', 3, 1, 2, 1, 4),
('16TKT3033', 'MKP', 2016, '144', 'Pengujian dan Evaluasi Tekstil', 3, 1, 2, 1, 4),
('16TKT3042', 'MKP', 2016, '144', 'Teknik Produksi Tekstil', 3, 1, 1, 1, 3),
('16TKT3052', 'MKP', 2016, '144', 'Pengendalian Mutu', 3, 1, 1, 1, 3),
('16TKT3063', 'MKP', 2016, '144', 'Utilitas', 3, 1, 2, 1, 4),
('16TKT3072', 'MKP', 2016, '144', 'Kalkulasi Biaya', 3, 1, 1, 1, 3),
('16TKT3082', 'MKJ', 2016, '144', 'Statistika', 3, 1, 1, 1, 3),
('16TKT4012', 'MKP', 2016, '144', 'Manajemen dan Psikologi Industri', 4, 2, 0, 2, 0),
('16TKT4024', 'MKP', 2016, '144', 'Kerja Praktik', 4, 0, 4, 0, 13.6),
('16TKT4035', 'MKP', 2016, '144', 'Tugas Akhir', 4, 0, 5, 0, 17);

-- --------------------------------------------------------

--
-- Struktur dari tabel `mk_setjam`
--

CREATE TABLE `mk_setjam` (
  `id_sj` int(11) NOT NULL,
  `kd_prodi` char(3) NOT NULL,
  `id_th` int(4) NOT NULL,
  `jam_ke` tinyint(1) NOT NULL,
  `jam_mulai` time NOT NULL,
  `jam_selesai` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mk_setjam`
--

INSERT INTO `mk_setjam` (`id_sj`, `kd_prodi`, `id_th`, `jam_ke`, `jam_mulai`, `jam_selesai`) VALUES
(1, '153', 7, 1, '07:00:00', '07:50:00'),
(2, '153', 7, 2, '07:50:00', '08:40:00'),
(3, '153', 7, 3, '08:40:00', '09:00:00'),
(4, '153', 7, 4, '09:00:00', '09:50:00'),
(5, '153', 7, 5, '09:50:00', '10:40:00'),
(6, '153', 7, 6, '10:40:00', '11:30:00'),
(7, '153', 7, 7, '11:30:00', '12:20:00'),
(8, '153', 7, 8, '12:20:00', '13:00:00'),
(9, '153', 7, 9, '13:00:00', '13:50:00'),
(10, '153', 7, 10, '13:50:00', '14:40:00'),
(11, '153', 7, 11, '14:40:00', '15:30:00'),
(12, '153', 7, 12, '15:30:00', '16:20:00'),
(13, '153', 7, 13, '16:20:00', '17:10:00'),
(14, '125', 7, 1, '07:00:00', '07:50:00'),
(15, '125', 7, 2, '07:50:00', '08:40:00'),
(16, '125', 7, 3, '08:40:00', '09:30:00'),
(17, '125', 7, 4, '09:50:00', '10:40:00'),
(18, '125', 7, 5, '10:40:00', '11:30:00'),
(19, '125', 7, 6, '11:30:00', '12:20:00'),
(20, '125', 7, 7, '13:00:00', '13:50:00'),
(21, '125', 7, 8, '13:50:00', '14:40:00'),
(22, '125', 7, 9, '14:40:00', '15:30:00'),
(23, '125', 7, 10, '16:00:00', '16:50:00'),
(24, '125', 7, 11, '16:50:00', '17:40:00'),
(25, '144', 7, 1, '07:50:00', '08:40:00'),
(26, '144', 7, 2, '08:40:00', '09:30:00'),
(27, '144', 7, 3, '09:50:00', '10:40:00'),
(28, '144', 7, 4, '10:40:00', '11:30:00'),
(29, '144', 7, 5, '13:00:00', '13:50:00'),
(30, '144', 7, 6, '13:50:00', '14:40:00'),
(31, '144', 7, 7, '14:40:00', '15:30:00'),
(32, '144', 7, 8, '15:50:00', '16:40:00'),
(33, '144', 7, 9, '16:40:00', '17:30:00'),
(34, '144', 7, 10, '17:30:00', '18:20:00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pg_dosen`
--

CREATE TABLE `pg_dosen` (
  `nip` varchar(18) NOT NULL,
  `kd_dosen` char(6) NOT NULL,
  `nama_dosen` varchar(45) NOT NULL,
  `jk` enum('L','P') NOT NULL,
  `tmp_lahir` varchar(25) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `agama` varchar(15) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_telepon` varchar(12) NOT NULL,
  `email` varchar(30) NOT NULL,
  `foto` mediumblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pg_dosen`
--

INSERT INTO `pg_dosen` (`nip`, `kd_dosen`, `nama_dosen`, `jk`, `tmp_lahir`, `tgl_lahir`, `agama`, `alamat`, `no_telepon`, `email`, `foto`) VALUES
('201121212', 'kjuiol', 'aaa', 'L', 'aa', '2018-03-20', 'Islam', 'aa', '087777777777', 'jsjsjs', 0x433a5c55736572735c6b6c6964616e67206c6f725c50696374757265735c3030303030692e6a7067),
('201410001', 'KJ010K', 'Tutut Indah Setyani, S.Pd', 'L', '', '2018-03-20', 'Islam', '', '', '', ''),
('201410002', 'KJ011K', 'Wahyu Widiyanto, S.Pd', 'L', '', '2018-03-12', 'Islam', '', '', '', ''),
('201503001', 'KJ022K', 'Zainudin, S.Pd', 'L', '', '1990-05-06', 'Islam', '', '', '', ''),
('201503002', 'KJ019K', 'Harmoko, S.Pd', 'L', '', '2018-03-12', 'Islam', '', '', '', ''),
('201503008', 'KJ014K', 'Linggar Suwarno Putri, M.Pd', 'P', '', '1988-03-05', 'Islam', '', '', '', ''),
('201503010', 'KJ016K', 'Amaliya Sita Permatasari, S.Si., S.Pd', 'P', '', '1989-04-09', 'Islam', '', '', '', ''),
('201503013', 'KJ018K', 'Futya Millatina, S.Si', 'P', '', '1989-12-26', 'Islam', '', '', '', ''),
('201506002', 'KJ032K', 'Anom Sejogati, S.Kom', 'L', 'Pekalongan', '2018-03-20', 'Islam', '', '', '', ''),
('201509001', 'KJ038K', 'Ika Yuliawati, M.Sc', 'P', '', '1989-08-30', 'Islam', '', '', '', ''),
('201509002', 'KJ039K', 'Candra Wahyu Sportyawan, S.Pd', 'L', 'Pekalongan', '2018-03-12', 'Islam', '', '', '', ''),
('201602001', 'KJ046K', 'M. Rizaludin, M.kom', 'L', 'Pekalongan', '2018-03-12', 'Islam', '', '', '', ''),
('201602002', 'KJ045K', 'Imam Prayogo Pujiono, S.Kom', 'L', 'Pekalongan', '2018-03-12', 'Islam', '', '', '', ''),
('201603001', 'KJ052K', 'Budi Saputro, S.ST', 'L', '', '1990-05-24', 'Islam', '', '', '', ''),
('201609001', 'KJ056K', 'Dicky Anggriawan Nugroho, S.kom', 'L', '', '1993-03-06', 'Islam', '', '', '', ''),
('201609002', 'KJ057K', 'Tri Astuti, M.Pd', 'P', '', '1990-09-15', 'Islam', '', '', '', ''),
('201705001', 'KJ061K', 'Laily Noor Ikhsanto, S.Pd', 'L', 'Pekalongan', '2018-03-12', 'Islam', '', '', '', ''),
('201708006', 'KJ065K', 'Alfian Candra Yudiananta, S.Kom', 'L', 'Temanggung', '2018-03-12', 'Islam', '', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akn_gedung`
--
ALTER TABLE `akn_gedung`
  ADD PRIMARY KEY (`kd_gedung`);

--
-- Indexes for table `akn_jurusan`
--
ALTER TABLE `akn_jurusan`
  ADD PRIMARY KEY (`kd_jur`);

--
-- Indexes for table `akn_kelas`
--
ALTER TABLE `akn_kelas`
  ADD PRIMARY KEY (`kelas`),
  ADD KEY `kd_prodi` (`kd_prodi`);

--
-- Indexes for table `akn_prodi`
--
ALTER TABLE `akn_prodi`
  ADD PRIMARY KEY (`kd_prodi`),
  ADD KEY `kd_jur` (`kd_jur`);

--
-- Indexes for table `akn_ruang`
--
ALTER TABLE `akn_ruang`
  ADD PRIMARY KEY (`kd_ruang`,`kd_gedung`),
  ADD KEY `kd_gedung` (`kd_gedung`),
  ADD KEY `fk_jur2` (`kd_jur`);

--
-- Indexes for table `akn_thajaran`
--
ALTER TABLE `akn_thajaran`
  ADD PRIMARY KEY (`id_th`);

--
-- Indexes for table `akn_user`
--
ALTER TABLE `akn_user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `mk_jadwalmk`
--
ALTER TABLE `mk_jadwalmk`
  ADD PRIMARY KEY (`id_th`,`kelas`,`id_sj`,`kd_mk`,`nip`,`kd_ruang`),
  ADD KEY `kelas` (`kelas`),
  ADD KEY `kd_prodi` (`kd_prodi`),
  ADD KEY `id_sj` (`id_sj`),
  ADD KEY `kd_ruang` (`kd_ruang`),
  ADD KEY `fk_user` (`id_user`),
  ADD KEY `fk_mk` (`kd_mk`),
  ADD KEY `fk_nip` (`nip`),
  ADD KEY `id_th` (`id_th`);

--
-- Indexes for table `mk_kelompokmk`
--
ALTER TABLE `mk_kelompokmk`
  ADD PRIMARY KEY (`kd_kmk`);

--
-- Indexes for table `mk_matakuliah`
--
ALTER TABLE `mk_matakuliah`
  ADD PRIMARY KEY (`kd_mk`,`kd_kmk`,`kd_prodi`),
  ADD KEY `kd_kmk` (`kd_kmk`),
  ADD KEY `kd_prodi` (`kd_prodi`);

--
-- Indexes for table `mk_setjam`
--
ALTER TABLE `mk_setjam`
  ADD PRIMARY KEY (`id_sj`),
  ADD KEY `fk_prodi` (`kd_prodi`),
  ADD KEY `fk_th` (`id_th`);

--
-- Indexes for table `pg_dosen`
--
ALTER TABLE `pg_dosen`
  ADD PRIMARY KEY (`nip`),
  ADD UNIQUE KEY `kd_dosen` (`kd_dosen`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `akn_thajaran`
--
ALTER TABLE `akn_thajaran`
  MODIFY `id_th` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `mk_setjam`
--
ALTER TABLE `mk_setjam`
  MODIFY `id_sj` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `akn_prodi`
--
ALTER TABLE `akn_prodi`
  ADD CONSTRAINT `fk_jur` FOREIGN KEY (`kd_jur`) REFERENCES `akn_jurusan` (`kd_jur`);

--
-- Ketidakleluasaan untuk tabel `akn_ruang`
--
ALTER TABLE `akn_ruang`
  ADD CONSTRAINT `akn_ruang_ibfk_1` FOREIGN KEY (`kd_gedung`) REFERENCES `akn_gedung` (`kd_gedung`),
  ADD CONSTRAINT `fk_jur2` FOREIGN KEY (`kd_jur`) REFERENCES `akn_jurusan` (`kd_jur`);

--
-- Ketidakleluasaan untuk tabel `mk_jadwalmk`
--
ALTER TABLE `mk_jadwalmk`
  ADD CONSTRAINT `fk_mk` FOREIGN KEY (`kd_mk`) REFERENCES `mk_matakuliah` (`kd_mk`),
  ADD CONSTRAINT `fk_nip` FOREIGN KEY (`nip`) REFERENCES `pg_dosen` (`nip`),
  ADD CONSTRAINT `fk_prodi2` FOREIGN KEY (`kd_prodi`) REFERENCES `akn_prodi` (`kd_prodi`),
  ADD CONSTRAINT `fk_th` FOREIGN KEY (`id_th`) REFERENCES `akn_thajaran` (`id_th`),
  ADD CONSTRAINT `fk_user` FOREIGN KEY (`id_user`) REFERENCES `akn_user` (`id_user`),
  ADD CONSTRAINT `mk_jadwalmk_ibfk_2` FOREIGN KEY (`kelas`) REFERENCES `akn_kelas` (`kelas`),
  ADD CONSTRAINT `mk_jadwalmk_ibfk_3` FOREIGN KEY (`id_sj`) REFERENCES `mk_setjam` (`id_sj`),
  ADD CONSTRAINT `mk_jadwalmk_ibfk_6` FOREIGN KEY (`kd_ruang`) REFERENCES `akn_ruang` (`kd_ruang`);

--
-- Ketidakleluasaan untuk tabel `mk_setjam`
--
ALTER TABLE `mk_setjam`
  ADD CONSTRAINT `fk_prodi` FOREIGN KEY (`kd_prodi`) REFERENCES `akn_prodi` (`kd_prodi`),
  ADD CONSTRAINT `fk_th2` FOREIGN KEY (`id_th`) REFERENCES `akn_thajaran` (`id_th`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
