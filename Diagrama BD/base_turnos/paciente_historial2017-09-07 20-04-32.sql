USE base_turnos;

CREATE TABLE `paciente_historial` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `paciente_turno_id` int(11) DEFAULT NULL,
  `descripcion` mediumtext NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `paciente_turno_id` (`paciente_turno_id`),
  CONSTRAINT `fk_paciente_historial_paciente_turno_id` FOREIGN KEY (`paciente_turno_id`) REFERENCES `paciente_turno` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


