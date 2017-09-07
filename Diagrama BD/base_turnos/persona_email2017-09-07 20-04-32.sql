USE base_turnos;

CREATE TABLE `persona_email` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) NOT NULL,
  `tipo_email` int(2) NOT NULL,
  `email` char(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `persona_id` (`persona_id`),
  UNIQUE KEY `tipo_email` (`tipo_email`),
  CONSTRAINT `fk_persona_email_persona_id_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  CONSTRAINT `fk_persona_email_tipo_email_id_tipo_email` FOREIGN KEY (`tipo_email`) REFERENCES `tipo_email` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


