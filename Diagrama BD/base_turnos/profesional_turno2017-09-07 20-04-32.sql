USE base_turnos;

CREATE TABLE `profesional_turno` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `persona_genero_id` int(2) NOT NULL,
  `turno_id` int(2) NOT NULL,
  `persona_especialidad_id` int(1) NOT NULL,
  `persona_id` int(11) NOT NULL,
  `dia` int(1) NOT NULL,
  `hora_ini` char(5) NOT NULL,
  `hora_fin` char(5) NOT NULL,
  `fraccion` int(3) NOT NULL,
  `discontinuar` int(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `persona_id` (`persona_id`),
  UNIQUE KEY `turno_id` (`turno_id`),
  UNIQUE KEY `prof_especialidad_id` (`persona_especialidad_id`),
  UNIQUE KEY `persona_genero_id` (`persona_genero_id`),
  CONSTRAINT `fk_persona_especialidad_id_persona_especialidad` FOREIGN KEY (`persona_especialidad_id`) REFERENCES `persona_especialidad` (`id`),
  CONSTRAINT `fk_profesional_turno_persona_genero_id_persona_genero` FOREIGN KEY (`persona_genero_id`) REFERENCES `persona_genero` (`id`),
  CONSTRAINT `fk_profesional_turno_turno_id_turno` FOREIGN KEY (`turno_id`) REFERENCES `turno` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


