package com.example.service.dao;

import com.example.service.model.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {
        public List<Test> selectList();
}
