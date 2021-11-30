package com.fcw.footballclubweb.service.impl;

import com.fcc.footballclubcommon.util.PageUtil;
import com.fcw.footballclubweb.entity.Player;
import com.fcw.footballclubweb.dao.PlayerDao;
import com.fcw.footballclubweb.service.PlayerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Player)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 21:16:02
 */
@Service("playerService")
public class PlayerServiceImpl implements PlayerService {
    @Resource
    private PlayerDao playerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param playerId 主键
     * @return 实例对象
     */
    @Override
    public Player queryById(String playerId) {
        return this.playerDao.queryById(playerId);
    }

    /**
     * 分页查询
     *
     * @param player 筛选条件
     * @return 查询结果
     */
    @Override
    public PageUtil<Player> queryByPage(Player player) {
        return new PageUtil<Player>();
    }

    /**
     * 新增数据
     *
     * @param player 实例对象
     * @return 实例对象
     */
    @Override
    public Player insert(Player player) {
        this.playerDao.insert(player);
        return player;
    }

    /**
     * 修改数据
     *
     * @param player 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Player player) {
        return this.playerDao.update(player);
    }

    /**
     * 通过主键删除数据
     *
     * @param playerId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String playerId) {
        return this.playerDao.deleteById(playerId) > 0;
    }
}
