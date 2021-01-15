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
public class MasterSlaveTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert_test() {
        UserBaseEO ubEO = new UserBaseEO();
        ubEO.setUbLoginName("test");
        ubEO.setUbLoginPwd("test");
        ubEO.setUbUserId(900001L);
        userService.add(ubEO);
    }

    @Test
    public void get_test() {
        Long ubId = 3L;
        for (int i = 0; i < 4; i++) {
            UserBaseEO ubEO = userService.get(ubId);
            log.info("第 {} 次查询，>>>>> {}", (i + 1), ubEO);
        }
    }
}
