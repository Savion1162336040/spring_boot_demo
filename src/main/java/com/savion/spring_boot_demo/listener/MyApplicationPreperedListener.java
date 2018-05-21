package com.savion.spring_boot_demo.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationPreperedListener implements ApplicationListener<ApplicationPreparedEvent> {
    Logger logger = LoggerFactory.getLogger(MyApplicationPreperedListener.class);
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        logger.info("application on prepered event");
    }
}
