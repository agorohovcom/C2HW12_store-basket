package com.agorohov.storebasket.service;

import com.agorohov.storebasket.dto.Item;

import java.util.List;

public interface BasketService {
    List<Item> addItemToBasket(int... id);
}
