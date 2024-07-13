package com.agorohov.storebasket.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Integer> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public List<Integer> addItems(int... id) {
        List<Integer> addedItems = new ArrayList<>();
        for (int i : id) {
            addedItems.add(i);
        }
        items.addAll(addedItems);
        return addedItems;
    }

    public List<Integer> getItems() {
        return items;
    }
}
