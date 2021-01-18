package study.sharding.springboot.shardingjdbc.dao.orderbase;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import study.sharding.springboot.shardingjdbc.support.db.BaseEO;

@Setter
@Getter
@ToString
public class OrderBaseEO extends BaseEO {

    private Long rbId;

    private Long rbOrderNo;
}
