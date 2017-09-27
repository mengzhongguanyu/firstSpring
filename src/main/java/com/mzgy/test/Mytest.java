package com.mzgy.test;

import com.mzgy.config.ComportConfig;
import com.mzgy.one.Comport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by mypc on 2017/9/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComportConfig.class)
public class Mytest {
    @Autowired
    private Comport comport;
    @Test
    public void test1(){
        System.out.println(comport);
    }
}
