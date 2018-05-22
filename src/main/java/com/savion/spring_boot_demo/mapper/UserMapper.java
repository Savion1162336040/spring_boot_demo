package com.savion.spring_boot_demo.mapper;

import com.savion.spring_boot_demo.bean.DBUser;
import com.savion.spring_boot_demo.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    DBUser getUserByID(int id);

    @Insert("insert into user values (#{id},#{name},#{age})")
    boolean saveUser(DBUser user);
}
