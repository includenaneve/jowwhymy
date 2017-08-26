package com.tancky.service;

import com.tancky.repository.UserAccountRepository;
import com.tancky.repository.impl.po.UserAccountPO;

/**
 * Created by tancky on 2017/8/24.
 */
public interface UserService {




    UserAccountPO getUserAccountPOById (Integer id);
}
