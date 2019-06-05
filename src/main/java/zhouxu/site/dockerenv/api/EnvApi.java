package zhouxu.site.dockerenv.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取环境Api
 *
 * @author zhouxu
 * @date 2019/06/05 11:23
 **/
@RestController
@RequestMapping("/v1/env")
public class EnvApi {

    @Value("${env}")
    private String env;

    @GetMapping("")
    public String getEnv(){
        return env;
    }
} 
