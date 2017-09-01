-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-09-2017 a las 02:13:53
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
  `paciente_turno_id` int(11) NOT NULL,
  `descripcion` mediumtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente_turno`
--

CREATE TABLE `paciente_turno` (
  `id` int(11) NOT NULL,
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
  `id` int(11) NOT NULL,
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
  `persona_id` int(11) NOT NULL,
  `tipo` int(2) NOT NULL,
  `email` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_especialidad`
--

CREATE TABLE `persona_especialidad` (
  `id` int(1) NOT NULL,
  `nombre` char(25) NOT NULL,
  `persona_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_genero`
--

CREATE TABLE `persona_genero` (
  `id` int(1) NOT NULL,
  `nombre` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_matricula`
--

CREATE TABLE `persona_matricula` (
  `id` int(11) NOT NULL,
  `persona_id` int(11) NOT NULL,
  `matricula` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_telefono`
--

CREATE TABLE `persona_telefono` (
  `matricula` int(10) NOT NULL,
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
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_email`
--

CREATE TABLE `tipo_email` (
  `id` int(2) NOT NULL,
  `nombre` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_tel`
--

CREATE TABLE `tipo_tel` (
  `id` int(2) NOT NULL,
  `nombre` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno`
--

CREATE TABLE `turno` (
  `id` int(1) NOT NULL,
  `nombre` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `paciente_historial`
--
ALTER TABLE `paciente_historial`
  ADD PRIMARY KEY (`paciente_turno_id`);

--
-- Indices de la tabla `paciente_turno`
--
ALTER TABLE `paciente_turno`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `persona_email`
--
ALTER TABLE `persona_email`
  ADD PRIMARY KEY (`persona_id`);

--
-- Indices de la tabla `persona_especialidad`
--
ALTER TABLE `persona_especialidad`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `persona_genero`
--
ALTER TABLE `persona_genero`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `persona_matricula`
--
ALTER TABLE `persona_matricula`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `persona_telefono`
--
ALTER TABLE `persona_telefono`
  ADD PRIMARY KEY (`matricula`);

--
-- Indices de la tabla `profesional_turno`
--
ALTER TABLE `profesional_turno`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipo_email`
--
ALTER TABLE `tipo_email`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipo_tel`
--
ALTER TABLE `tipo_tel`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `turno`
--
ALTER TABLE `turno`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `paciente_historial`
--
ALTER TABLE `paciente_historial`
  MODIFY `paciente_turno_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `paciente_turno`
--
ALTER TABLE `paciente_turno`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `persona_email`
--
ALTER TABLE `persona_email`
  MODIFY `persona_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `persona_especialidad`
--
ALTER TABLE `persona_especialidad`
  MODIFY `id` int(1) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `persona_genero`
--
ALTER TABLE `persona_genero`
  MODIFY `id` int(1) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `persona_matricula`
--
ALTER TABLE `persona_matricula`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `persona_telefono`
--
ALTER TABLE `persona_telefono`
  MODIFY `matricula` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `profesional_turno`
--
ALTER TABLE `profesional_turno`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tipo_email`
--
ALTER TABLE `tipo_email`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tipo_tel`
--
ALTER TABLE `tipo_tel`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `turno`
--
ALTER TABLE `turno`
  MODIFY `id` int(1) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
