package study.sharding.springboot.shardingjdbc.dao.useradmin;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import study.sharding.springboot.shardingjdbc.dao.userbase.UserBaseEO;

@Setter
@Getter
@ToString
public class UserAdminEO extends UserBaseEO {

    private Long uaId;

    private Long uaUbId;

    private Long uaUserId;
}
