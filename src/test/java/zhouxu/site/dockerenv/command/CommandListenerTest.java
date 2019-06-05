package zhouxu.site.dockerenv.command;

import org.junit.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zhouxu.site.dockerenv.DockerEnvApplicationTests;

import static org.junit.Assert.*;

@Component
public class CommandListenerTest extends DockerEnvApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void process() {
        rabbitTemplate.convertAndSend("msg-queue","hello");
    }
}