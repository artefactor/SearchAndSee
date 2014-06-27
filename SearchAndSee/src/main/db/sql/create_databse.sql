create database Sitebase;
use sitebase;
create table Users(id_u int,login varchar(20),pass varchar(50),primary key(id_u));
create table Films(id_f int,title varchar(70),ryear int(6),producer varchar(50),category varchar(50),description varchar(100),primary key(id_f));
create table Usersrate(id_r int,id_u int,id_f int,p_rate int(10),primary key(id_r));

ALTER TABLE `sitebase`.`usersrate` 
  ADD CONSTRAINT `manyr_oneuser`
  FOREIGN KEY (`id_u` )
  REFERENCES `sitebase`.`users` (`id_u` )
  ON DELETE CASCADE
  ON UPDATE CASCADE
, ADD INDEX `manyr_oneuser_idx` (`id_u` ASC) ;


ALTER TABLE `sitebase`.`usersrate` 
  ADD CONSTRAINT `manyr_onefilm`
  FOREIGN KEY (`id_f` )
  REFERENCES `sitebase`.`films` (`id_f` )
  ON DELETE CASCADE
  ON UPDATE CASCADE
, ADD INDEX `manyr_onefilm_idx` (`id_f` ASC) ;




