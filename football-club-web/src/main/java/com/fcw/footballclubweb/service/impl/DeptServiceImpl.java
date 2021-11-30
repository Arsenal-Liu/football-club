package com.fcw.footballclubweb.service.impl;

import com.fcc.footballclubcommon.util.PageUtil;
import com.fcw.footballclubweb.dto.DeptPageDto;
import com.fcw.footballclubweb.entity.Dept;
import com.fcw.footballclubweb.dao.DeptDao;
import com.fcw.footballclubweb.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Dept)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 21:16:02
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    @Override
    public Dept queryById(String deptId) {
        return this.deptDao.queryById(deptId);
    }

    /**
     * 分页查询
     *
     * @param dept 筛选条件
     * @return 查询结果
     */
    @Override
    public PageUtil<Dept> queryByPage(DeptPageDto dept) {
        return new PageUtil<Dept>();
    }

    /**
     * 新增数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    @Override
    public Dept insert(Dept dept) {
        this.deptDao.insert(dept);
        return dept;
    }

    /**
     * 修改数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Dept dept) {
        return this.deptDao.update(dept);
    }

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String deptId) {
        return this.deptDao.deleteById(deptId) > 0;
    }
}
