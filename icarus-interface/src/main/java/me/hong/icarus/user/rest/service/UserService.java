package me.hong.icarus.user.rest.service;

import me.hong.icarus.user.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/icarus")
public interface UserService {

    @GetMapping(value = "/icarus/user/get_id/{id}")
    String getUserById(@PathVariable("id") String id);
}
