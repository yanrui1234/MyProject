package com.migu.persistence;

import com.migu.domain.CinemaData;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface CinemaDataMapper extends Mapper<CinemaData> {
}