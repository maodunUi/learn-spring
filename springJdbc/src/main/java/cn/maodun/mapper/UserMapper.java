package cn.maodun.mapper;


import cn.maodun.pojo.User;

import java.util.List;

/**
 * @author xl
 * @date 2022/9/22
 */
public interface UserMapper {
    void save(User user);

    User findById(int id);

    List<User> findAll();

//    @Delete("delete from user where uid=#{uid}")
    void delete(int uid);

    List<User> findUserBookAll();
}
