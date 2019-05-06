package com.baojiong.dubbo.controller;

import com.baojiong.dubbo.service.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by baojiong on 2018/8/15 18:40
 */
@RestController
public class BaseController {

    @Autowired
    private UseService useService;

    @RequestMapping(value = "/printf")
    public void printf(){
        useService.printftest();
    }

}
