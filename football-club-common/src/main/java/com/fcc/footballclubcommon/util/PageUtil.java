package com.fcc.footballclubcommon.util;

import lombok.Data;

import java.util.List;

@Data
public class PageUtil<T> {
    private Integer pageSize;
    private Integer PageNo;
    private List<T> list;
    private Integer total;
    
    public PageUtil(){}

    public PageUtil(Integer pageSize, Integer pageNo, Integer total, List<T> list) {
        this.pageSize = pageSize;
        this.PageNo = pageNo;
        this.total = total;
        if(((pageNo-1) * pageSize + pageSize) < total - 1){
            this.list = list.subList((pageNo-1) * pageSize,(pageNo-1) * pageSize + pageSize);
        }else{
            this.list = list.subList((pageNo-1) * pageSize,total);
        }
    }
}
