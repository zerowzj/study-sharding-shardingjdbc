package study.sharding.springboot.shardingjdbc.dao.useradmin;

import study.sharding.springboot.shardingjdbc.support.db.BaseMapper;

public interface UserAdminMapper extends BaseMapper<Long, UserAdminEO> {

    UserAdminEO getByUserId(Long uaUserId);
}
