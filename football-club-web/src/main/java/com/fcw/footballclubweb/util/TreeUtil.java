package com.fcw.footballclubweb.util;

import com.fcw.footballclubweb.entity.Dept;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TreeUtil {
    private class DeptDto{
        public String deptId;
        public String deptName;
        public String parentId;
        public List<DeptDto> list;
    }

    private List<DeptDto> getDeptRoot(List<Dept> list){
        List<DeptDto> newList = new ArrayList<>();
        for(Dept dept : list){
            if(dept.getParentId().isEmpty()){
                DeptDto deptDto = new DeptDto();
                deptDto.deptId = dept.getDeptId();
                deptDto.deptName = dept.getDeptName();
                deptDto.parentId = null;
                newList.add(deptDto);
            }
        }
        for(DeptDto deptDto : newList){
            deptDto.list = getDeptTree(deptDto.deptId, list);
        }
        return newList;
    }

    private List<DeptDto> getDeptTree(String parentId,List<Dept> list){
        List<DeptDto> newList = new ArrayList<>();
        for(Dept dept : list){
            if(dept.getParentId().isEmpty()){
                continue;
            }
            if(dept.getParentId().equals(parentId)){
                DeptDto deptDto = new DeptDto();
                deptDto.deptId = dept.getDeptId();
                deptDto.deptName = dept.getDeptName();
                deptDto.parentId = dept.getParentId();
                newList.add(deptDto);
            }
        }
        for(DeptDto deptDto : newList){
            deptDto.list = getDeptTree(deptDto.deptId,list);
        }
        return newList;
    }
}
