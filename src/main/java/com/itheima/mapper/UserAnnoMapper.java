package com.itheima.mapper;

import com.itheima.domain.User;
import com.itheima.domain.UserAnno;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserAnnoMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<UserAnno> findAll();


    /**
     * 向数据表中添加一条记录
     */
    void save(UserAnno userAnno);

    UserAnno findOne(Integer id);


}
