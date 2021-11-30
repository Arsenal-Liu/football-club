package com.fcw.footballclubweb.service;

import com.fcc.footballclubcommon.util.PageUtil;
import com.fcw.footballclubweb.entity.Player;

/**
 * (Player)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 21:16:02
 */
public interface PlayerService {

    /**
     * 通过ID查询单条数据
     *
     * @param playerId 主键
     * @return 实例对象
     */
    Player queryById(String playerId);

    /**
     * 分页查询
     *
     * @param player 筛选条件
     * @return 查询结果
     */
    PageUtil<Player> queryByPage(Player player);

    /**
     * 新增数据
     *
     * @param player 实例对象
     * @return 实例对象
     */
    Player insert(Player player);

    /**
     * 修改数据
     *
     * @param player 实例对象
     * @return 实例对象
     */
    int update(Player player);

    /**
     * 通过主键删除数据
     *
     * @param playerId 主键
     * @return 是否成功
     */
    boolean deleteById(String playerId);

}
