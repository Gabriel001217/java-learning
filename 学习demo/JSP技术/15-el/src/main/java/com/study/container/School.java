package com.study.container;

public class School {
    private String sname;
    private String address;

    public School(String sname, String address) {
        this.sname = sname;
        this.address = address;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
