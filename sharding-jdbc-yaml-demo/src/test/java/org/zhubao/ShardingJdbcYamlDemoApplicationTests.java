package org.zhubao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zhubao.entity.User;
import org.zhubao.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbcYamlDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testAddUsers() {
        for (int i = 1; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("Jason" + i);
            user.setSex(0);
            userMapper.create(user);
        }
    }
    
    @Test
    public void testGetAllUsers() {
        userMapper.getAllUsers().forEach(user -> {
            System.out.println(user);
        });
    }

}
