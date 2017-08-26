package com.tancky.repository.impl;

import com.tancky.repository.UserAccountRepository;
import com.tancky.repository.impl.mapper.UserAccountMapper;
import com.tancky.repository.impl.po.UserAccountPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by tancky on 2017/8/18.
 */

@Repository
public class UserAccountRepositoryImpl implements UserAccountRepository {


    @Autowired
    private UserAccountMapper userAccountMapper;


    @Override
    public UserAccountPO getUserAccountPOById(Integer id) {
        return userAccountMapper.getUserAccountPOById(id);
    }
}
