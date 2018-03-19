package cn.service.impl;

import cn.entity.User;
import cn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.service.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Des
 * Created with IntelliJ IDEA
 * Created by xuyf
 * Date 2017/12/21
 * Time 16:09
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> list() {
        return userMapper.selectByExample(null);
    }
}
