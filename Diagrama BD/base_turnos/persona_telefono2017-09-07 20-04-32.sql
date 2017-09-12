USE base_turnos;

CREATE TABLE `persona_telefono` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) NOT NULL,
  `tipo_tel_id` int(2) NOT NULL,
  `tel` char(15) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `persona_id` (`persona_id`),
  UNIQUE KEY `tipo_tel_id` (`tipo_tel_id`),
  CONSTRAINT `fk_persona_telefono_persona_id_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  CONSTRAINT `fk_persona_telefono_tipo_tel_id_tipo_tel` FOREIGN KEY (`tipo_tel_id`) REFERENCES `tipo_tel` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


