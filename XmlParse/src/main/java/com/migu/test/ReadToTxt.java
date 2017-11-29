package com.migu.test;

import com.migu.Util.CommonUtil;

/**
* @Author: yanrui
* @Description:将全量文件写入txt文本
* @Date: 11:21 2017/11/29 0029
*/
public class ReadToTxt {
    public static void main(String[] args){
        System.out.println("解析开始：" + System.currentTimeMillis());
        String filePath = "D:\\testXml";
        String resultPath = "D:\\result.txt";

        XmlParse xmlParse = new XmlParse(resultPath, new CommonUtil());
        try{
            xmlParse.traverse(filePath, false);
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
        System.out.println("解析结束：" + System.currentTimeMillis());
    }
}
