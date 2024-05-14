package com.agorohov.storebasket.controller;

import com.agorohov.storebasket.dto.Item;
import com.agorohov.storebasket.service.BasketService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order", produces = MediaType.APPLICATION_JSON_VALUE)
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(value = "/add")
    public List<Item> addItemToBasket(@RequestParam int... id) {
        return basketService.addItemsToBasket(id);
    }

    @GetMapping(value = "/get")
    public List<Item> getItemsFromBasket() {
        return basketService.getItemsFromBasket();
    }


}
