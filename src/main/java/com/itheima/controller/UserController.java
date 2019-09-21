package com.itheima.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.itheima.domain.User;
import com.itheima.domain.Vo;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAll() {
        List<User> userList = userService.findAll();
        return userList;
    }

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User findById(@PathVariable("id") int id) {
        User user = userService.findById(id);
        return user;
    }

    @RequestMapping(value = "/findByUserName/{userName}", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findByUserName(@PathVariable(value = "userName") String userName) {
        List<User> userList = userService.findByUserName(userName);
        return userList;
    }

    @RequestMapping(value = "/findTotalCount", method = RequestMethod.GET)
    @ResponseBody
    public Integer findTotalCount() {
        Integer totalCount = userService.findTotalCount();
        return totalCount;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String save(@RequestBody User user) {
        userService.save(user);
        return "save....sccess....";
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user) {
        userService.update(user);
        return "update....sccess....";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable("id") int id) {
        userService.delete(id);
        return "delete....sccess....";
    }

    @RequestMapping(value = "/findByCondition", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findByCondition(User user) {
        System.out.println(user);
        List<User> userList = userService.findByCondition(user);
        return userList;
    }

    @RequestMapping(value = "/findByConditionStr/{userStr}", method = RequestMethod.GET)
    @ResponseBody
    public String findByConditionStr(@PathVariable("userStr") String userStr) {
        System.out.println(userStr);
        return userStr;
    }

    @RequestMapping(value = "/findByIds",method = RequestMethod.GET)
    @ResponseBody
    public List<User> findByIds(Vo vo){
        List<Integer> ids = vo.getIds();
        List<User> userList = userService.findByIds(ids);
        return userList;
    }

    //无法接收数据，必须发送ajax请求
    @RequestMapping(value = "/findByIds",method = RequestMethod.POST)
    @ResponseBody
    public void findByIds(@RequestBody List<Integer> ids){
        System.out.println(ids);

//        List<User> userList = userService.findByIds(ids);
//        return userList;
    }






}
