package com.example.mockito.repository;


import com.example.mockito.entity.UserEntity;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest // 使用DataJpaTest注解，它会配置嵌入式数据库和自动扫描Repository
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByUsername() {
        // 创建一个用户并保存到数据库
        UserEntity user = new UserEntity();
        user.setUsername("testUser");
        userRepository.save(user);

        // 调用Repository方法
        UserEntity foundUser = userRepository.findByUsername("testUser");

        // 验证结果
        assertNotNull(foundUser);
        assertEquals("testUser", foundUser.getUsername());
    }
}