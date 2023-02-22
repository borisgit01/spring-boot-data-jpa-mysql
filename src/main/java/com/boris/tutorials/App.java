package com.boris.tutorials;

import com.boris.tutorials.controller.TutorialController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        LOGGER.debug("main - entering");
        SpringApplication.run(App.class, args);
        LOGGER.debug("main - all done");
    }
}
