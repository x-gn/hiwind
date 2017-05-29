drop database if exists test ;
 
  CREATE DATABASE test;  

  use test;
  
    CREATE TABLE `t_user` (
    `USER_ID` INT(11) NOT NULL AUTO_INCREMENT,
    `USER_NAME` CHAR(30) NOT NULL,
    `USER_PASSWORD` CHAR(10) NOT NULL,
    `USER_EMAIL` CHAR(30) NOT NULL,
    PRIMARY KEY (`USER_ID`),
    KEY `IDX_NAME` (`USER_NAME`)
)  ENGINE=INNODB AUTO_INCREMENT=11 DEFAULT CHARSET=UTF8; 

    
    
    INSERT INTO t_user (USER_ID, USER_NAME, USER_PASSWORD, USER_EMAIL) VALUES (1, '林炳文', '1234567@', 'ling20081005@126.com');  
    INSERT INTO t_user (USER_ID, USER_NAME, USER_PASSWORD, USER_EMAIL) VALUES (2, 'evan', '123', 'fff@126.com');  
    INSERT INTO t_user (USER_ID, USER_NAME, USER_PASSWORD, USER_EMAIL) VALUES (3, 'kaka', 'cadg', 'fwsfg@126.com');  
    INSERT INTO t_user (USER_ID, USER_NAME, USER_PASSWORD, USER_EMAIL) VALUES (4, 'simle', 'cscs', 'fsaf@126.com');  
    INSERT INTO t_user (USER_ID, USER_NAME, USER_PASSWORD, USER_EMAIL) VALUES (5, 'arthur', 'csas', 'fsaff@126.com');  
    INSERT INTO t_user (USER_ID, USER_NAME, USER_PASSWORD, USER_EMAIL) VALUES (6, '小德', 'yuh78', 'fdfas@126.com');  
    INSERT INTO t_user (USER_ID, USER_NAME, USER_PASSWORD, USER_EMAIL) VALUES (7, '小小', 'cvff', 'fsaf@126.com');  
    INSERT INTO t_user (USER_ID, USER_NAME, USER_PASSWORD, USER_EMAIL) VALUES (8, '林林之家', 'gvv', 'lin@126.com');  
    INSERT INTO t_user (USER_ID, USER_NAME, USER_PASSWORD, USER_EMAIL) VALUES (9, '林炳文Evankaka', 'dfsc', 'ling2008@126.com');  
    INSERT INTO t_user (USER_ID, USER_NAME, USER_PASSWORD, USER_EMAIL) VALUES (10, 'apple', 'uih6', 'ff@qq.com');  
    