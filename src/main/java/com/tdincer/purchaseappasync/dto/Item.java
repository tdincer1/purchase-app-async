package com.tdincer.purchaseappasync.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Item {
    private int id;
    private String name;
    private int quantity;
}
