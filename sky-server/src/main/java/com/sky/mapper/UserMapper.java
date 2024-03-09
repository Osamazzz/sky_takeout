package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    /**
     * 根据openid查用户
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    public User getByOpenId(String openid);

    void insert(User user);

    @Select("select * from user where id=#{id}")
    User getById(Long userId);
}
