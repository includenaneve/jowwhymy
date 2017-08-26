package com.tancky.rest.api;

import com.tancky.repository.impl.po.UserAccountPO;

/**
 * Created by tancky on 2017/8/24.
 */
public interface UserRestService {
    UserAccountPO getUserAccountPOById(Integer id);
}
