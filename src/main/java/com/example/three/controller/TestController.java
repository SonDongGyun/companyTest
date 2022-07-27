package com.example.three.controller;

import com.example.three.dao.TestDao;
import com.example.three.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class TestController {

    @Autowired
    TestDao testDao;

    @PostMapping("/main.do")
    public List<Test> main( @RequestParam Map<String, Object> param){
        Test test = new Test();
        System.out.println(param);
        test.setClaim_date(param.get("test").toString());
        List<Test> list = testDao.selectList(test);
        return list;
    }

}
