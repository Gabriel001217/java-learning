package com.gabriel.mapper;

import com.gabriel.pojo.Item;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemMapper {

    List<Item> queryItems();

    int updateItem(Item item);

    int delItem(@Param("id") Integer itemId);
}
