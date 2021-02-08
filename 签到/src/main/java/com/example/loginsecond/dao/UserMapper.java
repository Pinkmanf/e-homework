package com.example.loginsecond.dao;

import com.example.loginsecond.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Mapper
@Repository
public interface UserMapper {

    @Select(value = "select username,password from pink.pinkman where username=#{username}")
    @Results
            ({@Result(property = "username",column = "username"),
                    @Result(property = "password",column = "password")})
    User findUserByName(@Param("username") String username);


    @Insert("insert into pink.pinkman(id,username,password) values(#{id},#{username},#{password})")
    //加入该注解可以保存对象后，查看对象插入id
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void register(User user);


    @Select("select id from pink.pinkman where username=#{username} and password=#{password}")
    Long login(User user);

//    @Update("update pink.pinkman set info=1 where username=#{username}")
//    boolean check(@Param("username")String username,@Param("info")int info);

    @Update("update pink.pinkman set password=#{password1} where username=#{username} and password=#{password}")
    boolean update(@Param("password1")String password1, @Param("password")String password, @Param("username")String username);
}
