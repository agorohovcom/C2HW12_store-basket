package com.agorohov.storebasket.service;

import com.agorohov.storebasket.dto.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
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
