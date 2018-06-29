package com.myTest.dao;
import org.apache.log4j.Logger;
import com.alibaba.fastjson.JSON;
import com.myTest.model.UblUser;
import com.myTest.service.UblUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UblUsertest {
    private static Logger logger = Logger.getLogger(UblUsertest.class);

    @Autowired
    private UblUserService ublUserService;

    @Test
    public void testSelectUser() throws Exception {
        int id = 1;
        UblUser user = ublUserService.selectUser(id);
        logger.info(JSON.toJSONString(user));
    }
}
