package com.udacity.jwdnd.c1.review.mapper;

import com.udacity.jwdnd.c1.review.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("Select * FROM USERS where username =#{username}")
    User getUser(String username);

    @Insert("INSERT INTO USERS (username,salt,password,firstname,lastname) VALUES (#{username},#{salt},#{password},#{firstname},#{lastname})")
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    Integer insert(User user);
}
