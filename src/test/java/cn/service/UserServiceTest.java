package cn.service;

import cn.controller.UserController;
import cn.entity.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Des
 * Created with IntelliJ IDEA
 * Created by xuyf
 * Date 2017/12/21
 * Time 16:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml","classpath:spring/spring-mvc.xml"})
public class UserServiceTest {
    private static Logger logger=Logger.getLogger(UserServiceTest.class);
    @Autowired
    private UserService userService;
    @Test
    public void list() throws Exception {
        String test="aaaa";
        List<User> users=userService.list();
       logger.info("日志"+users);
    }

}