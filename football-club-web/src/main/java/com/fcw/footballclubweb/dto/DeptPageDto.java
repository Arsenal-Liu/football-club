package com.fcw.footballclubweb.dto;

import com.fcw.footballclubweb.entity.Dept;
import lombok.Data;

@Data
public class DeptPageDto {
    private Dept dept;
    private Integer pageNo;
    private Integer pageSize;
}
