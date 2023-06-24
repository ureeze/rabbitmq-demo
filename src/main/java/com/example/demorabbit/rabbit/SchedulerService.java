package com.example.demorabbit.rabbit;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SchedulerService {

    private final RabbitTemplate rabbitTemplate;
    private final TopicExchange topicExchange;

    @Scheduled(fixedDelay = 1000)
    public void run() {
        rabbitTemplate.convertAndSend(topicExchange.getName(), "hello.key.1", "message >> scheduler service");
        log.info("send message");
    }
}
