package com.cacao.backgroundjobs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class CronServiceApplicationTest {
    @Autowired
    private CronService cronService;

    @Test
    public void contextLoads() {
        // Basic integration test that shows the context starts up properly
        assertThat(cronService).isNotNull();
    }
}