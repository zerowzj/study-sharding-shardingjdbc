package study.sharding.springboot.shardingjdbc.support.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.Collection;

/**
 * 范围分片算法
 */
@Slf4j
public class CustomRangeShardingAlgorithm implements RangeShardingAlgorithm {

    @Override
    public Collection<String> doSharding(Collection availableTargetNames,
                                         RangeShardingValue shardingValue) {
        return null;
    }
}
