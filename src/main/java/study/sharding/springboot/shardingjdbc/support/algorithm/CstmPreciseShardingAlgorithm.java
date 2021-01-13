package study.sharding.springboot.shardingjdbc.support.algorithm;

import com.google.common.base.Joiner;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * 精确分片
 */
@Slf4j
public class CstmPreciseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(Collection<String> targetNames, PreciseShardingValue<Long> shardingValue) {
        //（★）目标名
        log.info("target= [{}]", Joiner.on(",").join(targetNames));
        //（★）分片信息：分片表、分片列、分片值
        String logicTableName = shardingValue.getLogicTableName();
        String columnName = shardingValue.getColumnName();
        Long value = shardingValue.getValue();
        log.info("logic_table= [{}], column_name= [{}], value= [{}]", logicTableName, columnName, value);

        String name = null;
        int targetSize = targetNames.size();
//        targetNames.forEach(e -> {
//            if (e.endsWith(value % targetSize + "")) {
//                name = e;
//                return;
//            }
//        });
        for (String targetName : targetNames) {
            //取模
            long mod = value % targetSize;
            //匹配目标并返回
            if (targetName.endsWith(String.valueOf(mod))) {
                name = targetName;
                break;
            }
        }
        log.info("{} use target {}", value, name);
        return name;
    }
}
