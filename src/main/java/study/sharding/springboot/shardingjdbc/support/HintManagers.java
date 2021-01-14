package study.sharding.springboot.shardingjdbc.support;

import org.apache.shardingsphere.api.hint.HintManager;

public class HintManagers {

    public static HintManager get() {
        return HintManager.getInstance();
    }

    public static void setMasterRouteOnly() {
        get().setMasterRouteOnly();
    }

//
//    public static void setDatabaseShardingValue(Comparable<?> value) {
//        get().setDatabaseShardingValue(value);
//    }
}
