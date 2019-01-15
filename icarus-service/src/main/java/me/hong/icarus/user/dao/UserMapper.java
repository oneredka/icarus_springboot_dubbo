package me.hong.icarus.user.dao;

import me.hong.icarus.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectAllUser();

    User selectUserById(@Param("id") String id);
}
