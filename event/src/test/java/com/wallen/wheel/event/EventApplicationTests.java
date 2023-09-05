package com.wallen.wheel.event;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EventApplicationTests {

    @Autowired
    Environment environment;

    public String getPort() {
        return environment.getProperty("local.server.port");
    }

    @Test
    public void testEvent() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("http://localhost:" + getPort() + "/event/notice/aaa", String.class);
    }

}
