package com.demo.springjenkins;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {

    static Logger logger = Logger.getLogger(SpringJenkinsApplication.class.getName());

    @PostConstruct
    public void inint(){
        logger.info("Application Started");
    }

    public static void main(String[] args) {
        logger.info("Application executed");
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
