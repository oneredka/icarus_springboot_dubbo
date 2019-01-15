package me.hong.icarus.user.rest.service;

import me.hong.icarus.user.model.User;
import org.springframework.web.bind.annotation.GetMapping;

public interface UserService {

    @GetMapping(value = "user/get_id/{id}")
    User getUserById(String id);
}
