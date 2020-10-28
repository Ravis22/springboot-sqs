package com.sqs.listener;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
    @SqsListener("reminder")
    public void receiveMessage(String message){
        System.out.println(message);
    }
}
