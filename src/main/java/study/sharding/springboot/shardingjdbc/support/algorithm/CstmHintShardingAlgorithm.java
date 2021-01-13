package study.sharding.springboot.shardingjdbc.support.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.Collection;

@Slf4j
public class CstmHintShardingAlgorithm implements HintShardingAlgorithm {

    @Override
    public Collection<String> doSharding(Collection availableTargetNames,
                                         HintShardingValue shardingValue) {
        return null;
    }
}
