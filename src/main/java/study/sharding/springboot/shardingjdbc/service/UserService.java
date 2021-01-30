package study.sharding.springboot.shardingjdbc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.sharding.springboot.shardingjdbc.mapper.useradmin.UserAdminEO;
import study.sharding.springboot.shardingjdbc.mapper.useradmin.UserAdminMapper;
import study.sharding.springboot.shardingjdbc.mapper.userbase.UserBaseEO;
import study.sharding.springboot.shardingjdbc.mapper.userbase.UserBaseMapper;

import java.util.Date;

@Slf4j
@Service("userService")
public class UserService {

    @Autowired
    private UserBaseMapper userBaseMapper;
    @Autowired
    private UserAdminMapper userAdminMapper;

    @Transactional
    public void addAdmin(boolean isThrowEx) {
        UserBaseEO ubEO = new UserBaseEO();
        ubEO.setUbUserId(90001L);
        ubEO.setUbLoginName("wzj");
        ubEO.setUbLoginPwd("123123");
        userBaseMapper.insert(ubEO);
        if (isThrowEx) {
            throw new RuntimeException("我是一个异常");
        }
        UserAdminEO uaEO = new UserAdminEO();
        uaEO.setUaId(ubEO.getUbId());
        userAdminMapper.insert(uaEO);
    }

//    @Master
    public UserBaseEO get(Long ubId) {
//        log.info("{}", datasource.getClass().getName());
        return userBaseMapper.get(ubId);
    }

    public UserBaseEO getByUserIdAndUbId(Long ubId, Long ubUserId) {
        return userBaseMapper.getByUserIdAndUbId(ubId, ubUserId);
    }

    public UserBaseEO getByUserId(Long ubUserId) {
        log.info("user_id= {}", ubUserId);
        return userBaseMapper.getByUserId(ubUserId);
    }

    public UserBaseEO getByUserIdAndBeginTime(Long ubUserId, Date ubBeginTime) {
        log.info("user_id= {}", ubUserId);
        return userBaseMapper.getByUserIdAndBeginTime(ubUserId, ubBeginTime);
    }
}
