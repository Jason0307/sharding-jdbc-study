package org.zhubao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zhubao.entity.User;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE id =#{id}")
    public User getUser(@Param("id") Long id);

    @Insert("INSERT INTO USER(id,name,sex) VALUES(#{id},#{name},#{sex})")
    void create(User user);
    
    @Select("SELECT * FROM USER ORDER BY ID ASC")
    public List<User> getAllUsers();
}
