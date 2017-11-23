package com.migu.test;

import com.migu.model.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class XmlTest3 {
    public static void main(String[] args){
        System.out.println(System.currentTimeMillis());
        String path1 = "F:\\咪咕";
        String path2 = "D:\\038.xml";
        XmlTest3 xmlTest3 = new XmlTest3();
        xmlTest3.readTicketsXml(path1);
        xmlTest3.readTicketsXml(path2);

        System.out.println(System.currentTimeMillis());
    }

    public void readTicketsXml(String path){
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("BarrageActivity", BarrageActivity.class);
        xstream.alias("propertyFile", PropertyFile.class);
        xstream.alias("displayFile", DisplayFile.class);
        xstream.alias("mediafile", MediaFile.class);
        xstream.alias("keyword", KeyWord.class);
        xstream.alias("copyRight", CopyRight.class);
        xstream.alias("field", Fields.class);
        xstream.alias("content", Content.class);

        try {
            File file = new File(path);
            InputStreamReader o = new FileReader(file);
            Content content =  (Content) xstream.fromXML(o);

            //requset和request1  修改一致
            String xml =  xstream.toXML(content);
            System.out.println(xml);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
