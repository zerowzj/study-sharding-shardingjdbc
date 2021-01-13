package study.sharding.springboot.shardingjdbc.dao.userbase;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import study.sharding.springboot.shardingjdbc.support.db.BaseEO;

@Setter
@Getter
@ToString
public class UserBaseEO extends BaseEO {

    private Long ubId;

    private Long ubUserId;

    private String ubLoginName;

    private String ubLoginPwd;

    private Long ubBeginTime;
}
