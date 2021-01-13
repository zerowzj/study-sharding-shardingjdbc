package study.sharding.springboot.shardingjdbc.support.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.Collection;

/**
 * 范围分片
 */
@Slf4j
public class CstmRangeShardingAlgorithm implements RangeShardingAlgorithm {

    @Override
    public Collection<String> doSharding(Collection availableTargetNames,
                                         RangeShardingValue shardingValue) {
        return null;
    }
}
