package com.migu.Util;

import com.migu.domain.CinemaData;
import com.migu.model.Content;
import com.migu.model.PropertyFile;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

@Component
public class CommonUtil {

    //为CinemaData各个字段赋值
    public CinemaData setCinemaData(Content content) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        if(content != null) {
            CinemaData cinemaData = new CinemaData();
            cinemaData.setContid(content.getContid());
            //fields
            cinemaData.setPackid(content.getPRDPACK_ID());
            //limitDate
            cinemaData.setContdisplaytype(content.getFields().getDISPLAYTYPE());
            cinemaData.setContassist(content.getFields().getAssist());
            cinemaData.setIsupdating(content.getIsupdating());
            cinemaData.setContformtype(content.getFields().getFORMTYPE());
            cinemaData.setContduration(content.getFields().getCDuration());
            cinemaData.setContmedialevel(content.getFields().getMediaLevel());
            cinemaData.setKeywordscopy(content.getFields().getKeywordsCopy());
            cinemaData.setRecomcopy(content.getFields().getRecommendationCopy());
            cinemaData.setNamecopy(content.getFields().getNameCopy());
            cinemaData.setDetailcopy(content.getFields().getDetailCopy());
            cinemaData.setCopyrightterminal(content.getFields().getCopyRight().getTerminal());
            cinemaData.setProgramid(content.getContid());   //programId对应字段不确定
            //pyFirst
            //salesCategory
            //salesStartTime
            //salesEndTime
            cinemaData.setName(content.getName());
            cinemaData.setPublishtime(sdf.parse(content.getPublishtime()));
            cinemaData.setContname(content.getFields().getName());
            cinemaData.setContdetail(content.getFields().getDetail());
            cinemaData.setShortname(content.getFields().getSHORTNAME());
            //doubanScore

            //设置二级分类的值
            List<PropertyFile> propertyFileLists = content.getFields().getPropertyFileLists();
            if (propertyFileLists != null && propertyFileLists.size() > 0) {
                for (PropertyFile propertyFile : propertyFileLists) {
                    switch (propertyFile.getPropertyKey()) {
                        case "内容类型":
                            cinemaData.setMediatype(propertyFile.getPropertyValue());break;
                        case "内容形态":
                            cinemaData.setMediashape(propertyFile.getPropertyValue());break;
                        case "播出年代":
                            cinemaData.setMediayear(propertyFile.getPropertyValue());break;
                        case "名栏":
                            cinemaData.setMediaming(propertyFile.getPropertyValue());break;
                        case "出品方":
                            cinemaData.setMediachu(propertyFile.getPropertyValue());break;
                        case "国家及地区":
                            cinemaData.setMediaarea(propertyFile.getPropertyValue());break;
                        case "G客作品":
                            cinemaData.setMediagkzp(propertyFile.getPropertyValue());break;
                        case "电影形式":
                            cinemaData.setMediamovieform(propertyFile.getPropertyValue());break;
                        case "播出平台":
                            cinemaData.setMediaplat(propertyFile.getPropertyValue());break;
                        case "项目":
                            cinemaData.setMediaproj(propertyFile.getPropertyValue());break;
                        case "是否杜比":
                            cinemaData.setMediaisdubi(propertyFile.getPropertyValue());break;
                        case "导演":
                            cinemaData.setMediadirector(propertyFile.getPropertyValue());break;
                        case "评分":
                            cinemaData.setMediascore(propertyFile.getPropertyValue());break;
                        case "所属片名":
                            cinemaData.setMediavideoname(propertyFile.getPropertyValue());break;
                        case "上映时间":
                            cinemaData.setMediatime(propertyFile.getPropertyValue());break;
                        case "受众年龄":
                            cinemaData.setMedianianling(propertyFile.getPropertyValue());break;
                        case "G客活动":
                            cinemaData.setMediagkhd(propertyFile.getPropertyValue());break;
                        case "报道地区":
                            cinemaData.setMediareportarea(propertyFile.getPropertyValue());break;
                        case "描述地区":
                            cinemaData.setMediamiaoshud(propertyFile.getPropertyValue());break;
                        case "电影形式（不在之列）":
                            cinemaData.setMediamovieformnot(propertyFile.getPropertyValue());break;
                        case "来源":
                            cinemaData.setMedialaiyuan(propertyFile.getPropertyValue());break;
                        case "主演":
                            cinemaData.setMediaactor(propertyFile.getPropertyValue());break;
                    }
                }
            }
            return cinemaData;
        }
        return null;
    }

    public void writeToFile(File file, String data){
        FileWriter fw = null;
        try {
            //如果文件存在，则追加内容；如果文件不存在，则创建文件
            //File f = new File(resultPath);
            fw = new FileWriter(file, true);
            fw.write(data);
            fw.write("\r\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
