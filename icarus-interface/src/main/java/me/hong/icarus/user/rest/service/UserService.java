package me.hong.icarus.user.rest.service;

import me.hong.icarus.user.model.User;
import me.hong.icarus.util.AESBase64;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/icarus")
public interface UserService {

    @GetMapping(value = "/icarus/user/get_id/{id}")
    User getUserById(@PathVariable("id") String id);

    @PostMapping(value = "/user/login")
    void  login(@RequestBody User user);

}
