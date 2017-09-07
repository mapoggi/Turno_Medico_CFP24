USE base_turnos;

CREATE TABLE `persona_genero` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nombre` char(15) NOT NULL,
  `persona_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_persona_genero_persona_id_persona` (`persona_id`),
  CONSTRAINT `fk_persona_genero_persona_id_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


