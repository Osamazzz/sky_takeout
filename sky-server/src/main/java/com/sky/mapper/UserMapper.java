package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.Map;

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

    /**
     * 根据动态条件统计用户的数量
     * @param map
     */
    Integer countByMap(Map map);
}
