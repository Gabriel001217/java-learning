package com.gabriel.service.Impl;

import com.gabriel.mapper.ItemMapper;
import com.gabriel.pojo.Item;
import com.gabriel.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    public List<Item> queryItems() {
        return itemMapper.queryItems();
    }

    public int updateItem(Item item) {
        return itemMapper.updateItem(item);
    }

    public int delItem(Integer itemId) {
        return itemMapper.delItem(itemId);
    }
}
