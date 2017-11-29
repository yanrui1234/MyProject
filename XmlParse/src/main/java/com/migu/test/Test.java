package com.migu.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws  Exception{
        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = "2017-03-15 14:59:59";
        try{
            Date dd = sdf.parse(str);
            System.out.println(dd);
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
