package com.fcw.footballclubweb.service;

import com.fcc.footballclubcommon.util.PageUtil;
import com.fcw.footballclubweb.dto.UserPageDto;
import com.fcw.footballclubweb.entity.SysUser;

/**
 * (SysUser)表服务接口
 *
 * @author makejava
 * @since 2021-11-28 14:05:19
 */
public interface SysUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUser queryById(String id);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    PageUtil<SysUser> queryByPage(UserPageDto userPageDto);

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser insert(SysUser sysUser);

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    int update(SysUser sysUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(String id);

}
