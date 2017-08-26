package com.tancky.service.impl;

import com.tancky.repository.UserAccountRepository;
import com.tancky.repository.impl.po.UserAccountPO;
import com.tancky.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tancky on 2017/8/24.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserAccountRepository userAccountRepository;


    @Override
    public UserAccountPO getUserAccountPOById(Integer id) {
        return userAccountRepository.getUserAccountPOById(id);
    }
}
