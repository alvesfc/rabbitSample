package br.org.rabbit.sample.producer;

import br.com.pexin.amqp.AmqpRabbitProducer;
import br.com.pexin.amqp.annotation.AmqpExchange;
import br.com.pexin.amqp.annotation.AmqpExchangeType;
import br.com.pexin.amqp.annotation.AmqpProducer;
import br.com.pexin.amqp.annotation.AmqpQueue;
import br.org.rabbit.sample.producer.model.TestSimpleMessage;
import org.springframework.stereotype.Service;


/**
 * Created by rafaelfirmino on 21/01/16.
 */
@AmqpProducer(
        amqpQueue = @AmqpQueue(
                name = "simple.queue.1 and simple.queue.2"
        ),
        amqpExchange = @AmqpExchange(
                amqpExchangeType = AmqpExchangeType.TOPIC
        )
)
@Service
public class TestTopicProducerOne extends AmqpRabbitProducer<TestSimpleMessage> {

    @Override
    public void beforeSend(TestSimpleMessage message) {
        System.out.println("beforeSend Topic");
    }

    @Override
    public void afterSend(TestSimpleMessage message) {
        System.out.println("afterSend Topic");
    }
}
