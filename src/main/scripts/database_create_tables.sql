USE w40k;

DROP TABLE IF EXISTS fig_abilities;
DROP TABLE IF EXISTS fig_keyword;
DROP TABLE IF EXISTS fig_options;
DROP TABLE IF EXISTS army_options;
DROP TABLE IF EXISTS figurine;
DROP TABLE IF EXISTS unit;
DROP TABLE IF EXISTS type_figurine;
DROP TABLE IF EXISTS army;
DROP TABLE IF EXISTS abilities;
DROP TABLE IF EXISTS Options;
DROP TABLE IF EXISTS type_options;
DROP TABLE IF EXISTS keyword;

CREATE TABLE Army (
  id          INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nom         VARCHAR(250) NOT NULL,
  description VARCHAR(250)
);


CREATE TABLE type_figurine (
  code        VARCHAR(150) NOT NULL PRIMARY KEY,
  description VARCHAR(250)
);

CREATE TABLE unit (
  id           INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nom          VARCHAR(500) NOT NULL,
  description  VARCHAR(500),
  equipement_point_include TINYINT NULL DEFAULT 0,
  typeFigurine VARCHAR(150) NOT NULL,
  id_army      INT          NOT NULL,
  FOREIGN KEY (typeFigurine)
  REFERENCES type_figurine (CODE)
    ON DELETE NO ACTION,
  FOREIGN KEY (id_army)
  REFERENCES army (id)
    ON DELETE NO ACTION
);

CREATE TABLE figurine (
  id           INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nom          VARCHAR(500) NOT NULL,
  description  VARCHAR(250),
  M            VARCHAR(15),
  WS           VARCHAR(15),
  BS           VARCHAR(15),
  S            VARCHAR(15),
  T            VARCHAR(15),
  W            VARCHAR(15),
  A            VARCHAR(15),
  Ld           VARCHAR(15),
  Sv           VARCHAR(15),
  pointValue   INT,
  min          INT,
  max          INT,
  typeFigurine VARCHAR(150),
  FOREIGN KEY (typeFigurine)
  REFERENCES type_figurine (code)
    ON DELETE NO ACTION
);

CREATE TABLE keyword (
  code VARCHAR(50) PRIMARY KEY
);

CREATE TABLE abilities (
  id          INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nom         VARCHAR(50),
  description VARCHAR(1024)
);

CREATE TABLE Options (
  id          INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nom         VARCHAR(500) NOT NULL,
  description VARCHAR(250),
  distance    VARCHAR(50),
  type        VARCHAR(50),
  strength    VARCHAR(50),
  AP          VARCHAR(50),
  D           VARCHAR(50),
  abilitie    VARCHAR(500),
  typeOption  VARCHAR(100)
);

CREATE TABLE fig_abilities (
  idFigurine INT NOT NULL,
  idAblity   INT NOT NULL,
  PRIMARY KEY (idFigurine, idAblity),
  FOREIGN KEY (idFigurine)
  REFERENCES figurine (id)
    ON DELETE NO ACTION,
  FOREIGN KEY (idAblity)
  REFERENCES abilities (id)
    ON DELETE NO ACTION
);

CREATE TABLE fig_options (
  idFigurine INT NOT NULL,
  idOptions  INT NOT NULL,
  isDefault TINYINT NULL DEFAULT 0,
  PRIMARY KEY (idFigurine, idOptions),
  FOREIGN KEY (idFigurine)
  REFERENCES figurine (id)
    ON DELETE NO ACTION,
  FOREIGN KEY (idOptions)
  REFERENCES options (id)
    ON DELETE NO ACTION
);

CREATE TABLE army_options (
  idArmy    INT NOT NULL,
  idOptions INT NOT NULL,
  value     INT NOT NULL,
  PRIMARY KEY (idArmy, idOptions),
  FOREIGN KEY (idArmy)
  REFERENCES army (id)
    ON DELETE NO ACTION,
  FOREIGN KEY (idOptions)
  REFERENCES options (id)
    ON DELETE NO ACTION
);

CREATE TABLE fig_keyword (
  idFigurine INT         NOT NULL,
  keyword    VARCHAR(50) NOT NULL,
  PRIMARY KEY (idFigurine, keyword),
  FOREIGN KEY (idFigurine)
  REFERENCES figurine (id)
    ON DELETE NO ACTION,
  FOREIGN KEY (keyword)
  REFERENCES keyword (code)
    ON DELETE NO ACTION
);

ALTER TABLE `w40k`.`figurine`
  DROP FOREIGN KEY `figurine_ibfk_1`;
ALTER TABLE `w40k`.`figurine`
  CHANGE COLUMN `typeFigurine` `idUnit` INT NULL DEFAULT NULL ,
  ADD INDEX `figurine_ibfk_1_idx` (`idUnit` ASC),
  DROP INDEX `typeFigurine` ;
ALTER TABLE `w40k`.`figurine`
  ADD CONSTRAINT `figurine_ibfk_1`
FOREIGN KEY (`idUnit`)
REFERENCES `w40k`.`unit` (`id`)
  ON DELETE NO ACTION;