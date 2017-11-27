package com.migu.test;

import com.migu.domain.CinemaData;
import com.migu.service.CinemaDataService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends SpringTestCase {
    @Autowired
    private CinemaDataService userService;

    @Test
    public void selectUserByIdTest(){
        CinemaData cm = new CinemaData();
        cm.setContid("123456");
        userService.insert(cm);
    }
}
