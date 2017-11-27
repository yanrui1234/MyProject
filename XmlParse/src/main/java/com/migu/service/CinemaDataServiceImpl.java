package com.migu.service;

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
    @Override
    public void insert(CinemaData cinemaData) {

    }

    public CinemaDataMapper getCinemaDataMapper() {
        return cinemaDataMapper;
    }

    public void setCinemaDataMapper(CinemaDataMapper cinemaDataMapper) {
        this.cinemaDataMapper = cinemaDataMapper;
    }
}
