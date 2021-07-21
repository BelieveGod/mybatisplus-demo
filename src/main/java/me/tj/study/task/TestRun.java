package me.tj.study.task;

import me.tj.study.entity.User;
import me.tj.study.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestRun implements ApplicationRunner {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
        List<User> userList = userMapper.selectByName("Tom");
        userList.forEach(System.out::println);
    }
}
