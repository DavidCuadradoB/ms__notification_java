package org.feencks.ms__notification_java.notification.application.createNotification;

import org.feencks.ms__notification_java.notification.application.createNotification.response.CreateNotificationResponse;
import org.feencks.ms__notification_java.notification.model.NotificationFactory;

import java.util.UUID;

public class CreateNotificationUseCase {

    private final NotificationFactory notificationFactory;

    public CreateNotificationUseCase(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public CreateNotificationResponse execute() {
        return new CreateNotificationResponse(notificationFactory.createNotification().getNotificationUuid());
    }

}
