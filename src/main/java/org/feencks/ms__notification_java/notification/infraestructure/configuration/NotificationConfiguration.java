package org.feencks.ms__notification_java.notification.infraestructure.configuration;

import org.feencks.ms__notification_java.notification.application.createNotification.CreateNotificationUseCase;
import org.feencks.ms__notification_java.notification.model.NotificationFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfiguration {

    @Bean
    public CreateNotificationUseCase createNotificationUseCase(NotificationFactory notificationFactory){
        return new CreateNotificationUseCase(notificationFactory);
    }

    @Bean
    public NotificationFactory notificationFactory() {
        return new NotificationFactory();
    }
}
