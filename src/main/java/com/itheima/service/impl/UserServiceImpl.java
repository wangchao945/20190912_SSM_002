package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAll() {
        System.out.println("service.....");
        return userMapper.findAll();
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findByUserName(String userName) {
        return userMapper.findByUserName("%"+userName+"%");
    }

    @Override
    public Integer findTotalCount() {
        return userMapper.findTotalCount();
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(int id) {
        userMapper.delete(id);
    }

    @Override
    public List<User> findByCondition(User user) {
        return userMapper.findByCondition(user);
    }

    @Override
    public List<User> findByIds(List<Integer> ids) {
        return userMapper.findByIds(ids);
    }
}
