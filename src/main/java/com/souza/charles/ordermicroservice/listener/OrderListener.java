package com.souza.charles.ordermicroservice.listener;

import com.souza.charles.ordermicroservice.dtos.OrderEventDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static com.souza.charles.ordermicroservice.config.RabbitMQConfig.ORDER_CREATED_QUEUE;

@Component
public class OrderListener {
    private final Logger logger = LoggerFactory.getLogger(OrderListener.class);

    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderEventDTO> message) {
        logger.info("Message Consumed: {}", message);
    }
}