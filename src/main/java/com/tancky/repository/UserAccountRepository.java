package com.tancky.repository;

import com.tancky.repository.impl.po.UserAccountPO;

/**
 * Created by tancky on 2017/8/18.
 */
public interface UserAccountRepository {

    UserAccountPO getUserAccountPOById(Integer id);


}
