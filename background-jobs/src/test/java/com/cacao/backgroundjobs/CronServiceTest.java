package com.cacao.backgroundjobs;

import org.awaitility.Duration;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class CronServiceTest {

    @SpyBean
    CronService tasks;

    @Test
    public void reportCurrentTime() {
        await().atMost(Duration.TEN_SECONDS).untilAsserted(() -> {
            verify(tasks, atLeast(2)).reportCurrentTime();
        });
    }
}