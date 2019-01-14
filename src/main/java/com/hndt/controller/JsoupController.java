package com.hndt.controller;

import com.hndt.service.JsoupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Hystar
 * @date 2019/1/7
 */
@Controller
public class JsoupController {

    @Resource
    private JsoupService jsoupService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() throws InterruptedException {
        jsoupService.test();
        return "success";
    }

}
