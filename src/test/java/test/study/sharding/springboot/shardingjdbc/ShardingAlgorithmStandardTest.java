package test.study.sharding.springboot.shardingjdbc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import study.sharding.springboot.shardingjdbc.mapper.userbase.UserBaseEO;
import study.sharding.springboot.shardingjdbc.service.UserService;
import study.sharding.springboot.shardingjdbc.support.SpringBootCfg;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootCfg.class})
public class ShardingAlgorithmStandardTest {

    @Autowired
    private UserService userService;

    @Test
    public void get_test() {
        Long ubId = new Long(5);
        UserBaseEO ubEO = userService.get(ubId);
        log.info("===> {}", ubEO);
    }

    @Test
    public void getByUserIdAndUbId_test() {
        Long ubId = new Long(1);
        Long ubUserId = new Long(1);
        UserBaseEO ubEO = userService.getByUserIdAndUbId(ubId, ubUserId);
        log.info("===> {}", ubEO);
    }
}
