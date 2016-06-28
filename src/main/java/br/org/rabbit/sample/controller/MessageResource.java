package br.org.rabbit.sample.controller;

import br.org.rabbit.sample.producer.TestSimpleQueueTwoProducer;
import br.org.rabbit.sample.producer.model.TestSimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alves on 28/06/16.
 */
@RestController
public class MessageResource {

    @Autowired
    private TestSimpleQueueTwoProducer testSimpleQueueTwoProducer;

    @RequestMapping("/message")
    public TestSimpleMessage message(@RequestParam(value="name", defaultValue="500") int value) {

        TestSimpleMessage message = new TestSimpleMessage(value);

        testSimpleQueueTwoProducer.sendMessage(message);

        return message;
    }
}
