package com.beijing.service;

import com.beijing.dao.LiuXueBaoDao;
import com.beijing.domain.YingHang;
import com.beijing.service.exe.Null;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 小韦
 * @Date 2021/10/6 1:51
 * @Version 1.0
 */
public class YingHangServiceInpl implements YingHangService {
    private LiuXueBaoDao liuXueBaoDao;

    public YingHangServiceInpl(LiuXueBaoDao liuXueBaoDao) {
        this.liuXueBaoDao = liuXueBaoDao;
    }

    public void setLiuXueBaoDao(LiuXueBaoDao liuXueBaoDao) {
        this.liuXueBaoDao = liuXueBaoDao;
    }

    @Transactional
    @Override
    public void addMoney(Integer id1, Float money,Integer id2) {

        List<YingHang> pople = liuXueBaoDao.selectPople(id1);
        for (YingHang yingHang : pople) {
            if (yingHang.getMoney()<money){
                throw new RuntimeException("您的余额不足");
            }
        }
        if (id1==null && money<0){
            throw new Null("您输入的金额或者银行账号错误");
        }
        YingHang yingHang1=new YingHang(id1,null,money,null);
        liuXueBaoDao.zhangFang(yingHang1);
        System.out.println("转账成功");
        YingHang yingHang2=new YingHang(id2,null,money,null);
        liuXueBaoDao.updatMoney(yingHang2);
        System.out.println("收账成功");
    }


}
