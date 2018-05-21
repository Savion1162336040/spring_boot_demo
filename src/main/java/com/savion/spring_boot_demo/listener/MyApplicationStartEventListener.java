package com.savion.spring_boot_demo.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationStartEventListener implements ApplicationListener<ApplicationStartedEvent> {
    Logger logger = LoggerFactory.getLogger(MyApplicationStartEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        logger.info("application on startevent");
        SpringApplication springApplication = applicationStartedEvent.getSpringApplication();
        springApplication.setBannerMode(Banner.Mode.OFF);
    }
}
