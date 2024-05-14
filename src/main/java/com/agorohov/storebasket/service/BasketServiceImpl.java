package com.agorohov.storebasket.service;

import com.agorohov.storebasket.dto.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    private final List<Item> basket;

    public BasketServiceImpl() {
        basket = new ArrayList<>();
    }

    @Override
    public List<Item> addItemsToBasket(int... id) {
        List<Item> addedItems = new ArrayList<>();
        for (int i : id) {
            addedItems.add(new Item(i));
        }
        basket.addAll(addedItems);
        return addedItems;
    }

    @Override
    public List<Item> getItemsFromBasket() {
        return basket;
    }
}
