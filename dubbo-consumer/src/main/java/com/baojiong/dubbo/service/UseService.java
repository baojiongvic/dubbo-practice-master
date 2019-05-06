package com.baojiong.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Created by baojiong on 2018/8/15 19:46
 */
@Component
public class UseService {

    @Reference
    private IUserInfoService userInfoService;

    public void printftest(){
        userInfoService.printf();
    }

}
