package study.sharding.springboot.shardingjdbc.mapper.useradmin;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;
import study.sharding.springboot.shardingjdbc.mapper.userbase.UserBaseEO;

@Getter
@Setter
@ToString
@Alias("UserAdminEO")
public class UserAdminEO extends UserBaseEO {

    private Long uaId;
}
