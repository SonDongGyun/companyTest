package com.example.three.dao;

import com.example.three.model.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {
        public List<Test> selectList(Test test);
}
