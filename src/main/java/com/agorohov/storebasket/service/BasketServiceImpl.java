package com.agorohov.storebasket.service;

import com.agorohov.storebasket.model.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl() {
        basket = new Basket();
    }

    @Override
    public List<Integer> addItemsToBasket(int... id) {
        return basket.addItems(id);
    }

    @Override
    public List<Integer> getItemsFromBasket() {
        return basket.getItems();
    }
}
