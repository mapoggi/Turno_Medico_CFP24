USE base_turnos;

CREATE TABLE `persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` char(25) NOT NULL,
  `apellido` char(25) NOT NULL,
  `dni` int(8) NOT NULL,
  `persona_genero_id` int(2) NOT NULL,
  `usuario` char(50) NOT NULL,
  `contraseña` char(8) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `persona_genero_id` (`persona_genero_id`),
  CONSTRAINT `fk_persona_persona_genero_id_persona_genero` FOREIGN KEY (`persona_genero_id`) REFERENCES `persona_genero` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


