USE base_turnos;

CREATE TABLE `tipo_tel` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nombre` char(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='fk_persona_telefono_tipo_tel_id_tipo_tel';


