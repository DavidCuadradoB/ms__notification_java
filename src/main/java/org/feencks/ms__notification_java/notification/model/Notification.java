package org.feencks.ms__notification_java.notification.model;

import java.util.UUID;

public class Notification {
    private final UUID notificationUuid;

    public Notification() {
        this.notificationUuid = UUID.randomUUID();
    }

    public UUID getNotificationUuid() {
        return notificationUuid;
    }
}
