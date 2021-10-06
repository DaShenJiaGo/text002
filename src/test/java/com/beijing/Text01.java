package com.beijing;

import com.beijing.service.YingHangService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 小韦
 * @Date 2021/10/6 2:21
 * @Version 1.0
 */
public class Text01 {
    @Test
    public void updatMoney(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        YingHangService yingHang = (YingHangService) ac.getBean("buyYingHang");
        yingHang.addMoney(1001, 3000000F,1002);
    }
}
