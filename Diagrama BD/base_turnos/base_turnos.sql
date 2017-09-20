-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-09-2017 a las 01:54:49
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
  `id` int(11) NOT NULL,
  `paciente_turno_id` int(11) DEFAULT NULL,
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='fk_paciente_turno_prof_turno_id_profesional_turno';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `nombre` char(25) NOT NULL,
  `apellido` char(25) NOT NULL,
  `dni` int(8) NOT NULL,
  `persona_genero_id` int(2) NOT NULL,
  `usuario` char(50) NOT NULL,
  `contraseña` char(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_email`
--

CREATE TABLE `persona_email` (
  `id` int(2) NOT NULL,
  `persona_id` int(11) NOT NULL,
  `tipo_email` int(2) NOT NULL,
  `email` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_especialidad`
--

CREATE TABLE `persona_especialidad` (
  `id` int(1) NOT NULL,
  `persona_id` int(11) NOT NULL,
  `nombre` char(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_genero`
--

CREATE TABLE `persona_genero` (
  `id` int(2) NOT NULL,
  `nombre` char(15) NOT NULL,
  `persona_id` int(11) NOT NULL
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
  `id` int(10) NOT NULL,
  `persona_id` int(11) NOT NULL,
  `tipo_tel_id` int(2) NOT NULL,
  `tel` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesional_turno`
--

CREATE TABLE `profesional_turno` (
  `id` int(11) NOT NULL,
  `persona_genero_id` int(2) NOT NULL,
  `turno_id` int(2) NOT NULL,
  `persona_especialidad_id` int(1) NOT NULL,
  `persona_id` int(11) NOT NULL,
  `dia` int(1) NOT NULL,
  `hora_ini` char(5) NOT NULL,
  `hora_fin` char(5) NOT NULL,
  `fraccion` int(3) NOT NULL,
  `discontinuar` int(1) NOT NULL,
  `consultorio` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_email`
--

CREATE TABLE `tipo_email` (
  `id` int(2) NOT NULL,
  `nombre` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='fk_persona_email_tipo_email_id_tipo_email';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_tel`
--

CREATE TABLE `tipo_tel` (
  `id` int(2) NOT NULL,
  `nombre` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='fk_persona_telefono_tipo_tel_id_tipo_tel';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno`
--

CREATE TABLE `turno` (
  `id` int(2) NOT NULL,
  `nombre` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `paciente_historial`
--
ALTER TABLE `paciente_historial`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `paciente_turno_id` (`paciente_turno_id`);

--
-- Indices de la tabla `paciente_turno`
--
ALTER TABLE `paciente_turno`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `persona_id` (`persona_id`),
  ADD UNIQUE KEY `prof_turno_id` (`prof_turno_id`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `persona_genero_id` (`persona_genero_id`);

--
-- Indices de la tabla `persona_email`
--
ALTER TABLE `persona_email`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `persona_id` (`persona_id`),
  ADD UNIQUE KEY `tipo_email` (`tipo_email`);

--
-- Indices de la tabla `persona_especialidad`
--
ALTER TABLE `persona_especialidad`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `persona_id` (`persona_id`);

--
-- Indices de la tabla `persona_genero`
--
ALTER TABLE `persona_genero`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_persona_genero_persona_id_persona` (`persona_id`);

--
-- Indices de la tabla `persona_matricula`
--
ALTER TABLE `persona_matricula`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `persona_id` (`persona_id`),
  ADD UNIQUE KEY `matricula` (`matricula`);

--
-- Indices de la tabla `persona_telefono`
--
ALTER TABLE `persona_telefono`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `persona_id` (`persona_id`),
  ADD UNIQUE KEY `tipo_tel_id` (`tipo_tel_id`);

--
-- Indices de la tabla `profesional_turno`
--
ALTER TABLE `profesional_turno`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `persona_id` (`persona_id`),
  ADD UNIQUE KEY `turno_id` (`turno_id`),
  ADD UNIQUE KEY `prof_especialidad_id` (`persona_especialidad_id`),
  ADD UNIQUE KEY `persona_genero_id` (`persona_genero_id`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
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
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `persona_especialidad`
--
ALTER TABLE `persona_especialidad`
  MODIFY `id` int(1) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `persona_genero`
--
ALTER TABLE `persona_genero`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `persona_matricula`
--
ALTER TABLE `persona_matricula`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `persona_telefono`
--
ALTER TABLE `persona_telefono`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
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
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `paciente_historial`
--
ALTER TABLE `paciente_historial`
  ADD CONSTRAINT `fk_paciente_historial_paciente_turno_id` FOREIGN KEY (`paciente_turno_id`) REFERENCES `paciente_turno` (`id`);

--
-- Filtros para la tabla `paciente_turno`
--
ALTER TABLE `paciente_turno`
  ADD CONSTRAINT `fk_paciente_turno_persona_id_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  ADD CONSTRAINT `fk_paciente_turno_prof_turno_id` FOREIGN KEY (`prof_turno_id`) REFERENCES `profesional_turno` (`id`);

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `fk_persona_persona_genero_id_persona_genero` FOREIGN KEY (`persona_genero_id`) REFERENCES `persona_genero` (`id`);

--
-- Filtros para la tabla `persona_email`
--
ALTER TABLE `persona_email`
  ADD CONSTRAINT `fk_persona_email_persona_id_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  ADD CONSTRAINT `fk_persona_email_tipo_email_id_tipo_email` FOREIGN KEY (`tipo_email`) REFERENCES `tipo_email` (`id`);

--
-- Filtros para la tabla `persona_especialidad`
--
ALTER TABLE `persona_especialidad`
  ADD CONSTRAINT `fk_persona_especialidad_persona_id_profesional_turno` FOREIGN KEY (`persona_id`) REFERENCES `profesional_turno` (`id`);

--
-- Filtros para la tabla `persona_genero`
--
ALTER TABLE `persona_genero`
  ADD CONSTRAINT `fk_persona_genero_persona_id_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`);

--
-- Filtros para la tabla `persona_matricula`
--
ALTER TABLE `persona_matricula`
  ADD CONSTRAINT `fk_persona_matricula_persona_id_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`);

--
-- Filtros para la tabla `persona_telefono`
--
ALTER TABLE `persona_telefono`
  ADD CONSTRAINT `fk_persona_telefono_persona_id_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  ADD CONSTRAINT `fk_persona_telefono_tipo_tel_id_tipo_tel` FOREIGN KEY (`tipo_tel_id`) REFERENCES `tipo_tel` (`id`);

--
-- Filtros para la tabla `profesional_turno`
--
ALTER TABLE `profesional_turno`
  ADD CONSTRAINT `fk_persona_especialidad_id_persona_especialidad` FOREIGN KEY (`persona_especialidad_id`) REFERENCES `persona_especialidad` (`id`),
  ADD CONSTRAINT `fk_profesional_turno_persona_genero_id_persona_genero` FOREIGN KEY (`persona_genero_id`) REFERENCES `persona_genero` (`id`),
  ADD CONSTRAINT `fk_profesional_turno_turno_id_turno` FOREIGN KEY (`turno_id`) REFERENCES `turno` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
