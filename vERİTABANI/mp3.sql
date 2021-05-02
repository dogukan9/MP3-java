-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 08 May 2019, 00:20:45
-- Sunucu sürümü: 10.1.38-MariaDB
-- PHP Sürümü: 7.2.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `mp`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `mp3`
--

CREATE TABLE `mp3` (
  `id` int(11) NOT NULL,
  `ad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `mp3`
--

INSERT INTO `mp3` (`id`, `ad`) VALUES
(1, 'Shakira-Loca Loca.mp3'),
(2, 'Fisher - Losing It '),
(3, 'KVSH & Beowulf & Flakke Me Gusta'),
(4, 'Ilkay Sencan - What You Want'),
(5, 'Sofi Tukker - Batshit '),
(6, 'Deeperise feat. Jabbar - One By One'),
(7, 'Dropgun - Krishna'),
(8, 'Gece Yolcuları-pişmanım'),
(9, 'Manuş Baba-Sallaya Sallaya'),
(10, 'Ömür Gedik-Güneş Seninle Doğar'),
(11, 'Athena - Bu Adam Fezadan'),
(12, 'Athena - Holigan '),
(13, 'Barış Manço - Dönence '),
(14, 'Barış Akarsu - Rüzgar'),
(15, 'Erdem Yener - Gece'),
(16, 'Feridun Düzağaç - Beni Bırakma'),
(17, 'Emre Aydın - Afili Yalnızlık'),
(18, 'Gece - Ben Öldüm'),
(19, 'Thom Yorke-Hearing Damage.mp3');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `mp3`
--
ALTER TABLE `mp3`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `mp3`
--
ALTER TABLE `mp3`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
