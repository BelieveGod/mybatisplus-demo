package me.tj.study.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import me.tj.study.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> selectByName(@Param("name") String name);
}
