package me.hong.icarus.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import me.hong.icarus.user.dao.UserMapper;
import me.hong.icarus.user.model.User;
import me.hong.icarus.user.rest.service.UserService;
import me.hong.icarus.util.AESBase64;
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
        User user = userMapper.selectUserById(id);
        System.out.println(user.toString());
        return user;
    }

    @Override
    public void login(User user) {
        try {
            String pwd = user.getPassword();
            String decryptPwd = AESBase64.Decrypt(pwd,"1111222233334444");
            User user1 = userMapper.selectUserByLoginNameAndPwd(user.getLoginName(),decryptPwd);
            if (null != user1) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
