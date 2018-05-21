package com.savion.spring_boot_demo;

import com.savion.spring_boot_demo.listener.MyApplicationPreperedListener;
import com.savion.spring_boot_demo.listener.MyApplicationStartEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBootDemoApplication.class, args);
        SpringApplication application = new SpringApplication(SpringBootDemoApplication.class);
        application.addListeners(new MyApplicationStartEventListener(),new MyApplicationPreperedListener());
        application.run(args);
    }

}
