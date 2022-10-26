package com.gabriel.pojo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class QueryParm implements Serializable {

    private String[] ids;
    private List<String> idList;

    public QueryParm() {
    }

    public QueryParm(String[] ids, List<String> idList) {
        this.ids = ids;
        this.idList = idList;
    }

    public String[] getIds() {
        return ids;
    }

    public void setIds(String[] ids) {
        this.ids = ids;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    @Override
    public String toString() {
        return "QueryParm{" +
                "ids=" + Arrays.toString(ids) +
                ", idList=" + idList +
                '}';
    }
}
