package com.tancky.rest.impl;

import com.tancky.repository.impl.po.UserAccountPO;
import com.tancky.rest.api.UserRestService;
import com.tancky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tancky on 2017/8/24.
 */


@Service
public class UserRestServiceImpl implements UserRestService {

    @Autowired
    private UserService userService;



    @Override
    public UserAccountPO getUserAccountPOById(Integer id) {
        return userService.getUserAccountPOById(id);
    }
}
