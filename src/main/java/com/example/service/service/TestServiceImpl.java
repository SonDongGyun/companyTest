package com.example.service.service;

import com.example.service.dao.TestDao;
import com.example.service.model.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestServiceImpl implements TestService {
    @Autowired
    TestDao testDao;

    @Override
    public List<Test> selectList() {
        return testDao.selectList();
    }
}
