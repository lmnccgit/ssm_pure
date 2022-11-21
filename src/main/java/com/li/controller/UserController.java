package com.li.controller;

import com.li.pojo.User;
import com.li.service.IUserSerivce;
import com.li.service.imp.UserService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author mnli
 * @date 2022/11/20 20:08
 **/
@Controller
//@Slf4j
public class UserController {
    @Autowired
    UserService userSerivce;

    @RequestMapping(value = "test",method = RequestMethod.POST)
    public String testSelect(@RequestBody String body){
        System.out.println("123");
//        log.debug("controller");
        int i = 1;
        if(body!=null&&!"".equals(body)){
            //从body中取出i
            User user = userSerivce.selectUser(i);
            return user.toString();
        }else{
            return "参数异常，请重试";
        }
    }
    @RequestMapping(value = "testGET",method = RequestMethod.GET)
    public String testSelect() {
        User user = userSerivce.selectUser(1);
        return user.toString();
    }

}
