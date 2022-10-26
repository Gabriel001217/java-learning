package com.gabriel.mapper;

import com.gabriel.pojo.Item;

import java.util.List;

public interface ItemMapper {

    List<Item> queryItems();

    Item queryItemById(Integer id);

    int updateItem(Item item);
}
