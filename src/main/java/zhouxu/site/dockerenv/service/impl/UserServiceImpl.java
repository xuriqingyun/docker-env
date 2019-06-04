package zhouxu.site.dockerenv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhouxu.site.dockerenv.dao.UserMapper;
import zhouxu.site.dockerenv.pojo.User;
import zhouxu.site.dockerenv.service.UserService;

import java.util.List;

/**
 * @author zhouxu
 * @date 2019/06/04 15:02
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.selectByExample(null);
    }
}
