package com.gabriel.service;

import com.gabriel.pojo.Item;

import java.util.List;

public interface ItemService {

    List<Item> queryItems();

    Item queryItemById(Integer id);

    int updateItem(Item item);
}
