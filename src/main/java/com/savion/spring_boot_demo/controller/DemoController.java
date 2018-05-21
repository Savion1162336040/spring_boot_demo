package com.savion.spring_boot_demo.controller;

import com.savion.spring_boot_demo.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {

    @Autowired
    User user;

    Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String requestName(@PathVariable("name") String name) {
        logger.info("requestName for name");
        logger.info("requestName from:" + user.getName());
        return String.format("name = %s", user.getName());
    }

    @RequestMapping(value = "/map/{key}={value}", method = RequestMethod.GET)
    public String requestName(@PathVariable("key") String key, @PathVariable("value") String value) {
        logger.info("requestName for keymap");
        return String.format("%s = %s", key, value);
    }

    @RequestMapping(value = "/port", method = RequestMethod.GET)
    public String requestPort() {
        return user.getPort();
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String requestName() {
        return user.getName();
    }

    @RequestMapping(value = "/path", method = RequestMethod.GET)
    public String requestPath() {
        return user.getContextPath();
    }

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public String requestAddress() {
        return user.getAddrss();
    }

    @RequestMapping(value = "/version",method = RequestMethod.GET)
    public String requestVersion(){
        Package pa = SpringBootVersion.class.getPackage();
        return SpringBootVersion.getVersion();
    }


}
