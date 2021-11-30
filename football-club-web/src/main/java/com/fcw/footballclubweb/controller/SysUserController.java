package com.fcw.footballclubweb.controller;

import com.fcc.footballclubcommon.util.JsonResult;
import com.fcw.footballclubweb.dto.UserPageDto;
import com.fcw.footballclubweb.entity.SysUser;
import com.fcw.footballclubweb.service.SysUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysUser)表控制层
 *
 * @author makejava
 * @since 2021-11-28 14:05:16
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public JsonResult queryByPage(@RequestBody UserPageDto userPageDto) {
        return JsonResult.ok(this.sysUserService.queryByPage(userPageDto));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<SysUser> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.sysUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param sysUser 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<SysUser> add(@RequestBody SysUser sysUser) {
        return ResponseEntity.ok(this.sysUserService.insert(sysUser));
    }

    /**
     * 编辑数据
     *
     * @param sysUser 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public JsonResult edit(@RequestBody SysUser sysUser) {
        return JsonResult.convert(this.sysUserService.update(sysUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @PostMapping("/deleteById")
    public JsonResult deleteById(@RequestParam("id") String id) {
        return JsonResult.convert(this.sysUserService.deleteById(id));
    }

}

