package com.fcw.footballclubweb.service.impl;

import com.fcc.footballclubcommon.util.PageUtil;
import com.fcw.footballclubweb.dto.UserPageDto;
import com.fcw.footballclubweb.service.SysUserService;
import com.fcw.footballclubweb.entity.SysUser;
import com.fcw.footballclubweb.dao.SysUserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysUser)表服务实现类
 *
 * @author makejava
 * @since 2021-11-28 14:05:20
 */
@Slf4j
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUser queryById(String id) {
        return this.sysUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @Override
    public PageUtil<SysUser> queryByPage(UserPageDto userPageDto) {
        List<SysUser> list = this.sysUserDao.queryAll(userPageDto.getSysUser());
        return new PageUtil<SysUser>(userPageDto.getPageNo(), userPageDto.getPageSize(), list.size(), list);
    }

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser insert(SysUser sysUser) {
        this.sysUserDao.insert(sysUser);
        log.info("添加了一个新用户："+sysUser.getUserName());
        return sysUser;
    }

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public int update(SysUser sysUser) {
        return this.sysUserDao.update(sysUser);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(String id) {
        return this.sysUserDao.deleteById(id);
    }
}
