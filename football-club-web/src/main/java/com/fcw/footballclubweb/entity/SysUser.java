package com.fcw.footballclubweb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2021-11-28 14:05:18
 */
@Data
public class SysUser implements Serializable {
    private static final long serialVersionUID = 645791652276231600L;
    
    private String id;
    
    private String userName;
    
    private String userAccount;
    
    private String password;
    
    private String userMail;
    
    private String builtIn;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

}

