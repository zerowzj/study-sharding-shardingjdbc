package study.sharding.springboot.shardingjdbc.mapper.userbase;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;
import study.sharding.springboot.shardingjdbc.support.db.BaseEO;

@Setter
@Getter
@ToString
@Alias("UserBaseEO")
public class UserBaseEO extends BaseEO {

    private Long ubId;

    private Long ubUserId;

    private String ubLoginName;

    private String ubLoginPwd;

    private Long ubBeginTime;
}
