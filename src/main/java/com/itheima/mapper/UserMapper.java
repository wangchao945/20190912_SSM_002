package com.itheima.mapper;

import com.itheima.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();


    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findById(int id);

    /**
     * 根据用户名称模糊查询用户的数据
     * @param username
     * @return
     */
    List<User> findByUserName(String username);

    /**
     * 查询总记录数
     */
    Integer findTotalCount();

    /**
     * 向数据表中添加一条记录
     */
    void save(User user);

    /**
     * 修改当前添加的记录
     */
    void update(User user);

    /**
     * 删除当前添加的记录
     */
    void delete(int id);

    /**
     * 不确定的条件查询
     */
    List<User> findByCondition(User user);

    /**
     * 根据ids查询
     */
    List<User> findByIds(List<Integer> ids);
}
