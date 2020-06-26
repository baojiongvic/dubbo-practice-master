package com.baojiong.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojiong.dubbo.service.IUserInfoService;

/**
 * @author by baojiong on 2018/8/15 18:39
 */
@Service
public class IUserInfoServiceImpl implements IUserInfoService {
    /**
     *
     */
    @Override
    public void printf() {
        System.out.println("dubbo success");
    }
}
