package zhouxu.site.dockerenv.service;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zhouxu.site.dockerenv.DockerEnvApplicationTests;
import zhouxu.site.dockerenv.pojo.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Component
@Slf4j
public class UserServiceTest extends DockerEnvApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;
    
    @Test
    public void list() {
        final List<User> list = userService.list();
        log.info("UserList={}", list.toArray());
    }

    @Test
    public void getDataSource() throws SQLException {
        System.out.println("数据源>>>>>>" + dataSource.getClass());
        Connection connection = dataSource.getConnection();

        System.out.println("连接>>>>>>>>>" + connection);
        System.out.println("连接地址>>>>>" + connection.getMetaData().getURL());

        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
        System.out.println("druidDataSource 数据源最大连接数：" + druidDataSource.getMaxActive());
        System.out.println("druidDataSource 数据源初始化连接数：" + druidDataSource.getInitialSize());

    }
}