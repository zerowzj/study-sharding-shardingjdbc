package study.sharding.springboot.shardingjdbc.support;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;

@MapperScan("study.sharding.springboot.shardingjdbc.mapper")
@SpringBootApplication(scanBasePackages = "study.sharding.springboot.shardingjdbc",
        exclude = {TransactionAutoConfiguration.class})
public class SpringBootCfg {

}
