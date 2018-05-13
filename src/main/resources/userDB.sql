CREATE TABLE `user` (
  `id` varchar(16) NOT NULL,
  `username` varchar(45) NOT NULL COMMENT '昵称',
  `phone` varchar(11) NOT NULL COMMENT '手机号码',
  `email` varchar(45) DEFAULT NULL COMMENT '邮件地址',
  `password` varchar(45) NOT NULL COMMENT '密码',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `user_group_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` int(3) NOT NULL,
  `name` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='status of user group';

CREATE TABLE `user_info` (
  `user_id` varchar(16) NOT NULL COMMENT 'user id',
  `address` varchar(60) DEFAULT NULL,
  `sex` bit(1) DEFAULT NULL COMMENT '0:female,1:male',
  `birthday` datetime DEFAULT NULL,
  `heigth` varchar(6) DEFAULT NULL,
  `weight` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='user detail info';

CREATE TABLE `user_ref_group` (
  `user_id` varchar(16) NOT NULL,
  `group_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='contact bedtween user and group';

CREATE TABLE `user_status` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `value` int(3) DEFAULT NULL COMMENT 'value of status',
  `name` varchar(10) DEFAULT NULL COMMENT 'name of value',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='status of user';
