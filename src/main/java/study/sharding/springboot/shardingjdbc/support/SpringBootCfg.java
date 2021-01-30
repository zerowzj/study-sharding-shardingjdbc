package study.sharding.springboot.shardingjdbc.support;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("study.sharding.springboot.shardingjdbc.mapper")
@SpringBootApplication(scanBasePackages = "study.sharding.springboot.shardingjdbc",
        exclude = {DataSourceAutoConfiguration.class})
public class SpringBootCfg {

}
