package com.study.container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GoodsBean {
    private ArrayList<Map<String,Object>> lst=new ArrayList<>();

    public GoodsBean() {
        Map<String,Object> item=new HashMap<>();
        item.put("no",1);
        item.put("name","PeterEngland");
        item.put("price", 158.12);
        item.put("quantity","quantity0");
        lst.add(item);
        item=new HashMap<>();
        item.put("no",2);
        item.put("name", "Excaliber");
        item.put("price", 68.53);
        item.put("quantity","quantity1");
        lst.add(item);
        item=new HashMap<>();
        item.put("no",3);
        item.put("name", "Vaun Newman");
        item.put("price", 105.49);
        item.put("quantity","quantity2");
        lst.add(item);
        item=new HashMap<>();
        item.put("no",4);
        item.put("name", "Vills Classic");
        item.put("price", 88.12);
        item.put("quantity","quantity3");
        lst.add(item);
    }


    public ArrayList<Map<String, Object>> getLst() {
        return lst;
    }

    public void setLst(ArrayList<Map<String, Object>> lst) {
        this.lst = lst;
    }
}
