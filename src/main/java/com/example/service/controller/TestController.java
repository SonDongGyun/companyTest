package com.example.service.controller;

import com.example.service.dao.TestDao;
import com.example.service.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {

    @Autowired
    TestDao testDao;

    @GetMapping("/main.do")
    public List<Test> main(){
        List<Test> list = testDao.selectList();
        return list;
    }

}
