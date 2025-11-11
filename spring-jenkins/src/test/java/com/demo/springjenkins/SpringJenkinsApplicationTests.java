package com.demo.springjenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {

    static Logger logger = Logger.getLogger(SpringJenkinsApplicationTests.class.getName());

    @Test
    void contextLoads() {
        logger.info("Test Case Executing..!");
        logger.info("Test Case Executing second statement..!");
        assertEquals(true, true);
    }

}
