package com.agorohov.storebasket.service;

import java.util.List;

public interface BasketService {
    List<Integer> addItemsToBasket(int... id);

    List<Integer> getItemsFromBasket();
}
