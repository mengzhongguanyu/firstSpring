package com.mzgy.one.impl;

import com.mzgy.one.Comport;
import org.springframework.stereotype.Component;

/**
 * Created by mypc on 2017/9/27.
 */
@Component
public class comportImpl implements Comport {

    @Override
    public void hello() {
        System.out.println("Hello");
    }
}
