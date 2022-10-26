package com.gabriel.service;

import com.gabriel.pojo.Item;

import java.util.List;

public interface ItemService {

    List<Item> queryItems();

    int updateItem(Item item);

    int delItem(Integer itemId);
}
