// package com.example.springbootmanagementexample;
 
// import java.util.Date;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
 
// @RestController
// public class SimpleRestController {
//     @GetMapping("/example")
//     public String example() {
//         return "Hello User !! " + new Date();
//     }
// }

package com.springboot.healthcheck;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class Runner {
 
    private static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);
     
    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
        LOGGER.info("Springboot actuator application is started successfully.");
    }
}
