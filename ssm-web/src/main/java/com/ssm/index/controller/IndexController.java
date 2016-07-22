package com.ssm.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author maoxian
 * @pachage com.ssm.index.controller.
 * @description {TODO}功能描述.
 * @date 16/7/22 下午4:20
 */
@Controller
public class IndexController {


    /**
     * @description 主页跳转.
     * @return 主页
     * @author maoxian 
     * @date 2016-07-22 16:22:54
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
