USE base_turnos;

CREATE TABLE `paciente_turno` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) NOT NULL,
  `prof_turno_id` int(11) NOT NULL,
  `hora` int(5) NOT NULL,
  `cancelado` int(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `persona_id` (`persona_id`),
  UNIQUE KEY `prof_turno_id` (`prof_turno_id`),
  CONSTRAINT `fk_paciente_turno_persona_id_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  CONSTRAINT `fk_paciente_turno_prof_turno_id` FOREIGN KEY (`prof_turno_id`) REFERENCES `profesional_turno` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='fk_paciente_turno_prof_turno_id_profesional_turno';


