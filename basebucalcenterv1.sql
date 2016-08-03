/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     30/07/2016 11:04:01                          */
/*==============================================================*/


drop table if exists bucalcenter.administrador;

drop table if exists bucalcenter.cita;

drop table if exists bucalcenter.especialidad;

drop table if exists bucalcenter.historia_clinica;

drop table if exists bucalcenter.horario;

drop table if exists bucalcenter.odontologo;

drop table if exists bucalcenter.paciente;

drop table if exists bucalcenter.sesiones;

drop table if exists bucalcenter.usuarios;

/*==============================================================*/
/* User: bucalcenter                                            */
/*==============================================================*/
create user bucalcenter;

/*==============================================================*/
/* Table: administrador                                         */
/*==============================================================*/
create table bucalcenter.administrador
(
   ID_USR               INT(11) not null auto_increment,
   TIPO_USR             CHAR(1) default NULL,
   NOMRE_USR            VARCHAR(16) default NULL,
   PASSWORD_USR         VARCHAR(16) default NULL,
   CONFIRM_PASSWORD_USR VARCHAR(16) default NULL,
   NOMBRE1_USR          VARCHAR(16) default NULL,
   NOMBRE2_USR          VARCHAR(16) default NULL,
   APELLIDO1_USR        VARCHAR(16) default NULL,
   APELLIDO2_USR        VARCHAR(16) default NULL,
   CEDULA_USR           VARCHAR(16) default NULL,
   FECNAC_USR           DATE default NULL,
   LUGARNAC_USR         VARCHAR(16) default NULL,
   DIRECCION_USR        VARCHAR(254) default NULL,
   TELFDOM_USR          VARCHAR(16) default NULL,
   TELFCEL_USR          VARCHAR(16) default NULL,
   EDAD_USR             VARCHAR(16) default NULL,
   SEXO_USR             CHAR(1) default NULL,
   CORREOE_USR          VARCHAR(254) default NULL,
   ESTADOCIVIL_USR      VARCHAR(16) default NULL,
   OCUPACION_ADMINISTRADOR VARCHAR(60) default NULL,
   ESTADO_USR           CHAR(1) default NULL,
   primary key (ID_USR),
   unique key NOMRE_USR (NOMRE_USR),
   unique key CORREOE_USR (CORREOE_USR)
)
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = latin1;

/*==============================================================*/
/* Table: cita                                                  */
/*==============================================================*/
create table bucalcenter.cita
(
   ID_CITA              INT(11) not null auto_increment,
   FECHA_CITA           DATE default NULL,
   HORA_CITA            TIME default NULL,
   ESTADO_CITA          VARCHAR(60) default NULL,
   primary key (ID_CITA)
)
ENGINE = InnoDB
AUTO_INCREMENT = 35
DEFAULT CHARACTER SET = latin1;

/*==============================================================*/
/* Table: especialidad                                          */
/*==============================================================*/
create table bucalcenter.especialidad
(
   ID_ESPECIALIDAD      INT(11) not null auto_increment,
   NOMBRE_ESPECIALIDAD  VARCHAR(30) default NULL,
   primary key (ID_ESPECIALIDAD)
)
ENGINE = InnoDB
AUTO_INCREMENT = 20
DEFAULT CHARACTER SET = latin1;

