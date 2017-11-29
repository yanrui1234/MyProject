package com.migu.service;

import com.migu.Util.CommonUtil;
import com.migu.dao.CinemaDataDao;
import com.migu.domain.CinemaData;
import com.migu.persistence.CinemaDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("cinemaDataServiceImpl")
public class CinemaDataServiceImpl implements CinemaDataService{
    @Resource
    private CinemaDataMapper cinemaDataMapper;
    @Resource
    private CommonUtil commonUtil;
    private String resultPath;


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

    public String getResultPath() {
        return resultPath;
    }

    public void setResultPath(String resultPath) {
        this.resultPath = resultPath;
    }
}
