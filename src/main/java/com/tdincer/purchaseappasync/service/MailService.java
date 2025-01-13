package com.tdincer.purchaseappasync.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MailService {

    @Async("mailTaskExecutor")
    public void sendMail(String mailAddress, int itemId) throws InterruptedException {
        log.info(String.format("sending mail to %s for %d", mailAddress, itemId));
        Thread.sleep(2000L);
        log.info("mail sent!");
    }
}
