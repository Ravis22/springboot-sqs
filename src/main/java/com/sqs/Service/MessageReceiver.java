package com.sqs.Service;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class MessageReceiver {
    @Autowired
    AmazonSQSAsync amazonSQSAsync;// = AmazonSQSClientBuilder.defaultClient();
    @SqsListener("reminder")
    @GetMapping("/")
    public void receiveMessage(String message){
        System.out.println(message);
    }
}
