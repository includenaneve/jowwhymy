package com.tancky.controller;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.tancky.repository.impl.po.UserAccountPO;
import com.tancky.rest.api.UserRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tancky on 2017/8/24.
 */


@RestController
@RequestMapping("/api")
public class UserController {



    @Autowired
    private UserRestService userRestService;


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public UserAccountPO getUserAccountById(@PathVariable("id") Integer id){
        return userRestService.getUserAccountPOById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserAccountPO getUserAccountById(){
        return userRestService.getUserAccountPOById(1);
    }



    /*@RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUserAccountByIds() {
        return "hello";
    }*/

}
