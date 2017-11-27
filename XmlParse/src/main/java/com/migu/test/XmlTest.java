package com.migu.test;

import com.migu.domain.CinemaData;
import com.migu.model.*;
import com.migu.persistence.CinemaDataMapper;
import com.migu.service.CinemaDataServiceImpl;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;

public class XmlTest {
    public static void main(String[] args){
        System.out.println("解析开始：" + System.currentTimeMillis());
        String filePath = "D:\\testXml";
        XmlTest xmlTest = new XmlTest();

        //遍历插入数据库测试
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CinemaDataServiceImpl cinemaDataServiceImpl = (CinemaDataServiceImpl) ac.getBean("cinemaDataServiceImpl");
        xmlTest.traverseFolderIntoDB(filePath,cinemaDataServiceImpl.getCinemaDataMapper());

        //遍历写入文件测试
        //xmlTest.traverseFolderIntoFile(filePath);
        System.out.println("解析结束：" + System.currentTimeMillis());
    }



    //递归遍历文件夹
    public void traverseFolderIntoDB(String path, CinemaDataMapper cinemaDataMapper) {
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                //System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        //System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolderIntoDB(file2.getAbsolutePath(), cinemaDataMapper);
                    } else {
                        //System.out.println("文件:" + file2.getAbsolutePath());
                        readXmlToDB(file2, cinemaDataMapper);   //解析
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    public void readXmlToDB(File file, CinemaDataMapper cinemaDataMapper){
        XStream xstream = new XStream(new DomDriver());
        xstream.setMode(XStream.NO_REFERENCES);
        //注册使用了注解的VO
        xstream.processAnnotations(new Class[]{BarrageActivity.class, BarrageActivity.class,
                DisplayFile.class, MediaFile.class, KeyWord.class, CopyRight.class,
                Fields.class, Content.class});
        try {
            //File file = new File(path);
            if(file.exists()){
                InputStreamReader o = new FileReader(file);
                Content content =  (Content) xstream.fromXML(o);

                //写入数据库
                CinemaData cinemaData = new CinemaData();
                //System.out.println("contId = " + content.getContid());
                cinemaData.setContid(content.getContid());
                cinemaDataMapper.insertSelective(cinemaData);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void traverseFolderIntoFile(String path){
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                //System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        //System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolderIntoFile(file2.getAbsolutePath());
                    } else {
                        //System.out.println("文件:" + file2.getAbsolutePath());
                        readXmlToFile(file2);
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    public void readXmlToFile(File file){
        XStream xstream = new XStream(new DomDriver());
        xstream.setMode(XStream.NO_REFERENCES);
        //注册使用了注解的VO
        xstream.processAnnotations(new Class[]{BarrageActivity.class, BarrageActivity.class,
                DisplayFile.class, MediaFile.class, KeyWord.class, CopyRight.class,
                Fields.class, Content.class});

        try {
            //File file = new File(path);
            if(file.exists()){
                InputStreamReader o = new FileReader(file);
                Content content =  (Content) xstream.fromXML(o);
                //写入文件
                String filePath = "D:\\result.txt";
                String data = content.getFields().getMMS_ID() + "," +
                        content.getPRDPACK_ID() + "," +
                        content.getFields().getDISPLAYTYPE() + "," +
                        content.getFields().getAssist() + "," +
                        content.isIsupdating() + "，" +
                        content.getFields().getFORMTYPE() + "," +
                        content.getFields().getCDuration() + "," +
                        content.getFields().getMediaLevel() + "," +
                        content.getFields().getKeywordsCopy() + "," +
                        content.getFields().getRecommendationCopy() + "," +
                        content.getFields().getNameCopy() + "," +
                        content.getFields().getDetailCopy() + "," +
                        content.getFields().getCopyRight().getTerminal();
                this.writeToFile(filePath,data);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void writeToFile(String filePath,String data){
        FileWriter fw = null;
        try {
            //如果文件存在，则追加内容；如果文件不存在，则创建文件
            File f = new File(filePath);
            fw = new FileWriter(f, true);
            fw.write(data);
            fw.write("\r\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
