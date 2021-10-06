package com.beijing.dao;

import com.beijing.domain.YingHang;

import java.util.List;

/**
 * @Author 小韦
 * @Date 2021/10/6 1:31
 * @Version 1.0
 */
public interface LiuXueBaoDao {
    int updatMoney(YingHang yingHang);
    List<YingHang> selectPople(Integer id);
    int zhangFang(YingHang yingHang);
}
