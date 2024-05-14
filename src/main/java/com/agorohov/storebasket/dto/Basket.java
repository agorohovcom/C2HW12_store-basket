package com.agorohov.storebasket.dto;

import java.util.ArrayList;
import java.util.List;

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
