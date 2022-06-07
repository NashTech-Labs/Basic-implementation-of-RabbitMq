package com.rabbitmq.consumer;

import com.rabbitmq.config.MessagingConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(String message) {
        System.out.println("Message recieved from queue : " + message);
    }
}
