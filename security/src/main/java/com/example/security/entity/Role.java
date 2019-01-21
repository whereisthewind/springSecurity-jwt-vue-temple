package com.example.security.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

/**
 * @Autoor:杨文彬
 * @Date:2019/1/4
 * @Description：
 */
@Data
public class Role {

    private Integer id;


    private String rolename;

    private String roledesc;

    private Timestamp createTime;


    //权限的列表
    private Set<Permission> permissions;
}
