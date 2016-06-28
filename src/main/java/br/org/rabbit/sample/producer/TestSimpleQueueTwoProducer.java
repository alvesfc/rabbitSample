package br.org.rabbit.sample.producer;


import br.com.pexin.amqp.AmqpRabbitProducer;
import br.com.pexin.amqp.annotation.AmqpProducer;
import br.com.pexin.amqp.annotation.AmqpQueue;
import br.org.rabbit.sample.producer.model.TestSimpleMessage;
import org.springframework.stereotype.Service;

/**
 * Created by rafaelfirmino on 21/01/16.
 */
@AmqpProducer(
        amqpQueue = @AmqpQueue(
                name = "simple.queue.2"
        )
)
@Service
public class TestSimpleQueueTwoProducer extends AmqpRabbitProducer<TestSimpleMessage> {

    @Override
    public void beforeSend(TestSimpleMessage message) {
        System.out.println("beforeSend");
    }

    @Override
    public void afterSend(TestSimpleMessage message) {
        System.out.println("afterSend");
    }
}
