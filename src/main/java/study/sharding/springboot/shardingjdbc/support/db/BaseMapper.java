package study.sharding.springboot.shardingjdbc.support.db;

import java.io.Serializable;

public interface BaseMapper<PK extends Serializable, E extends BaseEO> {

    int insert(final E entity);

    int delete(final PK id);

    int update(final E entity);

    E get(final PK id);
}
