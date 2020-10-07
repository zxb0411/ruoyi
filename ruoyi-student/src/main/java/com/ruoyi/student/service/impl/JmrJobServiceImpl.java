package com.ruoyi.student.service.impl;

import com.ruoyi.student.domain.JmrJob;
import com.ruoyi.student.mapper.JmrJobMapper;
import com.ruoyi.student.service.IJmrJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("JmrJobServiceImpl")
public class JmrJobServiceImpl implements IJmrJobService {

    @Autowired
    private JmrJobMapper jmrJobMapper;


    @Override
    public List<JmrJob> selectList() {
        return jmrJobMapper.selectList();
    }
}
