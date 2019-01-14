package com.hndt.init;

import com.hndt.service.JsoupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Hystar
 * @date 2019/1/10
 */
@Component
@Slf4j
public class InitProject implements ApplicationRunner {

    @Resource
    private JsoupService jsoupService;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("程序开始执行");
        jsoupService.test();
    }
}
