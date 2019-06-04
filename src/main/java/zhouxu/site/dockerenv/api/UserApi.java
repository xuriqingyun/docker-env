package zhouxu.site.dockerenv.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhouxu.site.dockerenv.pojo.User;
import zhouxu.site.dockerenv.service.UserService;

import java.util.List;

/**
 * 用户api接口
 *
 * @author zhouxu
 * @date 2019/06/04 15:03
 **/
@RestController
@RequestMapping("/v1/user")
public class UserApi {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list(){
        return userService.list();
    }
} 
