package study.sharding.springboot.shardingjdbc.support.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("study.sharding.springboot.shardingjdbc.mapper")
@Configuration
public class MybatisCfg {

}
