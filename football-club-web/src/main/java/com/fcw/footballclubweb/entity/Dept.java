package com.fcw.footballclubweb.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Dept)实体类
 *
 * @author makejava
 * @since 2021-11-30 21:16:02
 */
@Data
public class Dept implements Serializable {
    private static final long serialVersionUID = -61666326952303339L;
    
    private String deptId;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 上级部门，若没有则为空
     */
    private String parentId;

}

