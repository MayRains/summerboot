package frameworkdemo.summerboot.dao;

import frameworkdemo.summerboot.pojo.User;
import org.apache.ibatis.annotations.*;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface userDao {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            @Result(property = "deptid", column = "dept_id"),
            @Result(property = "email", column = "email"),
            @Result(property = "gender", column = "gender"),
    })

    @Select("select * from user where id = #{id}")
    User findByUserid(@Param("id") int id);

    @Select("select * from user")
    ArrayList<User> findUers();
}
