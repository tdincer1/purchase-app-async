package com.tdincer.purchaseappasync.service;

import com.tdincer.purchaseappasync.dto.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PurchaseService {

    @Autowired
    private MailService mailService;

    public String purchase(Item item, String userMail) throws InterruptedException {

        log.info("purchase ongoing for " + item.getName());

        mailService.sendMail(userMail, item.getId());

        log.info("purchase completed!");

        return "success!";
    }
}
