package com.migu.test;

import com.migu.Util.CommonUtil;
import com.migu.domain.CinemaData;
import com.migu.model.*;
import com.migu.persistence.CinemaDataMapper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.*;
import java.util.LinkedList;

public class XmlParse {
    private String resultPath;
    private CinemaDataMapper cinemaDataMapper;
    private CommonUtil commonUtil;

    public XmlParse(String resultPath, CommonUtil commonUtil) {
        this.resultPath = resultPath;
        this.commonUtil = commonUtil;
    }

    public XmlParse(CinemaDataMapper cinemaDataMapper, CommonUtil commonUtil) {
        this.cinemaDataMapper = cinemaDataMapper;
        this.commonUtil = commonUtil;
    }

    /**
     * @Author: yanrui
     * @Description:将解析的xml数据写入数据库
     * @Param: * @param
     * @param file 待解析的xml文件
     * @Date: 10:40 2017/11/29 0029
     */
    public void readXmlToDB(File file) throws Exception{
        XStream xstream = new XStream(new DomDriver());
        xstream.setMode(XStream.NO_REFERENCES);
        //注册使用了注解的VO
        xstream.processAnnotations(new Class[]{BarrageActivity.class, BarrageActivity.class,
                DisplayFile.class, MediaFile.class, KeyWord.class, CopyRight.class,
                Fields.class, Content.class, SalesPromotion.class});
        try {
            //File file = new File(path);
            if(file.exists()){
                InputStreamReader o = new FileReader(file);
                Content content =  (Content) xstream.fromXML(o);

                //写入数据库
                CinemaData cinemaData = commonUtil.setCinemaData(content);
                if(cinemaData != null) {
                    this.cinemaDataMapper.insertSelective(cinemaData);
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    /**
     * @Author: yanrui
     * @Description:将解析的xml数据写入txt文件
     * @Param: * @param resultPath txt文件路径
     * @param file 待解析的xml文件
     * @Date: 10:40 2017/11/29 0029
     */
    public void readXmlToTxt(File file) throws Exception{
        XStream xstream = new XStream(new DomDriver());
        xstream.setMode(XStream.NO_REFERENCES);
        //注册使用了注解的VO
        xstream.processAnnotations(new Class[]{BarrageActivity.class,PropertyFile.class,
                DisplayFile.class, MediaFile.class, KeyWord.class, CopyRight.class,
                Fields.class, Content.class, ClientTypeSale.class, Footer.class,
                FreeFlow.class, Label.class, Pkg.class, Program.class, SalesPromotion.class,Ticket.class});

        try {
            //File file = new File(path);
            if(file.exists()){
                InputStreamReader o = new FileReader(file);
                Content content =  (Content) xstream.fromXML(o);
                CinemaData cinemaData = commonUtil.setCinemaData(content);

                if(cinemaData != null) {
                    //contId为主键，不为空
                    if(cinemaData.getContid() != null && cinemaData.getContid().length() > 0) {
                        String str = cinemaData.toString2();
                        if(str != null) {
                            //如果文件存在，则追加内容；如果文件不存在，则创建文件
                            File f = new File(this.resultPath);
                            this.commonUtil.writeToFile(f, str);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * @Author: yanrui
     * @Description:递归遍历文件夹并写入数据库
     * @Param: * @param path 待解析的xml文件路径
     * @Date: 10:39 2017/11/29 0029
     */
    public void traverseFolderIntoDB(String path) throws Exception{

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
                        traverseFolderIntoDB(file2.getAbsolutePath());
                    } else {
                        //System.out.println("文件:" + file2.getAbsolutePath());
                        readXmlToDB(file2);   //解析
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    /**
     * @Author: yanrui
     * @Description: 递归遍历文件夹并写入文件
     * @Param: * @param path 待解析的xml文件路径
     * @Date: 10:36 2017/11/29 0029
     */
    public void traverseFolderIntoFile(String path) throws Exception{
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length > 0) {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        //System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolderIntoFile(file2.getAbsolutePath());
                    } else {
                        //System.out.println("文件:" + file2.getAbsolutePath());
                        readXmlToTxt(file2);
                    }
                }
            } else {
                System.out.println("文件夹是空的!");
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    /**
     * @Author: yanrui
     * @Description: 非递归遍历文件夹并写入文件或数据库
     * @Param: * @param path 待解析的xml文件路径
     * @param isToDB  是否插入数据库
     * @Date: 10:36 2017/11/29 0029
     */
    public void traverse(String path, boolean isToDB){
        File file = new File(path);
        if (file.exists()) {
            if (file.isFile()) {
                try{
                    if (isToDB) {
                        readXmlToDB(file);
                    } else {
                        readXmlToTxt(file);
                    }
                }catch (Exception ex){
                    System.out.println("traverseIntoTxt:" + ex.toString());
                }
                return;
            }

            LinkedList<File> list = new LinkedList<File>();
            File[] files = file.listFiles();
            transferFile(files, list, isToDB);

            File temp_file;
            while (!list.isEmpty()) {
                temp_file = list.removeFirst();
                files = temp_file.listFiles();
                transferFile(files, list, isToDB);
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    public void transferFile(File[] files, LinkedList<File> fileLinkedList, boolean isToDB){
        if (files.length > 0) {
            for (File file2 : files) {
                if (file2.isDirectory()) {
                    fileLinkedList.add(file2);
                } else {
                    //解析文件
                    try{
                        if (isToDB) {
                            readXmlToDB(file2);
                        } else {
                            readXmlToTxt(file2);
                        }
                    } catch(Exception ex) {
                        System.out.println("transferFileIntoTxt:" + ex.toString());
                    }
                }
            }
        }
    }

    public String getResultPath() {
        return resultPath;
    }

    public void setResultPath(String resultPath) {
        this.resultPath = resultPath;
    }

    public CinemaDataMapper getCinemaDataMapper() {
        return cinemaDataMapper;
    }

    public void setCinemaDataMapper(CinemaDataMapper cinemaDataMapper) {
        this.cinemaDataMapper = cinemaDataMapper;
    }

    public CommonUtil getCommonUtil() {
        return commonUtil;
    }

    public void setCommonUtil(CommonUtil commonUtil) {
        this.commonUtil = commonUtil;
    }
}
