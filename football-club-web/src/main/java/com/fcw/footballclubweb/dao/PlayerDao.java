package com.fcw.footballclubweb.dao;

import com.fcw.footballclubweb.entity.Player;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Player)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-30 21:16:02
 */
@Mapper
public interface PlayerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param playerId 主键
     * @return 实例对象
     */
    Player queryById(String playerId);

    /**
     * 全部查询
     *
     * @param player 查询条件
     * @return 对象列表
     */
    List<Player> queryAll(Player player);
    
    /**
     * 新增数据
     *
     * @param player 实例对象
     * @return 影响行数
     */
    int insert(Player player);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Player> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Player> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Player> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Player> entities);

    /**
     * 修改数据
     *
     * @param player 实例对象
     * @return 影响行数
     */
    int update(Player player);

    /**
     * 通过主键删除数据
     *
     * @param playerId 主键
     * @return 影响行数
     */
    int deleteById(String playerId);

}

