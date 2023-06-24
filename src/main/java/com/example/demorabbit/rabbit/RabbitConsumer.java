package com.example.demorabbit.rabbit;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class RabbitConsumer {

    /*
        #{queue.name} : queue 빈의 name 을 가져온다.
     */
    @RabbitListener(queues = "#{queue.name}")
    public void consume(String message){
        log.info("{}", message);
    }
}