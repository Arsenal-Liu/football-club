package com.fcw.footballclubweb.service;

import com.fcc.footballclubcommon.util.PageUtil;
import com.fcw.footballclubweb.dto.DeptPageDto;
import com.fcw.footballclubweb.entity.Dept;

/**
 * (Dept)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 21:16:02
 */
public interface DeptService {

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    Dept queryById(String deptId);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    PageUtil<Dept> queryByPage(DeptPageDto deptPageDto);

    /**
     * 新增数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    Dept insert(Dept dept);

    /**
     * 修改数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    int update(Dept dept);

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 是否成功
     */
    boolean deleteById(String deptId);

}
