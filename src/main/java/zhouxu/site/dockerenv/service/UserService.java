package zhouxu.site.dockerenv.service;

import zhouxu.site.dockerenv.pojo.User;

import java.util.List;

/**
 * 用户服务
 *
 * @author zhouxu
 * @date 2019/06/04 15:01
 **/
public interface UserService {
    List<User> list();
}
