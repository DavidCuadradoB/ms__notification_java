package org.feencks.ms__notification_java.notification.application.createNotification;

import org.assertj.core.api.Assertions;
import org.feencks.ms__notification_java.notification.application.createNotification.response.CreateNotificationResponse;
import org.feencks.ms__notification_java.notification.model.Notification;
import org.feencks.ms__notification_java.notification.model.NotificationFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CreateNotificationUseCaseTest {

    @Mock
    NotificationFactory notificationFactory;
    @InjectMocks
    private CreateNotificationUseCase createNotificationUseCase;

    @Test
    void shouldCreateANotification() {
        Notification notification = new Notification();
        Mockito.when(notificationFactory.createNotification()).thenReturn(notification);

        CreateNotificationResponse createNotificationResponse = createNotificationUseCase.execute();

        CreateNotificationResponse expected = new CreateNotificationResponse(notification.getNotificationUuid());
        Assertions.assertThat(createNotificationResponse).isEqualTo(expected);
    }
}