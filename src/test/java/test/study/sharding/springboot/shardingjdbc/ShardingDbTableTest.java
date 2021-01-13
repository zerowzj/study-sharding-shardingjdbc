package test.study.sharding.springboot.shardingjdbc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import study.sharding.springboot.shardingjdbc.dao.userbase.UserBaseEO;
import study.sharding.springboot.shardingjdbc.service.UserService;
import study.sharding.springboot.shardingjdbc.support.SpringBootCfg;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootCfg.class})
public class ShardingDbTableTest {

    @Autowired
    private UserService userService;

    @Test
    public void add_test() {
        for (int i = 1; i <= 5; i++) {
            int userId = i;
            int mod = userId % 2;
            log.info("userId={}, mod= {}", userId, mod);

            UserBaseEO ubEO = new UserBaseEO();
            ubEO.setUbUserId(new Long(userId));
            ubEO.setUbLoginName("1");
            ubEO.setUbLoginPwd("1");
            userService.add(ubEO);
        }
    }

    @Test
    public void getByUserId_test() {
        for (int i = 1; i <= 5; i++) {
            Long ubUserId = new Long(i);
            UserBaseEO ubEO = userService.getByUserId(ubUserId);
            log.info("===> {}", ubEO);
        }
    }
}
