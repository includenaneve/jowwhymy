package com.tancky.repository.impl.po;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by tancky on 2017/8/18.
 */
@Data
public class UserAccountPO {


    private Integer id;


    private String email;


    private String phoneNumber;


    private String password;


    /**
     * 数据状态我
     */
    private Byte dataStatus;


    /**
     * 激活状态
     */
    private Byte activeStatus;


    private LocalDateTime createdAt;


    private LocalDateTime updatedAt;


    private LocalDateTime removedAt;

}
