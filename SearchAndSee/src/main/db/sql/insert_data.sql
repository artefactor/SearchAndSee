INSERT INTO `users` (`id_u`,`login`,`pass`) VALUES (1,'artem','67cce58545feb2aff157f09f87df5a392619eddf');
INSERT INTO `users` (`id_u`,`login`,`pass`) VALUES (2,'borce','-3b9ff76158bf6d50bc36a3def1de0ac76ac2010c');
INSERT INTO `users` (`id_u`,`login`,`pass`) VALUES (3,'alex','-5eef9b1bcb74fc198274ee81226bc0701701dce7');
INSERT INTO `users` (`id_u`,`login`,`pass`) VALUES (4,'anton','-126a7b76d2b898cf4eba6cbc7257edcc7869f1fd');
INSERT INTO `users` (`id_u`,`login`,`pass`) VALUES (5,'sasha','382670b1eefeffda9b53444b97fb2f8ef97db7f5');

INSERT INTO `films` (`id_f`,`title`,`ryear`,`producer`,`category`,`description`) VALUES (1,'Побег из Шоушенка',1994,'Фрэнк Дарабонт','детективный фильм, драма','44');
INSERT INTO `films` (`id_f`,`title`,`ryear`,`producer`,`category`,`description`) VALUES (2,'Крёстный отец',1972,'Фрэнсис Форд Коппола','гангстерский фильм, драма','sdывыв+');
INSERT INTO `films` (`id_f`,`title`,`ryear`,`producer`,`category`,`description`) VALUES (3,'Крёстный отец2',1974,'Фрэнсис Форд Коппола','гангстерский фильм, драма','sd3');
INSERT INTO `films` (`id_f`,`title`,`ryear`,`producer`,`category`,`description`) VALUES (4,'Тёмный рыцарь',2008,'Кристофер Нолан','триллер, драма','триллер, драма');
INSERT INTO `films` (`id_f`,`title`,`ryear`,`producer`,`category`,`description`) VALUES (5,'Криминальное чтиво',1994,'Квентин Тарантино','sd',NULL);

INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('1', '1', '1', '1');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('2', '1', '2', '10');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('3', '1', '3', '8');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('4', '1', '4', '10');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('5', '2', '5', '9');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('6', '2', '1', '8');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('7', '2', '2', '10');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('8', '3', '3', '8');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('9', '3', '4', '10');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('10', '3', '5', '9');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('11', '4', '4', '4');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('12', '1', '5', '10');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('13', '1', '5', '8');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('14', '1', '5', '10');
INSERT INTO `sitebase`.`usersrate` (`id_r`, `id_u`, `id_f`, `p_rate`) VALUES ('15', '1', '5', '9');
