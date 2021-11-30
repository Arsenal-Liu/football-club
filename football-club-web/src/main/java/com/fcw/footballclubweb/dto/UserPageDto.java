package com.fcw.footballclubweb.dto;

import com.fcw.footballclubweb.entity.SysUser;
import lombok.Data;

@Data
public class UserPageDto {
    private SysUser sysUser;
    private Integer pageNo;
    private Integer pageSize;
}
