package me.hong.icarus.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import me.hong.icarus.user.model.User;
import me.hong.icarus.user.rest.service.UserService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
@RequestMapping(value = "/icarus")
public class UserController {

    @Reference
    UserService userService;

    @GetMapping(value = "/icarus/user/get_id/{id}")
    public String getUserById(@PathVariable("id") String id) {
        try {
            return userService.getUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
