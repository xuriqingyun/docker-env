package zhouxu.site.dockerenv.command;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 接收mq消息
 *
 * @author zhouxu
 * @date 2019/06/05 15:06
 **/
@Component
@Slf4j
public class CommandListener {

    @RabbitListener(queues = "msg-queue")
//    @RabbitListener(queuesToDeclare = )
    public void onMessage(String msg, Channel channel, Message message) {
        try {
            log.info("msg-queue revice msg={}",msg);
            channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
