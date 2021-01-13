package study.sharding.springboot.shardingjdbc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.sharding.springboot.shardingjdbc.dao.userbase.UserBaseEO;
import study.sharding.springboot.shardingjdbc.dao.userbase.UserBaseMapper;

import java.util.Date;

@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBaseMapper userBaseMapper;

    @Override
    public int add(UserBaseEO ubEO) {
        return userBaseMapper.insert(ubEO);
    }

    @Override
    public UserBaseEO get(Long ubId) {
        return userBaseMapper.get(ubId);
    }

    @Override
    public UserBaseEO getByUserIdAndUbId(Long ubId, Long ubUserId) {
        return userBaseMapper.getByUserIdAndUbId(ubId, ubUserId);
    }

    @Override
    public UserBaseEO getByUserId(Long ubUserId) {
        log.info("user_id= {}", ubUserId);
        return userBaseMapper.getByUserId(ubUserId);
    }

    @Override
    public UserBaseEO getByUserIdAndBeginTime(Long ubUserId, Date ubBeginTime) {
        log.info("user_id= {}", ubUserId);
        return userBaseMapper.getByUserIdAndBeginTime(ubUserId, ubBeginTime);
    }
}
