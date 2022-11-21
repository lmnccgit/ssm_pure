package com.li.service.imp;

import com.li.dao.IUserDao;
import com.li.pojo.User;
import com.li.service.IUserSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mnli
 * @date 2022/11/20 20:28
 **/
@Service
//@Slf4j
public class UserService implements IUserSerivce {
    @Autowired
    IUserDao iUserDao;
    @Override
    public User selectUser(int id) {
//        log.debug("service");
        return iUserDao.selectUser(id);
    }
}
