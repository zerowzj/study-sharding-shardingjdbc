package study.sharding.springboot.shardingjdbc.support.transaction;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@EnableTransactionManagement
@Slf4j
@Configuration
public class TransactionCfg {

    @Autowired
    private DataSource dataSource;

    @Bean("transactionManager")
    public PlatformTransactionManager transactionManager() {
        log.info(">>>>>> {}", dataSource.getClass().getName());
        return new DataSourceTransactionManager(dataSource);
    }
}
