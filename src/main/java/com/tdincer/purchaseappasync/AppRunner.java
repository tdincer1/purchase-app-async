package com.tdincer.purchaseappasync;

import com.tdincer.purchaseappasync.dto.Item;
import com.tdincer.purchaseappasync.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class AppRunner implements CommandLineRunner {

    private final PurchaseService service;

    @Override
    public void run(String... args) throws Exception {

        long start = System.currentTimeMillis();

        service.purchase(new Item(1, "pan", 1), "haile_selassie@mail.com");
        service.purchase(new Item(2, "leather jacket", 1), "ryangosling@mail.com");
        service.purchase(new Item(3, "cookie", 1), "cookiemonster@mail.com");

        log.info("Elapsed time: " + (System.currentTimeMillis() - start));
    }
}
