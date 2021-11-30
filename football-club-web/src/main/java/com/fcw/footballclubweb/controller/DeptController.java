package com.fcw.footballclubweb.controller;

import com.fcc.footballclubcommon.util.JsonResult;
import com.fcw.footballclubweb.dto.DeptPageDto;
import com.fcw.footballclubweb.entity.Dept;
import com.fcw.footballclubweb.service.DeptService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Dept)表控制层
 *
 * @author makejava
 * @since 2021-11-30 21:16:02
 */
@RestController
@RequestMapping("dept")
public class DeptController {
    /**
     * 服务对象
     */
    @Resource
    private DeptService deptService;

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @GetMapping
    public JsonResult queryByPage(@RequestBody DeptPageDto deptPageDto) {
        return JsonResult.ok(this.deptService.queryByPage(deptPageDto));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Dept> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.deptService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param dept 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Dept> add(Dept dept) {
        return ResponseEntity.ok(this.deptService.insert(dept));
    }

    /**
     * 编辑数据
     *
     * @param dept 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Dept> edit(Dept dept) {
        return ResponseEntity.ok(this.deptService.update(dept));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.deptService.deleteById(id));
    }

}

