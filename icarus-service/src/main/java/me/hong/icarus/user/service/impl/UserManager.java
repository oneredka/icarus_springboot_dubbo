package me.hong.icarus.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import me.hong.icarus.user.dao.UserMapper;
import me.hong.icarus.user.model.User;
import me.hong.icarus.user.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional(readOnly = true, rollbackFor = Exception.class)
@Service
public class UserManager implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(String id) {
        System.out.println("成功啦！！！！！！！！！！！！！！！！！！！！！！！");
        return userMapper.selectUserById(id);
    }
}
