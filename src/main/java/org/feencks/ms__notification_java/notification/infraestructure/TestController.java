package org.feencks.ms__notification_java.notification.infraestructure;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/health")
    String getTest(){
        return "I'm alive";
    }
}
