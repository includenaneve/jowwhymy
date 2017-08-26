package com.tancky.repository.impl.mapper;

import com.tancky.repository.impl.mapper.typehandler.LocalDateTimeHandler;
import com.tancky.repository.impl.po.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by tancky on 2017/8/18.
 */

@Component
public interface UserAccountMapper {


    @Results(id = "UserAccountPO", value = {
            @Result(property = "id", column = "id", javaType = Integer.class, jdbcType = JdbcType.INTEGER, id = true),
            @Result(property = "email", column = "email", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "phoneNumber", column = "phone_number", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Result(property = "password", column = "password", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "activeStatus", column = "active_status", javaType = Byte.class, jdbcType = JdbcType.TINYINT),
            @Result(property = "dataStatus", column = "data_status", javaType = Byte.class, jdbcType = JdbcType.TINYINT),
            @Result(property = "createdAt", column = "created_at", javaType = Timestamp.class, jdbcType = JdbcType.TIMESTAMP, typeHandler = LocalDateTimeHandler.class),
            @Result(property = "updatedAt", column = "updated_at", javaType = Timestamp.class, jdbcType = JdbcType.TIMESTAMP, typeHandler = LocalDateTimeHandler.class),
            @Result(property = "removedAt", column = "remove_at", javaType = Timestamp.class, jdbcType = JdbcType.TIMESTAMP, typeHandler = LocalDateTimeHandler.class)
    })
    @Select("select * from user_account where id = #{id}")
    UserAccountPO getUserAccountPOById(@Param("id") Integer id);


}
