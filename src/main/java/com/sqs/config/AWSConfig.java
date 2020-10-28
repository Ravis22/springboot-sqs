package com.sqs.config;

import org.springframework.cloud.aws.context.annotation.ConditionalOnAwsCloudEnvironment;
import org.springframework.context.annotation.Import;

/**
 * Enable configuration as per the need
 */
@ConditionalOnAwsCloudEnvironment
@Import({
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
public class AWSConfig {
}
