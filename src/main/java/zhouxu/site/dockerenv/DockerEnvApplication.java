package zhouxu.site.dockerenv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("zhouxu.site.dockerenv.dao")
public class DockerEnvApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerEnvApplication.class, args);
    }

}
