package org.feencks.ms__notification_java.notification.infraestructure.createNotification;

import org.feencks.ms__notification_java.notification.application.createNotification.CreateNotificationUseCase;
import org.feencks.ms__notification_java.notification.application.createNotification.response.CreateNotificationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class NotificationController {

    private final CreateNotificationUseCase createNotificationUseCase;

    public NotificationController(CreateNotificationUseCase createNotificationUseCase) {
        this.createNotificationUseCase = createNotificationUseCase;
    }

    @PostMapping("/notification")
    public ResponseEntity<CreateNotificationResponse> createNotification() {
        CreateNotificationResponse createNotificationResponse = createNotificationUseCase.execute();
        return new ResponseEntity<>(createNotificationResponse, HttpStatus.CREATED);
    }
}
