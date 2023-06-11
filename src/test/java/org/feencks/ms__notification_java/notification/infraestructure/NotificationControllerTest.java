package org.feencks.ms__notification_java.notification.infraestructure;

import org.feencks.ms__notification_java.notification.application.createNotification.CreateNotificationUseCase;
import org.feencks.ms__notification_java.notification.infraestructure.createNotification.NotificationController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NotificationControllerTest {

    @Mock
    CreateNotificationUseCase createNotificationUseCase;

    @InjectMocks
    private NotificationController notificationController;

    @Test
    void shouldCallUseCase_whenEndpointIsCalled() {
        notificationController.createNotification();
    }
}