package cn.controller;

import cn.service.UserService;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import cn.entity.User;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Des
 * Created with IntelliJ IDEA
 * Created by xuyf
 * Date 2017/12/21
 * Time 16:11
 */
@RestController
public class UserController {
    private static Logger logger=Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User> list(){
        return userService.list();
    }
}
