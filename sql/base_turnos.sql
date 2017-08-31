-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-09-2017 a las 01:08:03
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `base_turnos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente_historial`
--

CREATE TABLE `paciente_historial` (
  `paciente_turno_id` int(11) DEFAULT NULL,
  `descripcion` mediumtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente_turno`
--

CREATE TABLE `paciente_turno` (
  `id` int(11) DEFAULT NULL,
  `persona_id` int(11) NOT NULL,
  `prof_turno_id` int(11) NOT NULL,
  `hora` int(5) NOT NULL,
  `cancelado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id` int(11) DEFAULT NULL,
  `nombre` char(25) NOT NULL,
  `apellido` char(25) NOT NULL,
  `genero` int(1) NOT NULL,
  `dni` int(8) NOT NULL,
  `usuario` char(50) NOT NULL,
  `contraseña` char(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_email`
--

CREATE TABLE `persona_email` (
  `persona_id` int(11) DEFAULT NULL,
  `tipo` int(2) NOT NULL,
  `email` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_especialidad`
--

CREATE TABLE `persona_especialidad` (
  `id` int(1) DEFAULT NULL,
  `nombre` char(25) NOT NULL,
  `persona_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_genero`
--

CREATE TABLE `persona_genero` (
  `id` int(1) DEFAULT NULL,
  `nombre` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_matricula`
--

CREATE TABLE `persona_matricula` (
  `id` int(11) DEFAULT NULL,
  `persona_id` int(11) NOT NULL,
  `matricula` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_telefono`
--

CREATE TABLE `persona_telefono` (
  `matricula` int(10) DEFAULT NULL,
  `tipo` int(2) NOT NULL,
  `tel` char(15) NOT NULL,
  `id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesional_turno`
--

CREATE TABLE `profesional_turno` (
  `persona_id` int(11) NOT NULL,
  `turno_id` int(1) NOT NULL,
  `dia` int(1) NOT NULL,
  `hora_ini` char(5) NOT NULL,
  `hora_fin` char(5) NOT NULL,
  `prof_especialidad` int(3) NOT NULL,
  `fraccion` int(3) NOT NULL,
  `discontinuar` int(1) NOT NULL,
  `id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_email`
--

CREATE TABLE `tipo_email` (
  `id` int(2) DEFAULT NULL,
  `nombre` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_tel`
--

CREATE TABLE `tipo_tel` (
  `id` int(2) DEFAULT NULL,
  `nombre` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno`
--

CREATE TABLE `turno` (
  `id` int(1) DEFAULT NULL,
  `nombre` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
