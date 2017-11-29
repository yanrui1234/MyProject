package com.migu.test;

import com.migu.Util.CommonUtil;
import com.migu.service.CinemaDataServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @Author: yanrui
* @Description:将增量文件直接插入数据库
* @Date: 11:20 2017/11/29 0029
*/
public class ReadToDB {
    public static void main(String[] args){
        System.out.println("解析开始：" + System.currentTimeMillis());
        String filePath = "D:\\testXml\\230";
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CinemaDataServiceImpl cinemaDataServiceImpl = (CinemaDataServiceImpl) ac.getBean("cinemaDataServiceImpl");
        XmlParse xmlParse = new XmlParse(cinemaDataServiceImpl.getCinemaDataMapper(), new CommonUtil());

        try{
            xmlParse.traverse(filePath, true);
        } catch(Exception ex){
            System.out.println("main函数：" + ex.toString());
        }
        System.out.println("解析结束：" + System.currentTimeMillis());
    }
}
