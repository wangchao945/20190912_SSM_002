package com.itheima.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.controller.UserController;
import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;


    @Test
    public void fandAll() {
        PageHelper.startPage(2,2);
        Page<User> page = (Page<User>) userMapper.findAll();
        System.out.println(page);
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
    }
    @Test
    public void fandAll1() {
        List<User> userList = userService.findAll();
        System.out.println(userList);
    }


    @Test
    public void fandById() {
        User user = userMapper.findById(2);
        System.out.println(user);
    }

    @Test
    public void findByUserName() {
        List<User> userList = userMapper.findByUserName("%张三%");
        System.out.println(userList);
    }

    @Test
    public void findTotalCount() {
        Integer count = userMapper.findTotalCount();
        System.out.println(count);
    }

    @Test
    public void save() {
        User user = new User(9, "wangli", "123456", "lili");
        userMapper.save(user);
    }

    @Test
    public void update() {
        User user = new User(9, "王莉", "654321", "小猫");
        userMapper.update(user);
    }

    @Test
    public void delete() {
        userMapper.delete(9);
    }
}
