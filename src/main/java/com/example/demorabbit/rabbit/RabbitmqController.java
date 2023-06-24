package com.example.demorabbit.rabbit;

import lombok.AllArgsConstructor;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RabbitmqController {

    private final RabbitTemplate rabbitTemplate;
    private final TopicExchange topicExchange;

    /**
     * Simple Queue 테스트(Exchange 활용)
     */
    @GetMapping("/send")
    public void sendMessage() {

        rabbitTemplate.convertAndSend(topicExchange.getName(), "hello.key.1", "HELLO");
    }
}