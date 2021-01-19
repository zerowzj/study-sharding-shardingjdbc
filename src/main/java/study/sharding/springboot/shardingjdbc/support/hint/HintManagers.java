package study.sharding.springboot.shardingjdbc.support.hint;

import org.apache.shardingsphere.api.hint.HintManager;

public class HintManagers {

    public static HintManager get() {
        return HintManager.getInstance();
    }

    //请求走主库
    public static void setMasterRouteOnly() {
        get().setMasterRouteOnly();
    }

    //
    public static void setDatabaseShardingValue(Comparable<?> value) {
        get().setDatabaseShardingValue(value);
    }
}
