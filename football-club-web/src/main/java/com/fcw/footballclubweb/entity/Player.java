package com.fcw.footballclubweb.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Player)实体类
 *
 * @author makejava
 * @since 2021-11-30 21:16:02
 */
@Data
public class Player implements Serializable {
    private static final long serialVersionUID = 246960831793779638L;
    /**
     * 球员id
     */
    private String playerId;
    /**
     * 球员名称
     */
    private String playerName;
    /**
     * 球员号码
     */
    private Integer playerNoun;
    /**
     * 球员年龄
     */
    private Integer playerAge;
    /**
     * 球员位置（1.门将2.后卫3.中场4.前锋）
     */
    private Integer playerPosition;
    /**
     * 加盟时间
     */
    private Date comeTime;

}

