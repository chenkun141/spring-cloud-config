package com.springcloud.config.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author 研发部-陈坤
 * @Date 2018/8/22
 */
@RestController
public class DemoController {


    @Value("${configClient}")
    private String configClient;

    @RequestMapping("/test")
    public String test(){
        return "你好，configClient属性值是"+ configClient;
    }
}
