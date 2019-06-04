package zhouxu.site.dockerenv.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zhouxu.site.dockerenv.DockerEnvApplicationTests;
import zhouxu.site.dockerenv.pojo.User;

import java.util.List;

@Component
@Slf4j
public class UserServiceTest extends DockerEnvApplicationTests {

    @Autowired
    private UserService userService;
    
    @Test
    public void list() {
        final List<User> list = userService.list();
        log.info("UserList={}", list.toArray());
    }
}