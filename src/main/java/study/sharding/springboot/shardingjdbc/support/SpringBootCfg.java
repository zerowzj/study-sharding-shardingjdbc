package study.sharding.springboot.shardingjdbc.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;

@SpringBootApplication(scanBasePackages = "study.sharding.springboot.shardingjdbc",
        exclude = {TransactionAutoConfiguration.class})
public class SpringBootCfg {

}
