package com.itheima.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.domain.User;
import com.itheima.domain.UserAnno;
import com.itheima.mapper.UserAnnoMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class UserAnnoTest {

    @Autowired
    private UserAnnoMapper userAnnoMapper;

    @Test
    public void fandAll() {
        List<UserAnno> userAnnoList = userAnnoMapper.findAll();
        Date birthday = userAnnoList.get(0).getBirthday();
        System.out.println(birthday);
        System.out.println(userAnnoList);
    }

    @Test
    public void save() {
        UserAnno userAnno = new UserAnno();
        userAnno.setId(2);
        userAnno.setBirthday(new Date());
        userAnnoMapper.save(userAnno);
    }

    @Test
    public void fandOne() {
        UserAnno one = userAnnoMapper.findOne(1);
        System.out.println(one);
//        Date birthday = userAnnoMapper.findOne(1).getBirthday();
//        System.out.println(birthday);
    }


}
