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
@RequestMapping(value = "/icarus/icarus")
public class UserController {

    @Reference
    UserService userService;

    @ApiOperation(value = "登陆")
    @ApiImplicitParams(value = {
           // @ApiImplicitParam(name = "x-access-token", value = "令牌", paramType = "header", required = true),
            @ApiImplicitParam(name = "user", value = "用户", paramType = "query")
    })
    @PostMapping(value = "/user/login")
    public void  login(@RequestBody User user){

    }

    @ApiOperation(value = "通过id获取用户",httpMethod = "GET")
    @ApiImplicitParams(value = {
         //   @ApiImplicitParam(name = "x-access-token", value = "令牌", paramType = "header", required = true),
})
    @GetMapping(value = "/user/get_id/{id}")
    public User getUserById(@PathVariable("id") String id) {
        try {
            return userService.getUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
