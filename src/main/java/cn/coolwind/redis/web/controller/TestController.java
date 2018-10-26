package cn.coolwind.redis.web.controller;

import cn.coolwind.redis.core.entity.Test;
import cn.coolwind.redis.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/select")
    public Object select(int id) {
        Test test =testService.getById(id);
        return test;
    }

    @GetMapping("/update")
    public void update(int id, String name, String value) {
        Test test = new Test(id,name,value);
        testService.update(test);
    }
}
