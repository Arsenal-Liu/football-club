package com.fcw.footballclubweb.controller;

import com.fcc.footballclubcommon.util.JsonResult;
import com.fcw.footballclubweb.entity.Player;
import com.fcw.footballclubweb.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Player)表控制层
 *
 * @author makejava
 * @since 2021-11-30 21:16:02
 */
@RestController
@RequestMapping("player")
public class PlayerController {
    /**
     * 服务对象
     */
    @Resource
    private PlayerService playerService;

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    @GetMapping
    public JsonResult queryByPage(Player player) {
        return JsonResult.ok(this.playerService.queryByPage(player));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Player> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.playerService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param player 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Player> add(Player player) {
        return ResponseEntity.ok(this.playerService.insert(player));
    }

    /**
     * 编辑数据
     *
     * @param player 实体
     * @return 编辑结果
     */
    @PutMapping
    public JsonResult edit(Player player) {
        return JsonResult.convert(this.playerService.update(player));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.playerService.deleteById(id));
    }

}

