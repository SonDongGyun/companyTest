package com.example.three.service;

import com.example.three.dao.TestDao;
import com.example.three.model.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestServiceImpl implements TestService {
    @Autowired
    TestDao testDao;

    @Override
    public List<Test> selectList(Test test) {
        return testDao.selectList(test);
    }
}
