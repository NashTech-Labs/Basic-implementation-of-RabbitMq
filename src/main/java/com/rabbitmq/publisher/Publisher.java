package com.rabbitmq.publisher;

import com.rabbitmq.config.MessagingConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Publisher {

    @Autowired
    private RabbitTemplate template;

    @GetMapping("/rabbitmq")
    public String rabbitMqImplementation() {
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, "Implementation of rabbitMq");
        return "Message sent successfully !!";
    }
}
