package com.gabriel.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertor implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        System.out.println("进入转换器");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyy-MM-dd");

        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
