package study.sharding.springboot.shardingjdbc.dao.userbase;

import study.sharding.springboot.shardingjdbc.support.db.BaseMapper;

import java.util.Date;

public interface UserBaseMapper extends BaseMapper<Long, UserBaseEO> {

    UserBaseEO getByUserId(Long ubUserId);

    UserBaseEO getByUserIdAndUbId(Long ubId, Long ubUserId);

    UserBaseEO getByUserIdAndBeginTime(Long ubUserId, Date ubBeginTime);
}
