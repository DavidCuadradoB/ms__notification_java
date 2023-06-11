package org.feencks.ms__notification_java.notification.application.createNotification.response;

import java.util.Objects;
import java.util.UUID;

public class CreateNotificationResponse {
    private UUID notificationUUID;

    public CreateNotificationResponse(UUID notificationUUID) {
        this.notificationUUID = notificationUUID;
    }

    public UUID getNotificationUUID() {
        return notificationUUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateNotificationResponse that = (CreateNotificationResponse) o;
        return Objects.equals(notificationUUID, that.notificationUUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationUUID);
    }
}
