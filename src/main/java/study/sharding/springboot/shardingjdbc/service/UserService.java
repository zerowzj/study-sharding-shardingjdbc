package study.sharding.springboot.shardingjdbc.service;


import study.sharding.springboot.shardingjdbc.dao.userbase.UserBaseEO;

import java.util.Date;

public interface UserService {

    int add(UserBaseEO ubEO);

    UserBaseEO get(Long ubId);

    UserBaseEO getByUserId(Long ubUserId);

    UserBaseEO getByUserIdAndUbId(Long ubId, Long ubUserId);

    UserBaseEO getByUserIdAndBeginTime(Long ubUserId, Date ubBeginTime);
}
