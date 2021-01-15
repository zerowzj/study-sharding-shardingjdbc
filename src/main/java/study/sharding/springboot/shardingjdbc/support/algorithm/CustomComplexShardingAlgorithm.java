package study.sharding.springboot.shardingjdbc.support.algorithm;

import com.google.common.base.Joiner;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;
import org.assertj.core.util.Lists;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 复合键分片算法
 */
@Slf4j
public class CustomComplexShardingAlgorithm implements ComplexKeysShardingAlgorithm<String> {

    @Override
    public Collection<String> doSharding(Collection<String> targetNames,
                                         ComplexKeysShardingValue<String> shardingValue) {
        log.info("target= [{}]", Joiner.on(",").join(targetNames));
        //（★）分片信息：分片表、
        String logicTableName = shardingValue.getLogicTableName();
        Map<String, Collection<String>> valuesMap = shardingValue.getColumnNameAndShardingValuesMap();
        Collection ubBeginTime = valuesMap.get("UB_BEGIN_TIME");
        Collection ubUserId = valuesMap.get("UB_USER_ID");

        List<String> targetLt = Lists.newArrayList("user_base_2019_1");
        return targetLt;
    }
}