/*==============================================================*/
/* Table: historia_clinica                                      */
/*==============================================================*/
create table bucalcenter.historia_clinica
(
   ID_HISTORIACLINICA   INT(11) not null auto_increment,
   TIPOSANGRE_HISTORIACLINICA VARCHAR(16) default NULL,
   PESO_HISTORIACLINICA INT(11) default NULL,
   ALTURA_HISTORIACLINICA INT(11) default NULL,
   RIESGO_HISTORIACLINICA VARCHAR(50) default NULL,
   ANTECEDENTES_HISTORIACLINICA VARCHAR(50) default NULL,
   MOTIVOCONSULTA_HISTORIACLINICA VARCHAR(254) default NULL,
   primary key (ID_HISTORIACLINICA)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

/*==============================================================*/
/* Table: horario                                               */
/*==============================================================*/
create table bucalcenter.horario
(
   ID_HORARIO           INT(11) not null auto_increment,
   HORAINICIO_HORARIO   TIME default NULL,
   HORAFIN_HORARIO      TIME default NULL,
   LUNES_HORARIO        TIME default NULL,
   MARTES_HORARIO       TIME default NULL,
   MIERCOLES_HORARIO    TIME default NULL,
   JUEVES_HORARIO       TIME default NULL,
   VIERNES_HORARIO      TIME default NULL,
   primary key (ID_HORARIO)
)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;

/*==============================================================*/
/* Table: odontologo                                            */
/*==============================================================*/
create table bucalcenter.odontologo
(
   ID_USR               INT(11) not null auto_increment,
   TIPO_USR             CHAR(1) default NULL,
   NOMRE_USR            VARCHAR(16) default NULL,
   PASSWORD_USR         VARCHAR(16) default NULL,
   CONFIRM_PASSWORD_USR VARCHAR(16) default NULL,
   NOMBRE1_USR          VARCHAR(16) default NULL,
   NOMBRE2_USR          VARCHAR(16) default NULL,
   APELLIDO1_USR        VARCHAR(16) default NULL,
   APELLIDO2_USR        VARCHAR(16) default NULL,
   CEDULA_USR           VARCHAR(16) default NULL,
   FECNAC_USR           DATE default NULL,
   LUGARNAC_USR         VARCHAR(16) default NULL,
   DIRECCION_USR        VARCHAR(254) default NULL,
   TELFDOM_USR          VARCHAR(16) default NULL,
   TELFCEL_USR          VARCHAR(16) default NULL,
   EDAD_USR             VARCHAR(16) default NULL,
   SEXO_USR             CHAR(1) default NULL,
   CORREOE_USR          VARCHAR(254) default NULL,
   ESTADOCIVIL_USR      VARCHAR(16) default NULL,
   ESTADO_USR           CHAR(1) default NULL,
   HORAENTRADA_ODONTOLOGO TIME default NULL,
   HORASALIDA_ODONTOLOGO TIME default NULL,
   CITAMAXIMA_ODONTOLOGO INT(11) default NULL,
   primary key (ID_USR),
   unique key NOMRE_USR (NOMRE_USR),
   unique key CORREOE_USR (CORREOE_USR)
)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;

/*==============================================================*/
/* Table: paciente                                              */
/*==============================================================*/
create table bucalcenter.paciente
(
   ID_USR               INT(11) not null auto_increment,
   TIPO_USR             CHAR(1) default NULL,
   NOMRE_USR            VARCHAR(16) default NULL,
   PASSWORD_USR         VARCHAR(16) default NULL,
   CONFIRM_PASSWORD_USR VARCHAR(16) default NULL,
   NOMBRE1_USR          VARCHAR(16) default NULL,
   NOMBRE2_USR          VARCHAR(16) default NULL,
   APELLIDO1_USR        VARCHAR(16) default NULL,
   APELLIDO2_USR        VARCHAR(16) default NULL,
   CEDULA_USR           VARCHAR(16) default NULL,
   FECNAC_USR           DATE default NULL,
   LUGARNAC_USR         VARCHAR(16) default NULL,
   DIRECCION_USR        VARCHAR(254) default NULL,
   TELFDOM_USR          VARCHAR(16) default NULL,
   TELFCEL_USR          VARCHAR(16) default NULL,
   EDAD_USR             VARCHAR(16) default NULL,
   SEXO_USR             CHAR(1) default NULL,
   CORREOE_USR          VARCHAR(254) default NULL,
   ESTADOCIVIL_USR      VARCHAR(16) default NULL,
   OCUPACION_PACIENTE   VARCHAR(60) default NULL,
   ESTADO_USR           CHAR(1) default NULL,
   primary key (ID_USR),
   unique key NOMRE_USR (NOMRE_USR),
   unique key CORREOE_USR (CORREOE_USR)
)
ENGINE = InnoDB
AUTO_INCREMENT = 23
DEFAULT CHARACTER SET = latin1;

/*==============================================================*/
/* Table: sesiones                                              */
/*==============================================================*/
create table bucalcenter.sesiones
(
   id_sesion            VARCHAR(45) not null,
   usuario              VARCHAR(45) not null,
   inicio_sesion        DATETIME not null,
   ultimo_acceso        DATETIME not null,
   ip                   VARCHAR(16) not null,
   host                 VARCHAR(45) not null,
   servername           VARCHAR(45) not null,
   estado               VARCHAR(1) not null,
   primary key (id_sesion)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

/*==============================================================*/
/* Table: usuarios                                              */
/*==============================================================*/
create table bucalcenter.usuarios
(
   idusuario            INT(11) not null auto_increment,
   usuario              VARCHAR(45) not null,
   password             VARCHAR(45) not null,
   confirm              VARCHAR(45) not null,
   email                VARCHAR(45) not null,
   primary key (idusuario)
)
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = latin1;

