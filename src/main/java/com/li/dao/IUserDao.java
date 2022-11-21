package com.li.dao;

import com.li.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author mnli
 * @date 2022/11/20 20:29
 **/
@Repository
public interface IUserDao {
    User selectUser(int id);
}
