package org.feencks.ms__notification_java.integration;

import org.feencks.ms__notification_java.notification.application.createNotification.CreateNotificationUseCase;
import org.feencks.ms__notification_java.notification.infraestructure.createNotification.NotificationController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = NotificationController.class)
public class ControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CreateNotificationUseCase createNotificationUseCase;

    @Test
    void test() throws Exception {
        mockMvc.perform(post("/notification")
                .contentType("application/json"))
                .andExpect(status().isCreated());
        Mockito.verify(createNotificationUseCase).execute();
    }

}
