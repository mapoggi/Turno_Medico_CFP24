USE base_turnos;

CREATE TABLE `tipo_email` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nombre` char(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='fk_persona_email_tipo_email_id_tipo_email';


