package com.o0u0o.controller.shop;

import com.o0u0o.service.shop.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Author aiuiot
 * @Date 2020/5/24 5:38 下午
 * @Descripton:  用户测试
 **/
@ApiIgnore
@RestController
public class StuFooController {

    @Autowired
    private StuService stuService;

    @GetMapping("/getStu")
    public Object getStu(int id){
        return stuService.getStuInfo(id);
    }

    @PostMapping("/saveStu")
    public Object saveStu(){
        stuService.saveStu();
        return "OK";
    }

    @PostMapping("/updateStu")
    public Object updateStu(int id){
        stuService.upateStu(id);
        return "OK";
    }

    @PostMapping("/deleteStu")
    public Object deleteStu(int id){
        stuService.deleteStu(id);
        return "OK";
    }
}
