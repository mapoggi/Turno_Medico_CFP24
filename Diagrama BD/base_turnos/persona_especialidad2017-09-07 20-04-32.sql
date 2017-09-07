USE base_turnos;

CREATE TABLE `persona_especialidad` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) NOT NULL,
  `nombre` char(25) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `persona_id` (`persona_id`),
  CONSTRAINT `fk_persona_especialidad_persona_id_profesional_turno` FOREIGN KEY (`persona_id`) REFERENCES `profesional_turno` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


