package com.sqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.context.annotation.ConditionalOnAwsCloudEnvironment;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;

@EnableSqs
//Exclude the spring cloud auto configuration classes
@SpringBootApplication(exclude = {
        org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfiguration.class,
        org.springframework.cloud.aws.autoconfigure.context.ContextCredentialsAutoConfiguration.class,
        org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration.class,
        org.springframework.cloud.aws.autoconfigure.context.ContextResourceLoaderAutoConfiguration.class,
        org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration.class,
        org.springframework.cloud.aws.autoconfigure.mail.MailSenderAutoConfiguration.class,
        org.springframework.cloud.aws.autoconfigure.cache.ElastiCacheAutoConfiguration.class,
        org.springframework.cloud.aws.autoconfigure.messaging.MessagingAutoConfiguration.class,
        org.springframework.cloud.aws.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfiguration.class,
        org.springframework.cloud.aws.autoconfigure.metrics.CloudWatchExportAutoConfiguration.class
})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
