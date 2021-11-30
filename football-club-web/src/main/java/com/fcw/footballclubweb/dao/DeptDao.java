package com.fcw.footballclubweb.dao;

import com.fcw.footballclubweb.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Dept)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-30 21:16:02
 */
@Mapper
public interface DeptDao {

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    Dept queryById(String deptId);

    /**
     * 全部查询
     *
     * @param dept 查询条件
     * @return 对象列表
     */
    List<Dept> queryAll(Dept dept);
    
    /**
     * 新增数据
     *
     * @param dept 实例对象
     * @return 影响行数
     */
    int insert(Dept dept);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dept> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Dept> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dept> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Dept> entities);

    /**
     * 修改数据
     *
     * @param dept 实例对象
     * @return 影响行数
     */
    int update(Dept dept);

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 影响行数
     */
    int deleteById(String deptId);

}

